package com.adapter.smart.base;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.adapter.smart.bean.MocoBean;

import java.util.List;


/**
 * Created by smart on 2017/4/24.
 */

public class CommonAdapter<H extends CommonAdapter.IBaseViewHolder>  extends BaseAdapter{
    private final int mItemViewLayout;//item布局文件
    private List<MocoBean.DataList> mDataList;
    protected Context mContext;
    private IBaseViewHolder mBaseViewHolder;
    private int mDataListSize;
    private ViewHolderCallback mViewHolderCallback;

    /**
     * @param context 上下文
     * @param dataListSize 数据集（大小）
     * @param itemViewLayout （item的布局文件）
     * @param viewHolderCallback （viewholder的接口）
     */
    public CommonAdapter(Context context,int dataListSize,int itemViewLayout,ViewHolderCallback viewHolderCallback) {
        mContext = context;
        mDataListSize = dataListSize;
        mItemViewLayout = itemViewLayout;
        mViewHolderCallback = viewHolderCallback;
    }

    @Override
    public int getCount() {
        return mDataListSize;
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
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(mItemViewLayout,parent,false);
            mBaseViewHolder = mViewHolderCallback.initView(convertView);
            convertView.setTag(mBaseViewHolder);
        }else {
            mBaseViewHolder = (H)convertView.getTag();
        }
        mViewHolderCallback.bindView(mBaseViewHolder,position);
        return convertView;
    }


    public interface ViewHolderCallback{
        /** 用于初始化ViewHolder
         * @param convertView
         */
        IBaseViewHolder initView(@NonNull View convertView);

        /**用于设置 item中 的每一个控件
         * @param position
         */
       void bindView(IBaseViewHolder baseViewHolder,int position);
    }
    public static <V extends View> V getView(View convertView,int itemViewId){
        return (V) convertView.findViewById(itemViewId);
    }
    /*
    * 你所写的viewholder要继承这个BaseViewHolder
    * */
    public interface IBaseViewHolder {

    }
}
