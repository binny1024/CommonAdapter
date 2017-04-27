package com.adapter.smart.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.adapter.smart.R;
import com.adapter.smart.bean.BeanNoObj;
import com.adapter.smart.common.CommonAdapter;
import com.adapter.smart.viewholder.MutilObjViewHolder;
import com.adapter.smart.viewholder.NoObjViewHolderHelper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import static com.adapter.smart.constants.ConstantUrl.NO_OBJECT;

public class NoObjActivity extends AppCompatActivity {

    private BeanNoObj mBeanObj;
    private Context mContext;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);

        mContext = this;
        mListView = (ListView) findViewById(R.id.id_listview);
        noObject();
    }

    private void noObject() {
        Gson gson = new Gson();
        mBeanObj = new BeanNoObj();
        mBeanObj = gson.fromJson(NO_OBJECT, new TypeToken<BeanNoObj>(){
        }.getType());

        if (mBeanObj != null) {
            //传统的写法
//                        mListView.setAdapter(new UsualAdapter(mContext,mMocoBean));
            //封装后的写法
            mListView.setAdapter(new CommonAdapter<MutilObjViewHolder>(mContext,mBeanObj, R.layout.no_obj_item,new NoObjViewHolderHelper()));
        }
    }
}
