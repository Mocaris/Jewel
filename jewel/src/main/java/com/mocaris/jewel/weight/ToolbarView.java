package com.mocaris.jewel.weight;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mocaris.jewel.R;

/**
 * @Author mocaris
 * @Date 2018/12/24-11:56
 */
public class ToolbarView extends LinearLayout {

    private View btnBack;
    private TextView tvTitle;
    private TextView tvComplete;
    private OnClickListener backListener;
    private OnClickListener completekListener;

    public ToolbarView(Context context) {
        this(context, null);
    }

    public ToolbarView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.toolbar_view, this, true);
        btnBack = findViewById(R.id.jewel_back);
        tvTitle = findViewById(R.id.jewel_title);
        tvComplete = findViewById(R.id.jewel_complete);
        View status = findViewById(R.id.jewel_status);
        ViewGroup.LayoutParams layoutParams = status.getLayoutParams();
        layoutParams.height = getStatusbarHeight();
        btnBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != backListener) {
                    backListener.onClick(v);
                }
            }
        });
        tvComplete.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != completekListener) {
                    completekListener.onClick(v);
                }
            }
        });
    }

    public void setBackListener(View.OnClickListener listener) {
        this.backListener = listener;
    }

    public void seCompletekListener(View.OnClickListener listener) {
        this.completekListener = listener;
    }

    public void setTitle(int titleResId) {
        tvTitle.setText(titleResId);
    }

    public void setTitle(String title) {
        tvTitle.setText(title);
    }

    protected int getStatusbarHeight() {
        int statusbarRes = getResources().getIdentifier("status_bar_height", "dimen", "android");
        return getResources().getDimensionPixelSize(statusbarRes);
    }
}
