package com.smart.holder_library;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.io.Serializable;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;


/**
 * Created by smart on 2017/4/24.
 */

public class CommonAdapter<ViewHolder extends CommonAdapter.IBaseViewHolder>  extends BaseAdapter{
    private final int mItemViewLayout;//item布局文件
    protected Context mContext;
    private ViewHolder mBaseViewHolder;
    private ViewHolderCallback mViewHolderCallback;
    private BaseBean mBaseBean;
    private int listSize;

    /**
     * @param context 上下文
     * @param baseBean 数据集
     * @param itemViewLayout （item的布局文件）
     * @param viewHolderCallback （viewholder的接口）
     */
    public CommonAdapter(Context context, BaseBean baseBean,Integer listSize,int itemViewLayout, ViewHolderCallback viewHolderCallback) {
        mContext = context;
        mBaseBean = baseBean;
        mItemViewLayout = itemViewLayout;
        mViewHolderCallback = viewHolderCallback;
        if (listSize != null) {
            this.listSize = listSize;
        }else {
            this.listSize = 1;
        }

    }

    @Override
    public int getCount() {
        return listSize;
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
            mBaseViewHolder = (ViewHolder) mViewHolderCallback.initViewHolder(mBaseViewHolder,convertView);
            convertView.setTag(mBaseViewHolder);
        }else {
            mBaseViewHolder = (ViewHolder)convertView.getTag();
        }
        mViewHolderCallback.bindDataToView(mContext,mBaseBean,mBaseViewHolder,position);
        return convertView;
    }


    public interface ViewHolderCallback<BaseViewHolder extends IBaseViewHolder,BaseBean>{
        /** 用于初始化ViewHolder
         * @param convertView
         */
        IBaseViewHolder initViewHolder(BaseViewHolder viewHolder, View convertView);

        /**用于设置 item中 的每一个控件
         * @param position
         */
       void bindDataToView(Context context, BaseBean beanDataList, BaseViewHolder viewHolder, int position);
    }

    /*
    * 你所写的viewholder要继承这个BaseViewHolder
    * */
    public interface IBaseViewHolder {

    }
    /**
     * Created by smart on 2017/4/27.
     */

    public interface BaseBean extends Serializable {
    }
}
