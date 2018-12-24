package com.mocaris.jewel;

import com.mocaris.jewel.type.MimeType;

/**
 * @Author mocaris
 * @Date 2018/12/24-14:18
 */
public class JewelData {
    private MimeType mimeType;

    private String origin;

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
