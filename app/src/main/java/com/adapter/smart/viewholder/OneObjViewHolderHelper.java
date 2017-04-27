package com.adapter.smart.viewholder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;

import com.adapter.smart.R;
import com.adapter.smart.bean.BeanOneObj;
import com.adapter.smart.common.CommonAdapter;

/**
 * Created by smart on 2017/4/26.
 */

public class OneObjViewHolderHelper implements CommonAdapter.ViewHolderCallback<NoObjViewHolder,BeanOneObj> {
    @Override
    public CommonAdapter.IBaseViewHolder  initViewHolder(NoObjViewHolder viewHolder, @NonNull View convertView) {
        viewHolder = new NoObjViewHolder();
        viewHolder.name = CommonAdapter.getView(convertView, R.id.id_name);
        viewHolder.age = CommonAdapter.getView(convertView,R.id.id_age);
        viewHolder.msg = CommonAdapter.getView(convertView,R.id.id_msg);
        viewHolder.status = CommonAdapter.getView(convertView,R.id.id_status);

        return viewHolder;
    }

    @Override
    public void bindView(Context context, BeanOneObj bean, NoObjViewHolder viewHolder, int position) {
        viewHolder.name.setText("名字："+bean.getData().getName());
        viewHolder.age.setText("年龄："+bean.getData().getAge());
        viewHolder.status.setText("状态："+bean.getStatus());
        viewHolder.msg.setText("结果："+bean.getMsg());
    }
}
