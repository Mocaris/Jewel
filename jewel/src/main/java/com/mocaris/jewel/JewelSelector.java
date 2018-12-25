package com.mocaris.jewel;

import com.mocaris.jewel.listener.OnSelectListener;
import com.mocaris.jewel.loader.LoadEngine;
import com.mocaris.jewel.type.MimeType;

import java.util.Set;

/**
 * @Author mocaris
 * @Date 2018/12/21-19:21
 * 配置类
 */
public class JewelSelector {

    /**
     * 主题
     */
    public int themeResId;
    /**
     * 图片最大选择数量
     */
//    public int maxImageSelect;

    public int maxSelect;
    /**
     * 选择器每行显示个数
     */
    public int showSpanCount;
    /**
     * 需要显示的类型
     */
    public Set<MimeType> mimeTypes;
    /**
     * 视频最大选择数量
     */
//    public int maxVideoSelect;
    /**
     * 加载图片
     */
    public LoadEngine loadEngine;
    /**
     * 选择回调
     */
    public OnSelectListener selectListener;

    public static final JewelSelector getInstance() {
        return Holder.INSTANCE;
    }

    public void reset() {
        themeResId = R.style.Jewel;
        maxSelect = 1;
        showSpanCount = 3;
        mimeTypes = MimeType.all();
        loadEngine = null;
        selectListener = null;
    }

    static final class Holder {
        public static JewelSelector INSTANCE = new JewelSelector();
    }


}
