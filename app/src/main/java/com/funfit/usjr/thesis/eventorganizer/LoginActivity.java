package com.funfit.usjr.thesis.eventorganizer;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Dj on 2/8/2016.
 */
public class LoginActivity extends AppCompatActivity{
    @Bind(R.id.img_login_bg)
    ImageView mImageLogin;
    @Bind(R.id.text_funfit)
    TextView mTextFunfit;
    @Bind(R.id.text_organizer)
    TextView mTextOrganizer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        Glide.with(this)
                .load(Uri.parse("http://djunabel.com/images/pics/554_djuna-bel-nike-db8.jpg"))
                .centerCrop()
                .into(mImageLogin);
        mTextFunfit.setTypeface(Typeface.createFromAsset(getAssets(), "HelveticaBold.otf"));
        mTextOrganizer.setTypeface(Typeface.createFromAsset(getAssets(), "HelveticaBold.otf"));

    }

    @OnClick(R.id.btn_login)
    public void onClickLogin(){
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}
