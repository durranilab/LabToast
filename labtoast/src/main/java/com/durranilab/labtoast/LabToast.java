package com.durranilab.labtoast;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LabToast {

    Toast toast;
    View layout;
    LayoutInflater li;
    TextView msgText;
    Activity activity;
    Drawable drawable;

    public static final int CENTER = 1;
    public static final int TOP = 2;
    public static final int BOTTOM = 3;


    public LabToast(Activity activity) {

        li = activity.getLayoutInflater();
        layout = li.inflate(R.layout.toast_layout,(ViewGroup) activity.findViewById(R.id.custom_toast_layout));
        msgText = layout.findViewById(R.id.custom_toast_message);
        toast = new Toast(activity);
        this.activity = activity;
    }

    public void showToast(String message, int duration){
        msgText.setText(message);
        toast.setDuration(duration);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();
    }

    public void setBackgroundColorResources(int bgColor){
        GradientDrawable gradientDrawable = (GradientDrawable)layout.getBackground();
        gradientDrawable.setColor(activity.getResources().getColor(bgColor));
        layout.setBackground(gradientDrawable);
    }
    public void setBackgroundColor(int bgColor){
        GradientDrawable gradientDrawable = (GradientDrawable)layout.getBackground();
        gradientDrawable.setColor(bgColor);
        layout.setBackground(gradientDrawable);
    }

    public void setBackgroundDrawable(int image){
        layout.setBackgroundResource(image);
    }

    public void setPositon(int positon){
        switch (positon){
            case TOP:
                toast.setGravity(Gravity.TOP,0,0);
                break;
            case CENTER:
                toast.setGravity(Gravity.CENTER_HORIZONTAL,0,0);
                break;
            case BOTTOM:
                toast.setGravity(Gravity.BOTTOM,0,0);
                break;

        }
    }

    public void setCornerStyle(int style){
        switch (style){
            case 1:
               layout.setBackgroundResource(R.drawable.toast_background_medium);
                break;
            case 2:
                layout.setBackgroundResource(R.drawable.toast_background_round);
                break;
            case 3:
                layout.setBackgroundResource(R.drawable.toast_background_square);
                break;
            default:
                layout.setBackgroundResource(R.drawable.toast_background_default);
                break;
        }
    }

    public void setIcon(int icon){
        ImageView iconView = layout.findViewById(R.id.custom_toast_icon);
        iconView.setImageResource(icon);
    }

    public void setTextColorResources(int textColor){
        msgText.setTextColor(activity.getResources().getColor(textColor));
    }
    public void setTextColor(int textColor){
        msgText.setTextColor(textColor);
    }
}
