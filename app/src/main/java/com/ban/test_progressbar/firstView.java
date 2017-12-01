package com.ban.test_progressbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by brander on 2017/12/1.
 */

public class firstView extends View {
    private int defaultSize;
    public firstView(Context context) {
        super(context);
    }

    public firstView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray a=context.obtainStyledAttributes(attrs,R.styleable.firstView);
        defaultSize=a.getDimensionPixelSize(R.styleable.firstView_hc,100);
        a.recycle();

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width = getMySize(100, widthMeasureSpec);
        int height = getMySize(100, heightMeasureSpec);
        if (width < height) {
            height = width;
        } else {
            width = height;
        }
        setMeasuredDimension(width, height);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int r = getMeasuredWidth() / 2;
        int yCenter = getTop() + r;
        int xCenter = getLeft() + r;
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        canvas.drawCircle(xCenter, yCenter, r, paint);

    }

    private int getMySize(int defaultMeasure, int measureSpec) {
        int mSize = defaultMeasure;
        int mode = MeasureSpec.getMode(measureSpec);
        int size = MeasureSpec.getSize(measureSpec);
        switch (mode) {
            case MeasureSpec.UNSPECIFIED:
                mSize = defaultMeasure;
                break;
            case MeasureSpec.EXACTLY:
                mSize = size;
                break;
            case MeasureSpec.AT_MOST:
                mSize = size;
                break;
        }
        return mSize;
    }
}
