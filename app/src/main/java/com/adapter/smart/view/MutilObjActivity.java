package com.adapter.smart.view;

import android.view.View;
import android.widget.Toast;

import com.adapter.smart.R;
import com.adapter.smart.bean.BeanMutilObj;
import com.adapter.smart.presenter.PresenterJsonData;
import com.adapter.smart.viewholder.MutilObjViewHolder;
import com.adapter.smart.viewholder.MutilObjViewHolderHelper;
import com.smart.holder_library.CommonAdapter;

import static com.adapter.smart.constants.ConstantUrl.MUTIL_OBJECT;
import static com.adapter.smart.constants.DataType.DATA_TYPE_MUTIL;

public class MutilObjActivity extends BaseActivity  implements IShowData<BeanMutilObj> {

    @Override
    public void initPresenter() {
//       mListView = UtilWidget.getView(this,R.id.id_listview);
        new PresenterJsonData(this).getJsonLocal(DATA_TYPE_MUTIL,MUTIL_OBJECT);//取本地字符串
//        new PresenterJsonData(this).getJsonNet(DATA_TYPE_MUTIL,MOCO_URL);//取本地字符串
    }

    @Override
    public void showList(BeanMutilObj beanMutilData) {
        mAnimationDrawable.stop();
        mImageView.setVisibility(View.GONE);
        mListView.setAdapter(new CommonAdapter<MutilObjViewHolder>(mContext, beanMutilData,beanMutilData.getData().size() ,R.layout.list_view_item,new MutilObjViewHolderHelper()));
    }

    @Override
    public void showError(String msg) {
        mAnimationDrawable.stop();
        mImageView.setVisibility(View.GONE);
        Toast.makeText(mContext, msg, Toast.LENGTH_LONG).show();
    }
}
