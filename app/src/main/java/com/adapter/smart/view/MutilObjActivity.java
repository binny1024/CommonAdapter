package com.adapter.smart.view;

import android.widget.ListView;
import android.widget.Toast;

import com.adapter.smart.R;
import com.adapter.smart.bean.BeanMutilObj;
import com.adapter.smart.common.CommonAdapter;
import com.adapter.smart.presenter.PresenterJsonData;
import com.adapter.smart.viewholder.MutilObjViewHolder;
import com.adapter.smart.viewholder.MutilObjViewHolderHelper;

import static com.adapter.smart.constants.ConstantUrl.MOCO_URL;

public class MutilObjActivity extends BaseActivity{


    @Override
    public void initView() {
       mListView = (ListView) findViewById(R.id.id_listview);
//        new PresenterJsonData(this).getJsonLocal(TESTJSON);//取本地字符串
        new PresenterJsonData(this).getJsonNet(MOCO_URL);//取本地字符串
    }

    @Override
    public void showList(BeanMutilObj beanMutilData) {
        mListView.setAdapter(new CommonAdapter<MutilObjViewHolder>(mContext, beanMutilData,beanMutilData.getData().size() ,R.layout.list_view_item,new MutilObjViewHolderHelper()));
    }

    @Override
    public void showError(String msg) {
        Toast.makeText(mContext, msg, Toast.LENGTH_LONG).show();
    }
}
