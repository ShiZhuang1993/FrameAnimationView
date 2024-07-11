package com.zhuang.frameanimationview;

import android.graphics.drawable.BitmapDrawable;

/**
 * 图片加载监听
 * @version v1.0
 */
public interface OnImageLoadListener {
    void onImageLoad(BitmapDrawable drawable);

    void onFinish();
}
