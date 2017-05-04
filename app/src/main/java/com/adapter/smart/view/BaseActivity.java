package com.adapter.smart.view;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;

import com.adapter.smart.R;
import com.adapter.smart.utils.UtilWidget;

public abstract class BaseActivity extends AppCompatActivity {
    protected Context mContext;
    protected ListView mListView;
    protected ImageView mImageView;
    protected AnimationDrawable mAnimationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);
        mContext = this;
        mListView = UtilWidget.getView(this,R.id.id_listview);
        mImageView = UtilWidget.getView(this,R.id.id_loading_img);
        mImageView.setImageResource(R.drawable.base_load_animation);
        mAnimationDrawable = (AnimationDrawable) mImageView.getDrawable();
        mAnimationDrawable.start();
        initPresenter();
    }
    public abstract void initPresenter();

}
