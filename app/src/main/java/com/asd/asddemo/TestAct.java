package com.asd.asddemo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;

import com.asd.asddemo.widget.BaseFragmentDialogWithDialog;
import com.asd.asddemo.widget.BaseFragmentDialogWithLayout;
import com.jaydenxiao.common.base.BaseActivity;
import com.jaydenxiao.common.commonutils.ACache;
import com.orhanobut.logger.Logger;

/**
 * Created by Administrator on 2017/8/1 0001.
 */

public class TestAct extends BaseActivity implements BaseFragmentDialogWithLayout.DialogCallback, BaseFragmentDialogWithDialog.DialogCallback {
    @Override
    public int getLayoutId() {
        return R.layout.activity_test;
    }

    @Override
    public void initPresenter() {
//        mPresenter.setVM(this, mModel);
    }

    @Override
    public void initView() {
        Logger.e(ACache.get(this).getAsString("a") + "-------------");
        Logger.e(ACache.get(this).getAsString("b") + "-------------");
        Logger.e(ACache.get(getApplication()).getAsString("b") + "-------------");

        BaseFragmentDialogWithLayout.getInstance(R.layout.dialog_layout).show(getSupportFragmentManager(),"dialog");
        BaseFragmentDialogWithDialog.getInstance().show(getSupportFragmentManager(), "dialog");
    }

    @Override
    public void dialogLayoutView(View view) {
        view.findViewById(R.id.top_title).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TestAct.this, "aaa..", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public Dialog getDialog() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("标题！").setMessage("测试").setPositiveButton("确定", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        }).setNegativeButton("取消", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        });
//        .show();
        return alertDialogBuilder.create();
    }
}
