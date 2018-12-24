package com.mocaris.jewel.ui;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.mocaris.jewel.R;
import com.mocaris.jewel.adapter.JewelPreAdapter;

public class JewelActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jewel);
        RecyclerView rvPre = findViewById(R.id.jewel_rv);
        rvPre.setAdapter(new JewelPreAdapter(this,null));
    }

}
