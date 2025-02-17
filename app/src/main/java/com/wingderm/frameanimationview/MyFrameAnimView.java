package com.wingderm.frameanimationview;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;

import com.zhuang.frameanimationview.FrameAnimView;
import com.zhuang.frameanimationview.FrameAnimation;
import com.zhuang.frameanimationview.OnImageLoadListener;

/**
 * 帧动画view
 *
 * @version v1.0
 */
public class MyFrameAnimView extends FrameAnimView {


    int[] res = {R.drawable.loading_00, R.drawable.loading_01, R.drawable.loading_02, R.drawable.loading_03,
            R.drawable.loading_04, R.drawable.loading_05, R.drawable.loading_06, R.drawable.loading_07,
            R.drawable.loading_08, R.drawable.loading_09, R.drawable.loading_10, R.drawable.loading_11,
            R.drawable.loading_12, R.drawable.loading_13, R.drawable.loading_14, R.drawable.loading_15,
            R.drawable.loading_16, R.drawable.loading_17, R.drawable.loading_18, R.drawable.loading_19,
            R.drawable.loading_20, R.drawable.loading_21, R.drawable.loading_22, R.drawable.loading_23,
            R.drawable.loading_24, R.drawable.loading_25, R.drawable.loading_26, R.drawable.loading_27,
            R.drawable.loading_28, R.drawable.loading_29, R.drawable.loading_30, R.drawable.loading_31,
            R.drawable.loading_32, R.drawable.loading_33, R.drawable.loading_34, R.drawable.loading_35,
            R.drawable.loading_36, R.drawable.loading_37, R.drawable.loading_38, R.drawable.loading_39,
            R.drawable.loading_40};

    public MyFrameAnimView(Context context) {
        super(context);
        init();
    }

    public MyFrameAnimView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyFrameAnimView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mAnimation = new FrameAnimation.FrameAnimationBuilder(getResources())
                .setLoop(true)
                .setResIds(res)
                .setDuration(100)
                .build();
        mAnimation.setOnImageLoadListener(new OnImageLoadListener() {
            @Override
            public void onImageLoad(BitmapDrawable drawable) {
                MyFrameAnimView.this.setImageDrawable(drawable);
            }

            @Override
            public void onFinish() {

            }
        });
    }
}
