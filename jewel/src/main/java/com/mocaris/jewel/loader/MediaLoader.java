package com.mocaris.jewel.loader;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.CursorLoader;
import com.mocaris.jewel.JewelSelector;
import com.mocaris.jewel.type.MimeType;

import java.util.Set;

/**
 * @Author mocaris
 * @Date 2018/12/25-16:29
 * 图片视频查询
 * 图片单种
 */
public class MediaLoader extends CursorLoader {

    private static Uri EXTRAL = MediaStore.Files.getContentUri("external");

//    private static Uri IMAGEURI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;

//    private static Uri VIDEOURI = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;

    private MediaLoader(@NonNull Context context) {
        super(context);


    }

    private MediaLoader(@NonNull Context context,
                        @NonNull Uri uri,
                        @Nullable String[] projection,
                        @Nullable String selection,
                        @Nullable String[] selectionArgs,
                        @Nullable String sortOrder) {
        super(context, uri, projection, selection, selectionArgs, sortOrder);
    }

    public static MediaLoader getInstance(Context context) {
        Set<MimeType> mimeTypes = JewelSelector.getInstance().mimeTypes;


        String[] projection = {
                MediaStore.Files.FileColumns.MIME_TYPE,
                MediaStore.Files.FileColumns.DISPLAY_NAME,
                MediaStore.Files.FileColumns.DATA,
                MediaStore.Files.FileColumns.WIDTH,
                MediaStore.Files.FileColumns.HEIGHT,
                MediaStore.Files.FileColumns.DATE_MODIFIED};

        StringBuilder selectionBuilder = new StringBuilder();
        selectionBuilder.append(MediaStore.Files.FileColumns.MEDIA_TYPE + "=?");
        selectionBuilder.append(" OR ");
        selectionBuilder.append(MediaStore.Files.FileColumns.MEDIA_TYPE + "=?");
        selectionBuilder.append(" AND ");
        selectionBuilder.append(MediaStore.MediaColumns.SIZE + ">0");

        String[] selectionArgs = new String[]{String.valueOf(MediaStore.Files.FileColumns.MEDIA_TYPE_IMAGE),
                String.valueOf(MediaStore.Files.FileColumns.MEDIA_TYPE_VIDEO)};

        return new MediaLoader(context, EXTRAL,
                projection,
                selectionBuilder.toString(),
                selectionArgs,
                MediaStore.MediaColumns.DATE_MODIFIED);
    }

    @Override
    public Cursor loadInBackground() {
        return super.loadInBackground();
    }
}
