package com.mocaris.jewel.type;


import android.annotation.TargetApi;
import android.support.annotation.NonNull;
import android.support.v4.util.ArraySet;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;

/**
 * @Author mocaris
 * @Date 2018/12/21-18:07
 */
public enum MimeType {

    /*
---------------------------image----------------------------------------
*/
    /**
     * 图片
     * jpeg
     * jpg
     * jpe
     */
    IMG_JEPG("image/jpeg", setOf(".jpeg", ".jpg", "jpe")),
    /**
     * bmp
     */
    IMG_BMP("image/bmp", setOf(".bmp")),

    /**
     * png
     */
    IMG_PNG("image/png", setOf(".png")),

    /**
     * tiff
     * tif
     */
    IMG_TIFF("image/tiff", setOf(".tiff", "。tif")),

    /**
     * webp
     */
    IMG_WEBP("image/webp", setOf(".webp")),

    /**
     * Android 8.0
     * heif
     * heic
     */
    @TargetApi(26)
    IMG_HEIF("image/heif", setOf(".heif", ".heic")),

    /**
     * gif
     */
    IMG_GIF("image/gif", setOf(".gif")),
/*
---------------------------video----------------------------------------
*/
    /**
     * 3gpp
     */
    VID_3GPP("video/3gpp", setOf(".3gp")),
    /**
     * mp4
     */
    VID_MP4("video/mp4", setOf(".mp4")),
    /**
     * webm
     */
    VID_WEBM("video/webm", setOf(".webm")),
    /**
     * mkv
     */
    VID_MKV("video/x-matroska", setOf(".mkv")),

    /**
     * flv
     */
    VID_FLV("video/x-flv", setOf(".flv")),

    /**
     * quicktime
     */
    VID_QUICKTIME("video/quicktime", setOf(".mov")),

    /**
     * dv
     */
    VID_DV("video/x-dv", setOf(".dv")),

    /**
     * wm
     */
    VID_WM("video/x-ms-wmv", setOf(".wm")),

    /**
     * mpeg
     */
    VID_MPEG("video/mpeg", setOf(".mpeg")),

    /**
     * avi
     */
    VID_AVI("video/x-msvideo", setOf(".avi"));


    private final String mimeType;
    private final Set<String> typeSuffix;

    /**
     * @param mimeType 文件类型
     * @param suffix   文件后缀名
     */
    MimeType(String mimeType, Set<String> suffix) {
        this.mimeType = mimeType;
        this.typeSuffix = suffix;
    }


    private static ArraySet<String> setOf(String... suffix) {
        return new ArraySet<String>(Arrays.asList(suffix));
    }

    public static Set<MimeType> all() {
        return EnumSet.allOf(MimeType.class);
    }

    /**
     * 所有图片
     *
     * @return
     */
    public static Set<MimeType> allImage() {
        return EnumSet.of(IMG_BMP, IMG_HEIF, IMG_JEPG, IMG_PNG, IMG_TIFF, IMG_WEBP);
    }

    /**
     * 所有视频
     *
     * @return
     */
    public static Set<MimeType> allVideo() {
        return EnumSet.of(VID_3GPP, VID_AVI, VID_DV, VID_FLV, VID_MKV, VID_MP4, VID_MPEG, VID_QUICKTIME, VID_WEBM, VID_WM);
    }

    public static boolean checkImage(String mimeType) {
        return mimeType.startsWith("image");
    }

    public static boolean checkImage(MimeType mimeType) {
        return allImage().contains(mimeType);
    }

    public static boolean checkVideo(String mimeType) {
        return mimeType.startsWith("video");
    }

    public static boolean checkVideo(MimeType mimeType) {
        return allVideo().contains(mimeType);
    }

    public static boolean isGif(String mimeType) {
        return IMG_GIF.toString().equals(mimeType);
    }

    public static boolean isGif(MimeType mimeType) {
        return IMG_GIF.equals(mimeType);
    }

    @NonNull
    @Override
    public String toString() {
        return mimeType;
    }
}
