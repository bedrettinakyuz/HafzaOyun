package com.example.ba61.hafzaoyun;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.content.Context;
import android.support.v7.widget.AppCompatButton;

import android.support.v7.widget.AppCompatDrawableManager;
public class kart extends AppCompatButton {
    boolean acikMi = false;
    int resimID;
    int arkaPlanID;

    public kart(Context context) {
        super(context);
        arkaPlanID = R.drawable.arka;
        Drawable d = AppCompatDrawableManager.get().getDrawable(context,arkaPlanID);
        setBackground(d);

    }
}
