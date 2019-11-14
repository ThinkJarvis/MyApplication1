package com.kotlin.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;


public class PhoneViewContainer extends BaseFrameLayout {

    private final static int sPageMaxShowItems = 5;


    private int mPageSize = 0;


    public PhoneViewContainer(@NonNull Context context) {
        super(context);


    }

    @Override
    protected void init() {
        super.init();
        View view = inflate(getContext(), R.layout.layout_phone_view_container, null);
        LayoutParams layoutParams = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
        addView(view, layoutParams);

        mPageSize = 5;
        findViewById(R.id.test).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("wjq", "mPageSize = " + mPageSize);
            }
        });
    }
}
