package com.mocaris.jewel;

import com.mocaris.jewel.type.MimeType;

/**
 * @Author mocaris
 * @Date 2018/12/24-14:18
 * 图片视频信息类
 */
public class JewelData {
    /**
     * 类型
     */
    private MimeType mimeType;

    /**
     * 源文件地址
     */
    private String origin;

    /**
     * 预览图地址
     */
    private String thumb;

    public MimeType getMimeType() {
        return mimeType;
    }

    public void setMimeType(MimeType mimeType) {
        this.mimeType = mimeType;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }
}
