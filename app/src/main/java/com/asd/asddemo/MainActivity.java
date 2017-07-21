package com.asd.asddemo;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.asd.asdutils.statusbar.StatusBarUtil;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        StatusBarUtil.hideStatusBar(this,true);
//        StatusBarUtil.fullScreen(this,false);

      /*  //得到当前界面的装饰视图
        if (Build.VERSION.SDK_INT >= 21) {
            View decorView = getWindow().getDecorView();
            //让应用主题内容占用系统状态栏的空间,注意:下面两个参数必须一起使用 stable 牢固的
            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            //设置让应用主题内容占据状态栏和导航栏
//            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN|View.SYSTEM_UI_FLAG_HIDE_NAVIGATION|View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            decorView.setSystemUiVisibility(option);
            //设置状态栏和导航栏颜色为透明
            getWindow().setStatusBarColor(Color.TRANSPARENT);
            getWindow().setNavigationBarColor(Color.TRANSPARENT);
        }*/

        //得到当前界面的装饰视图
//        View decorView = getWindow().getDecorView();
// //     SYSTEM_UI_FLAG_FULLSCREEN表示全屏的意思，也就是会将状态栏隐藏
//        //设置系统UI元素的可见性
//        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
//        //隐藏标题栏
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

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
//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
//        StatusBarUtil.onWindowFocusChanged(this,hasFocus);
    }
}
