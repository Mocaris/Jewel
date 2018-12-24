package com.mocaris.jewel.loader;

/**
 * @Author mocaris
 * @Date 2018/12/24-09:32
 * 加载类
 */
public interface LoadEngine {

    /**
     * 加载图片
     * 非 GIF
     */
    void loadPic();

    /**
     * 加载GIF 图片
     */
    void loadGif();

    /**
     * 加载视频
     */
    void loadVideo();

}
