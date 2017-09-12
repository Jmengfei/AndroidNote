package com.yjzx.yjzx2017.view;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

/**
 * Created by 贾梦飞 on 2017/7/28 12:15.
 * QQ:821176301
 * 微信：j821176301
 * desc：
 */

class mInputConnecttion extends InputConnectionWrapper implements
        InputConnection {

    public mInputConnecttion(InputConnection target, boolean mutable) {
        super(target, mutable);
    }

    /**
     * 对输入的内容进行拦截
     *
     * @param text
     * @param newCursorPosition
     * @return
     */
    @Override
    public boolean commitText(CharSequence text, int newCursorPosition) {
        // 只能输入汉字
        if (text.toString().matches("[\u4e00-\u9fa5]+")) {
            return false;
        }
        return super.commitText(text, newCursorPosition);
    }

    @Override
    public boolean sendKeyEvent(KeyEvent event) {
        return super.sendKeyEvent(event);
    }

    @Override
    public boolean setSelection(int start, int end) {
        return super.setSelection(start, end);
    }

}
