package com.adapter.smart.view;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.adapter.smart.R;
import com.adapter.smart.bean.BeanOneObj;
import com.adapter.smart.common.CommonAdapter;
import com.adapter.smart.viewholder.MutilObjViewHolder;
import com.adapter.smart.viewholder.OneObjViewHolderHelper;
import com.google.gson.Gson;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.adapter.smart.constants.ConstantUrl.ONE_OBJECT;

public class OneObjActivity extends AppCompatActivity {
    @BindView(R.id.activity_mutil_obj)
    LinearLayout mActivityMutilObj;
    private com.adapter.smart.bean.BeanOneObj mBeanOneObj;
    private Context mContext;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common);
        ButterKnife.bind(this);
        mActivityMutilObj.setBackgroundColor(Color.BLUE);
        mContext = this;
        mListView = (ListView) findViewById(R.id.id_listview);
        oneObject();
    }


    private void oneObject() {
        Gson gson = new Gson();
        mBeanOneObj = new BeanOneObj();
        mBeanOneObj = gson.fromJson(ONE_OBJECT, BeanOneObj.class);

        if (mBeanOneObj != null) {
            //传统的写法
//                        mListView.setAdapter(new UsualAdapter(mContext,mMocoBean));
            //封装后的写法
            mListView.setAdapter(new CommonAdapter<MutilObjViewHolder>(mContext, mBeanOneObj,1, R.layout.no_obj_item, new OneObjViewHolderHelper()));
        }
    }

}
