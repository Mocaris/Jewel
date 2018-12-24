package com.mocaris.jewel;

import android.content.Context;

/**
 * @Author mocaris
 * @Date 2018/12/21-18:05
 */
public class Jewel {

    private final Context mContext;

    private int themeResId;

    private Jewel(Context context) {
        if (null == context) {
            throw new NullPointerException("Jewel Context can not be null !");
        }
        this.mContext = context.getApplicationContext();
        this.themeResId = R.style.Jewel_default;
    }

    public static Jewel from(Context context) {
        return new Jewel(context);
    }

}
