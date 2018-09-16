package com.xhh.attrdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * @Author:Create by Mr.w
 * @Date:2018/9/16 22:48
 * @Description:
 */
public class BaseTitleView extends View {
    public BaseTitleView(Context context) {
        super(context);
        initView(context);
    }

    public BaseTitleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    private void initView(Context context) {

    }
}
