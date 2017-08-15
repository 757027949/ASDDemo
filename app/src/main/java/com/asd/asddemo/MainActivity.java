package com.asd.asddemo;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.asd.asdcommon.commonutils.ACache;
import com.asd.asdcommon.commonutils.JsonUtils;
import com.asd.asdcommon.commonwidget.statusbar.SystemUiVisibilityUtil;
import com.asd.asddemo.bean.User;
import com.orhanobut.logger.Logger;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Logger.e(ACache.get(this).getAsString("a") + "-------------");
        Logger.e(ACache.get(this).getAsString("b") + "-------------");
        Logger.e(ACache.get(getApplication()).getAsString("b") + "-------------");

        ACache.get(this).put("a", "thisa", 10);
        ACache.get(getApplication()).put("b", "getApplicationa");

        User user = new User(1, "zhangsan");
        String str = JsonUtils.toJson(user);
        Logger.e(str);

        User user1 = JsonUtils.fromJson(str, User.class);
        Logger.e(JsonUtils.toJson(user1));


//        StatusBarUtil.fullScreen(this,true);
//        StatusBarUtil.fullScreen(this,false);
//        StatusBarUtil.hideStatusBar(this,false);


//        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0, 0, 100);
//        translateAnimation.setDuration(3000);
//        translateAnimation.setFillAfter(true);
//        findViewById(R.id.txt).setAnimation(translateAnimation);
//        ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(findViewById(R.id.txt), "rotationY", 360);
//        objectAnimator1.setDuration(3000);
//        objectAnimator1.start();

//        findViewById(R.id.txt).animate().translationX(200).setDuration(3000).start();

//        StatusBarUtil.setColor(this, getResources().getColor(android.support.v7.appcompat.R.color.abc_btn_colored_text_material));
        //设置屏幕为横屏
//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
//        SystemUiVisibilityUtil.exit(this);
        SystemUiVisibilityUtil.enter(this);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
//        StatusBarUtil.onWindowFocusChanged(this, hasFocus);
    }

    public void btnClick(View view) {
        switch (view.getId()) {
            case R.id.txt:
                Snackbar.make(view, "aaaaa", Snackbar.LENGTH_LONG).setAction("cancle", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "cancle", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(MainActivity.this, TestAct.class));
                    }
                }).show();
                break;
            case R.id.toolbarBtn:
                Intent intent = new Intent(this, ToolbarActivity.class);
                startActivity(intent);
                break;
        }
    }
}
