package com.asd.asdcommon.commonutils;

import android.widget.TextView;

import java.util.List;

/**
 * Created by LY001 on 2017/8/18.
 */

public class CheckEmptyUtil {
    public static boolean checkEmpty(String str) {
        if (null == str || str.isEmpty() || str.equals("null"))
            return true;
        else
            return false;
    }

    public static boolean checkListEmpty(List<TextView> textViews) {
        if (null == textViews) {
            return true;
        }
        for (TextView textView : textViews) {
            if (checkEmpty(textView.getText().toString())) {
                textView.requestFocus();//获取焦点
                return true;
            }
        }
        return false;
    }
}
