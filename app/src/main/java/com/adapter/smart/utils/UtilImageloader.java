package com.adapter.smart.utils;

import android.content.Context;
import android.widget.ImageView;

import com.adapter.smart.R;
import com.bumptech.glide.Glide;

/**
 * Created by smart on 2017/4/24.
 */

public class UtilImageloader {
  public static void setImage(Context context, String url, ImageView imageView){
      Glide.with(context)
              .load(url)
              .placeholder(R.mipmap.ic_launcher)
              .into(imageView);
  }
}
