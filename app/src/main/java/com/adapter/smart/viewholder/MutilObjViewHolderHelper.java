package com.adapter.smart.viewholder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;

import com.adapter.smart.R;
import com.adapter.smart.bean.BeanMutilObj;
import com.adapter.smart.common.CommonAdapter;
import com.adapter.smart.utils.UtilImageloader;

/**
 * Created by smart on 2017/4/26.
 */

/*
* 实例化你的viewholder
* 将数据和viewholder的控件绑定
* */
public class MutilObjViewHolderHelper implements CommonAdapter.ViewHolderCallback<MutilObjViewHolder,BeanMutilObj> {

    @Override
    public CommonAdapter.IBaseViewHolder initViewHolder(MutilObjViewHolder viewHolder, @NonNull View convertView) {
        viewHolder = new MutilObjViewHolder();
        viewHolder.name = CommonAdapter.getView(convertView, R.id.id_name);
        viewHolder.description = CommonAdapter.getView(convertView,R.id.id_description);
        viewHolder.learner = CommonAdapter.getView(convertView,R.id.id_learner);
        viewHolder.picSmall = CommonAdapter.getView(convertView,R.id.id_picSmall);

        return viewHolder;
    }

    @Override
    public void bindView(Context context, BeanMutilObj beanList, MutilObjViewHolder viewHolder, int position) {
        viewHolder.name.setText(beanList.getDataList().get(position).getName());
        viewHolder.description.setText(beanList.getDataList().get(position).getDescription());
        viewHolder.learner.setText("人数："+beanList.getDataList().get(position).getLearner());
        UtilImageloader.setImage(context,beanList.getDataList().get(position).getPicSmall(),viewHolder.picSmall);
    }

}
