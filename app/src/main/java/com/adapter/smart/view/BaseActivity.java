package com.adapter.smart.view;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.adapter.smart.R;

public abstract class BaseActivity extends AppCompatActivity implements IShowMutilData {
    protected Context mContext;
    protected ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);
        mContext = this;
        initView();
    }
    public abstract void initView();
}
