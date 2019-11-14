package com.kotlin.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;


public class CardView extends RelativeLayout {

    private PhoneViewContainer mViewContainer;


    public CardView(@NonNull Context context) {
        this(context, null);
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, -1);
    }

    public CardView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.layout_card_view, this);
        inflateViewContainer();


    }


    public static CardView createCardView(Context context, int viewType) {
        CardView cardView = new CardView(context);
        return cardView;
    }


    private void inflateViewContainer() {

        mViewContainer = new PhoneViewContainer(getContext());

        LayoutParams layoutParams = new RelativeLayout.LayoutParams(435, 720);
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = 0;

        if (mViewContainer == null || layoutParams == null) {
            throw new IllegalStateException("viewContainer or layoutParams must not be null!!!");
        }

        addView(mViewContainer, layoutParams);
    }


}
