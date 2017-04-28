package com.adapter.smart.view;

import com.adapter.smart.R;
import com.adapter.smart.bean.BeanOneObj;
import com.adapter.smart.common.CommonAdapter;
import com.adapter.smart.presenter.PresenterJsonData;
import com.adapter.smart.viewholder.MutilObjViewHolder;
import com.adapter.smart.viewholder.OneObjViewHolderHelper;

import static com.adapter.smart.constants.ConstantUrl.ONE_OBJECT;
import static com.adapter.smart.constants.DataType.DATA_TYPE_ONE;

public class OneObjActivity extends BaseActivity implements IShowData<BeanOneObj> {

    @Override
    public void initPresenter() {
        new PresenterJsonData(this).getJsonLocal(DATA_TYPE_ONE,ONE_OBJECT);//取本地字符串
    }

    @Override
    public void showList(BeanOneObj bean) {
        mListView.setAdapter(new CommonAdapter<MutilObjViewHolder>(mContext, bean,null, R.layout.no_obj_item, new OneObjViewHolderHelper()));
    }

    @Override
    public void showError(String msg) {

    }
}
