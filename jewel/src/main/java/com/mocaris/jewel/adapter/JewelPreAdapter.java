package com.mocaris.jewel.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.mocaris.jewel.JewelData;
import com.mocaris.jewel.R;
import com.mocaris.jewel.loader.LoadEngine;
import com.mocaris.jewel.type.MimeType;

import java.util.List;

/**
 * @Author mocaris
 * @Date 2018/12/24-14:07
 */
public class JewelPreAdapter extends RecyclerView.Adapter<JewelPreAdapter.PreHolder> {


    private final Context context;
    private final LoadEngine loadEngine;

    private List<JewelData> picData;

    public JewelPreAdapter(Context context, LoadEngine loadEngine) {
        this.context = context;
        this.loadEngine = loadEngine;
    }

    public void setPicData(List<JewelData> picData) {
        this.picData = picData;
    }

    @NonNull
    @Override
    public PreHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_pre_pic, viewGroup, false);
        return new PreHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PreHolder preHolder, int i) {
        JewelData picPath = picData.get(i);
        MimeType mimeType = picPath.getMimeType();
        boolean checkImage = MimeType.checkImage(mimeType);
        if (checkImage) {


        } else {

        }
        /*switch (picPath.getMimeType()) {
            case IMG_GIF:

                break;
            case IMG_HEIF:

                break;
            case IMG_JEPG:

                break;
            case IMG_PNG:

                break;
            case IMG_TIFF:

                break;
            case IMG_WEBP:

                break;
            case VID_3GPP:

                break;
            case VID_AVI:

                break;
            case VID_DV:

                break;
            case VID_FLV:

                break;
            case VID_MKV:

                break;
            case VID_MP4:

                break;

            case VID_MPEG:

                break;

        }*/
    }

    @Override
    public int getItemCount() {
        return null == picData ? 0 : picData.size();
    }


    static class PreHolder extends RecyclerView.ViewHolder {

        private final View picPre;

        public PreHolder(@NonNull View itemView) {
            super(itemView);
            this.picPre = itemView.findViewById(R.id.img_pre_pic);
        }
    }
}
