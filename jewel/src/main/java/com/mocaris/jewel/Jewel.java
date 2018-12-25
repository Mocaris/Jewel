package com.mocaris.jewel;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.IntRange;
import android.support.v4.app.Fragment;
import com.mocaris.jewel.listener.OnSelectListener;
import com.mocaris.jewel.loader.LoadEngine;
import com.mocaris.jewel.type.MimeType;
import com.mocaris.jewel.ui.JewelActivity;

import java.util.Set;

/**
 * @Author mocaris
 * @Date 2018/12/21-18:05
 */
public class Jewel {

    private final JewelSelector jewelSelector = JewelSelector.getInstance();

    private Context context;

    private Jewel(Context context) {
        if (null == context) {
            throw new NullPointerException("Jewel Context can not be null !");
        }
        jewelSelector.reset();
        this.context = context.getApplicationContext();
        this.jewelSelector.showSpanCount = 4;
        this.jewelSelector.maxSelect = 1;
        this.jewelSelector.themeResId = R.style.Jewel_default;
    }

    public static Jewel from(Context context) {
        return new Jewel(context);
    }

    public static Jewel fromFragment(Fragment fragment) {
        if (null == fragment) {
            throw new NullPointerException("Jewel Context can not be null !");
        }
        return from(fragment.getActivity());
    }

    /**
     * 最大选择数量
     *
     * @param maxSize
     */
    public Jewel setMaxSize(@IntRange(from = 1, to = 9) int maxSize) {
        this.jewelSelector.maxSelect = maxSize;
        return this;
    }

    /**
     * 设置主题
     *
     * @param themeResId
     */
    public Jewel setTheme(int themeResId) {
        this.jewelSelector.themeResId = themeResId;
        return this;
    }

    /**
     * 选择器每行显示个数
     *
     * @param spanCount
     */
    public Jewel setSpanCount(@IntRange(from = 2, to = 4) int spanCount) {
        this.jewelSelector.showSpanCount = spanCount;
        return this;
    }

    /**
     * 预览图加载代理
     *
     * @param loadEngine
     */
    public Jewel setLoadEngine(LoadEngine loadEngine) {
        this.jewelSelector.loadEngine = loadEngine;
        return this;
    }

    public Jewel setShowMimeType(Set<MimeType> mimeTypeSet) {
        this.jewelSelector.mimeTypes = mimeTypeSet;
        return this;
    }

    public Jewel setOnSelectListener(OnSelectListener onSelectListener) {
        this.jewelSelector.selectListener = onSelectListener;
        return this;
    }

    public void start() {
        if (null == this.jewelSelector.loadEngine) {
            throw new IllegalArgumentException("Jewel loadEngine can not be null,please call setLoadEngin()");
        }
        context.startActivity(new Intent(context, JewelActivity.class));
    }

}
