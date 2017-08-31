package com.asd.asdcommon.commonutils;

import android.os.CountDownTimer;
import android.widget.TextView;

/**
 * 获取验证码控件显示效果
 * Created by LY001 on 2017/8/11.
 */

public class CountTimerUtil extends CountDownTimer {
    private TextView view;
    private String sendHintText = "获取验证码";
    private String startHintText = "秒后可重发";

    public CountTimerUtil(long millisInFuture, long countDownInterval, TextView view) {
        super(millisInFuture, countDownInterval);
        this.view = view;
    }

    public CountTimerUtil(TextView view) {
        super(60000, 1000);
        this.view = view;
    }

    @Override
    public void onFinish() {
        view.setText(sendHintText);
        view.setEnabled(true);
    }

    @Override
    public void onTick(long arg0) {
        view.setText((arg0 / 1000) + startHintText);
        view.setEnabled(false);
    }


    /**
     * 设置完成后显示的文本
     *
     * @param sendHintText
     * @return
     */
    public CountTimerUtil setSendedHintText(String sendHintText) {
        this.sendHintText = sendHintText;
        return this;
    }

    /**
     * 设置开始时显示的文本
     *
     * @param startHintText
     * @return
     */
    public CountTimerUtil setStartHintText(String startHintText) {
        this.startHintText = startHintText;
        return this;
    }
}
