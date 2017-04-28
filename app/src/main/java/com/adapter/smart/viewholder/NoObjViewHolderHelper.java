package com.adapter.smart.viewholder;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;

import com.adapter.smart.R;
import com.adapter.smart.bean.BeanNoObj;
import com.adapter.smart.common.CommonAdapter;
import com.adapter.smart.utils.UtilWidget;

/**
 * Created by smart on 2017/4/26.
 */

public class NoObjViewHolderHelper implements CommonAdapter.ViewHolderCallback<NoObjViewHolder,BeanNoObj> {
    @Override
    public CommonAdapter.IBaseViewHolder initViewHolder(NoObjViewHolder viewHolder, @NonNull View convertView) {
        viewHolder = new NoObjViewHolder();
        viewHolder.name = UtilWidget.getView(convertView, R.id.id_name);
        viewHolder.age = UtilWidget.getView(convertView,R.id.id_age);
        viewHolder.msg = UtilWidget.getView(convertView,R.id.id_msg);
        viewHolder.status = UtilWidget.getView(convertView,R.id.id_status);

        Log.i("xxx", "initViewHolder: ");
        return viewHolder;
    }

    @Override
    public void bindView(Context context, BeanNoObj bean, NoObjViewHolder viewHolder, int position) {
        viewHolder.name.setText("名字："+bean.getName());
        viewHolder.age.setText("年龄："+bean.getAge());
        Log.i("xxx", "bindView: "+bean.getAge());
        viewHolder.status.setText("状态："+bean.getStatus());
        viewHolder.msg.setText("结果："+bean.getMsg());
    }
}
