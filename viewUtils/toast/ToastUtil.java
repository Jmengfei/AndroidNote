package com.yjzx.yjzx2017.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.yjzx.yjzx2017.R;
import com.yjzx.yjzx2017.YJZXApplication;


/**
 * Created by jmfstart on 2017/1/2.
 * toast界面的封装，实现了单例模式，布局可以随意定制
 */
public class ToastUtil {
    private static Toast mToast;

    public static void showToast( CharSequence charSequence) {
        View mView = LayoutInflater.from(YJZXApplication.getContext()).inflate(
                R.layout.toast, new LinearLayout(YJZXApplication.getContext()), false);
        TextView popTips = (TextView) mView.findViewById(R.id.pop_text);
        popTips.setText(charSequence);

        if(mToast == null){
            mToast = new Toast(YJZXApplication.getContext());
        }
        mToast.setDuration(Toast.LENGTH_SHORT);
        mToast.setView(mView);
        mToast.show();
    }
}
