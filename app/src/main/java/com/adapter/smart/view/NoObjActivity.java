package com.adapter.smart.view;

import android.util.Log;
import android.widget.Toast;

import com.adapter.smart.R;
import com.adapter.smart.bean.BeanNoObj;
import com.adapter.smart.presenter.PresenterJsonData;
import com.adapter.smart.viewholder.NoObjViewHolder;
import com.adapter.smart.viewholder.NoObjViewHolderHelper;
import com.smart.holder_library.CommonAdapter;

import static com.adapter.smart.constants.ConstantUrl.NO_OBJECT;
import static com.adapter.smart.constants.DataType.DATA_TYPE_NO;

public class NoObjActivity extends BaseActivity implements IShowData<BeanNoObj> {


    @Override
    public void initPresenter() {
        new PresenterJsonData(this).getJsonLocal(DATA_TYPE_NO,NO_OBJECT);//取本地字符串
    }


    @Override
    public void showList(BeanNoObj bean) {
        mListView.setAdapter(new CommonAdapter<NoObjViewHolder>(mContext,bean,1, R.layout.no_obj_item,new NoObjViewHolderHelper()));
        Log.i("xxx", "showList: "+bean.getMsg());
    }

    @Override
    public void showError(String msg) {
        Toast.makeText(mContext, msg, Toast.LENGTH_LONG).show();
    }
}
