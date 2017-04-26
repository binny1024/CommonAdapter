package com.adapter.smart.viewholder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;

import com.adapter.smart.R;
import com.adapter.smart.bean.MocoBean;
import com.adapter.smart.common.CommonAdapter;
import com.adapter.smart.utils.UtilImageloader;

/**
 * Created by smart on 2017/4/26.
 */

/*
* 实例化你的viewholder
* 将数据和viewholder的控件绑定
* */
public class MocoViewHolderHelper implements CommonAdapter.ViewHolderCallback<MocoViewHolder,MocoBean> {

    @Override
    public CommonAdapter.IBaseViewHolder initViewHolder(MocoViewHolder viewHolder, @NonNull View convertView) {
        viewHolder = new MocoViewHolder();
        viewHolder.name = CommonAdapter.getView(convertView, R.id.id_name);
        viewHolder.description = CommonAdapter.getView(convertView,R.id.id_description);
        viewHolder.learner = CommonAdapter.getView(convertView,R.id.id_learner);
        viewHolder.picSmall = CommonAdapter.getView(convertView,R.id.id_picSmall);

        return viewHolder;
    }

    @Override
    public void bindView(Context context, MocoBean bean, MocoViewHolder viewHolder, int position) {
        viewHolder.name.setText(bean.getData().get(position).getName());
        viewHolder.description.setText(bean.getData().get(position).getDescription());
        viewHolder.learner.setText("人数："+bean.getData().get(position).getLearner());
        UtilImageloader.setImage(context,bean.getData().get(position).getPicSmall(),viewHolder.picSmall);
    }

}
