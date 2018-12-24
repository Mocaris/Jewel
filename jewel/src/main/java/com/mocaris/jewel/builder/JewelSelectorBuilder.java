package com.mocaris.jewel.builder;

/**
 * @Author mocaris
 * @Date 2018/12/21-18:43
 */
public class JewelSelectorBuilder {

    public static final JewelSelectorBuilder INSTANCE() {
        return SelectorHolder.INSTANCE;
    }

    /**
     * 设置主题 及配置
     * <p>
     * 主题参考 themes文件   Jewel节点属性
     *
     * @param themeResId
     */
    public void setTheme(int themeResId) {
//        this.themeResId = themeResId;
    }

    private static final class SelectorHolder {
        public static JewelSelectorBuilder INSTANCE = new JewelSelectorBuilder();
    }

}
