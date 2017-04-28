package com.adapter.smart.utils;

import android.app.Activity;
import android.view.View;

/**
 * Created by smart on 2017/4/28.
 */

public class UtilWidget {
    public static <V extends View> V getView(Activity activity , int itemViewId){
        return (V) activity.findViewById(itemViewId);
    }
    public static <V extends View> V getView(View convertView, int itemViewId){
        return (V) convertView.findViewById(itemViewId);
    }
}
