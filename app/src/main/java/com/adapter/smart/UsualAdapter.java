package com.adapter.smart;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.adapter.smart.bean.MocoBean;
import com.adapter.smart.utils.UtilImageloader;

/**
 * Created by smart on 2017/4/24.
 */
public class UsualAdapter extends BaseAdapter {
    private Context mContext;
    private MocoBean mMocoBean;

    public UsualAdapter(Context context, MocoBean mocoBean) {
        mContext = context;
        mMocoBean = mocoBean;
    }

    @Override
    public int getCount() {
        return mMocoBean.getDataList().size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //这部分要做抽取的
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.list_view_item,parent,false);
            viewHolder.name = (TextView) convertView.findViewById(R.id.id_name);
            viewHolder.description = (TextView) convertView.findViewById(R.id.id_description);
            viewHolder.picSmall = (ImageView) convertView.findViewById(R.id.id_picSmall);

        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        convertView.setTag(viewHolder);
        viewHolder.name.setText(mMocoBean.getDataList().get(position).getName());
        viewHolder.description.setText(mMocoBean.getDataList().get(position).getDescription());
        viewHolder.picSmall.setImageResource(R.mipmap.ic_launcher);
        UtilImageloader.setImage(mContext,mMocoBean.getDataList().get(position).getPicSmall(),viewHolder.picSmall);
        return convertView;
    }
    private static class ViewHolder{
        TextView name;
        TextView description;
        ImageView picSmall;
    }
}
