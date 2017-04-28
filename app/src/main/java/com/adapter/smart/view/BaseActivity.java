package com.adapter.smart.view;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.adapter.smart.R;
import com.adapter.smart.utils.UtilWidget;

public abstract class BaseActivity extends AppCompatActivity {
    protected Context mContext;
    protected ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);
        mListView = UtilWidget.getView(this,R.id.id_listview);
        mContext = this;
        initPresenter();
    }
    public abstract void initPresenter();


}
