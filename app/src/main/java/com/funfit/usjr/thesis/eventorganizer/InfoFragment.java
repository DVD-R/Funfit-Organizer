package com.funfit.usjr.thesis.eventorganizer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Dj on 2/9/2016.
 */
public class InfoFragment extends Fragment {
    @Bind(R.id.img_qr)
    ImageView mImageQr;
    @Bind(R.id.img_promo)
    ImageView mImagePromo;
    @Bind(R.id.text_title)
    TextView mTextTitle;
    @Bind(R.id.text_location)
    TextView mTextLocation;
    @Bind(R.id.text_date)
    TextView mTextDate;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_info, container, false);
        ButterKnife.bind(this, rootView);

        return rootView;
    }
}
