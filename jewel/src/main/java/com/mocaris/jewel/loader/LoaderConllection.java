package com.mocaris.jewel.loader;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;

import java.lang.ref.WeakReference;

/**
 * @Author mocaris
 * @Date 2018/12/25-17:41
 */
public class LoaderConllection implements LoaderManager.LoaderCallbacks<Cursor> {

    private final WeakReference<Context> reference;

    public LoaderConllection(Context context) {
        reference = new WeakReference<>(context);
    }

    @NonNull
    @Override
    public Loader<Cursor> onCreateLoader(int i, @Nullable Bundle bundle) {
        Context context = reference.get();
        if (null == context) {
            return null;
        }
        return MediaLoader.getInstance(context);
    }

    @Override
    public void onLoadFinished(@NonNull Loader<Cursor> loader, Cursor cursor) {

    }

    @Override
    public void onLoaderReset(@NonNull Loader<Cursor> loader) {

    }


    public interface LoadListener {
        void oncreateload();

        void onLoadFinish();

        void onLoadReset();
    }
}
