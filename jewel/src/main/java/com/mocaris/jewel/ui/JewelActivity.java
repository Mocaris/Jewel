package com.mocaris.jewel.ui;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import com.mocaris.jewel.R;
import com.mocaris.jewel.adapter.JewelPreAdapter;

/**
 * @author mocaris
 */
public class JewelActivity extends BaseActivity {

    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jewel);
        RecyclerView rvPre = findViewById(R.id.jewel_rv);
        adapter = new JewelPreAdapter(this, null);
        rvPre.setAdapter(adapter);
    }

}
