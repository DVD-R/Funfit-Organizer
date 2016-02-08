package com.funfit.usjr.thesis.eventorganizer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Dj on 2/8/2016.
 */
public class MainActivity extends AppCompatActivity {
    @Bind(R.id.tabLayout)
    TabLayout mTabLayout;
    @Bind(R.id.main_pager)
    ViewPager mMainPager;
    ViewPagerAdapter mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        setupViewPager();
        mTabLayout.setupWithViewPager(mMainPager);
        mMainPager.setOffscreenPageLimit(3);
    }

    public void setupViewPager() {
        mAdapter.addFragment(new InfoFragment(), "Info");
        mAdapter.addFragment(new ParticipantsFragment(), "Participants");
        mAdapter.addFragment(new RouteFragment(), "Route");
        mMainPager.setAdapter(mAdapter);
    }


    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
