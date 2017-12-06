package com.github.akashandroid90.imageletter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;


public class TintableImageView extends AppCompatImageView {
    private ColorStateList mTint, mBackgroundTint;

    public TintableImageView(Context context) {
        super(context);
    }

    public TintableImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TintableImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.TintableImageView, defStyle, 0);
        mTint = a.getColorStateList(R.styleable.TintableImageView_image_tint);
        mBackgroundTint = a.getColorStateList(R.styleable.TintableImageView_background_tint);
        a.recycle();
    }

    @Override
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (mTint != null) {
            if (mTint.isStateful())
                setColorFilter(mTint.getColorForState(getDrawableState(), 0));
            else setColorFilter(mTint);
        }
        Drawable drawable = getBackground();
        if (mBackgroundTint != null && drawable != null) {
            Drawable wrap = DrawableCompat.wrap(drawable);
            wrap = wrap.mutate();

            if (mBackgroundTint.isStateful())
                DrawableCompat.setTint(wrap, ContextCompat.getColor(getContext(), mBackgroundTint.getColorForState(getDrawableState(), 0)));
            else DrawableCompat.setTintList(wrap, mBackgroundTint);

            DrawableCompat.setTintMode(wrap, PorterDuff.Mode.SRC_IN);
        }
    }

    public void removeTint() {
        mTint = null;
        clearColorFilter();
    }

    public void setColorFilter(ColorStateList tint) {
        this.mTint = tint;
        setColorFilter(tint.getColorForState(getDrawableState(), 0));
    }
}