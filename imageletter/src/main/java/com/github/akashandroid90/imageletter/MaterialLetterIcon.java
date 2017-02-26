package com.github.akashandroid90.imageletter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;

import com.github.akashandroid90.imageletter.drawable.TextDrawable;

public class MaterialLetterIcon extends RoundedImageViewWithBorder {
    private TextDrawable.IShapeBuilder mBuilder;
    private String mText;
    private int mTextSize;
    private int mTextColor;
    private int mShapeColor;
    private int mLetterCount;
    private Typeface mTypeface;
    private boolean bold, uppercase;
    private boolean mOval;
    private Drawable mDrawable;

    public MaterialLetterIcon(Context context) {
        this(context, null);
    }

    public MaterialLetterIcon(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MaterialLetterIcon(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        mBuilder = TextDrawable.builder();
        TypedArray attr = context.obtainStyledAttributes(attrs, R.styleable.MaterialLetterIcon, defStyle, 0);
        mLetterCount = attr.getInt(R.styleable.MaterialLetterIcon_text_number, 2);
        mTextSize = attr.getInt(R.styleable.MaterialLetterIcon_text_size, 26);
        mTextColor = attr.getColor(R.styleable.MaterialLetterIcon_text_color, Color.WHITE);
        mShapeColor = attr.getColor(R.styleable.MaterialLetterIcon_shape_color, Color.RED);
        bold = attr.getBoolean(R.styleable.MaterialLetterIcon_is_bold, false);
        uppercase = attr.getBoolean(R.styleable.MaterialLetterIcon_is_uppercase, false);

        computeText(attr.getString(R.styleable.MaterialLetterIcon_text));
        attr.recycle();
        updateDrawable();
    }

    private int toPx(int dp) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, getResources().getDisplayMetrics());
    }

    private void updateDrawable() {
        if (TextUtils.isEmpty(mText)) {
            return;
        }
        TextDrawable.IConfigBuilder iConfigBuilder = mBuilder.beginConfig().withBorder(getBorderWidth()).textColor(mTextColor).borderColor(getBorderColor());
        if (mTypeface != null)
            iConfigBuilder.useFont(mTypeface);
        if (mTextSize > 0)
            iConfigBuilder.fontSize(toPx(mTextSize));
        if (isBold())
            iConfigBuilder.bold();
        if (isUppercase())
            iConfigBuilder.toUpperCase();
        mBuilder = iConfigBuilder.endConfig();
        if (isOval())
            mDrawable = mBuilder.buildRound(mText, mShapeColor);
        else if (getCornerRadius() > 0)
            mDrawable = mBuilder.buildRoundRect(mText, mShapeColor, getCornerRadius() / 5);
        else mDrawable = mBuilder.buildRect(mText, mShapeColor);
        setImageDrawable(mDrawable);
    }

    private void computeText(String text) {
        if (TextUtils.isEmpty(text)) {
            return;
        }
        String initials[] = text.split("\\s+");
        StringBuilder initialsPlain = new StringBuilder(mLetterCount);
        for (String initial : initials) {
            initialsPlain.append(initial.substring(0, 1));
        }
        mText = initialsPlain.toString();
        mText = mText.substring(0, mLetterCount > mText.length() ? mText.length() : mLetterCount);
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        computeText(text);
        updateDrawable();
    }

    public int getTextSize() {
        return mTextSize;
    }

    public void setTextSize(int textSize) {
        mTextSize = textSize;
        updateDrawable();
    }

    public void setTypeface(Typeface typeface) {
        mTypeface = typeface;
        updateDrawable();
    }

    public Typeface getTypeFace() {
        return mTypeface;
    }

    public int getShapeColor() {
        return mShapeColor;
    }

    public void setShapeColor(@ColorInt int color) {
        mShapeColor = color;
        updateDrawable();
    }

    public int getTextColor() {
        return mTextColor;
    }

    public void setTextColor(@ColorInt int color) {
        mTextColor = color;
        updateDrawable();
    }

    public boolean isBold() {
        return bold;
    }

    public void setBold(boolean bold) {
        this.bold = bold;
    }

    public boolean isUppercase() {
        return uppercase;
    }

    public void setUppercase(boolean uppercase) {
        this.uppercase = uppercase;
    }

    public int getLetterCount() {
        return mLetterCount;
    }

    public void setLetterCount(int mLetterCount) {
        this.mLetterCount = mLetterCount;
    }

    public void setBorderColor(int color) {
        setBorderColors(ColorStateList.valueOf(color));
    }
}