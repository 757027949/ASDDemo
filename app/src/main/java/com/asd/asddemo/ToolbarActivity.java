package com.asd.asddemo;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;


/**
 * Created by Administrator on 2017/7/25 0025.
 */

public class ToolbarActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_toolbar);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("fuck you...");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.addTab(tabLayout.newTab().setText("内容简介0"));
        tabLayout.addTab(tabLayout.newTab().setText("作者简介0"));
        tabLayout.addTab(tabLayout.newTab().setText("目录0"));
        tabLayout.addTab(tabLayout.newTab().setText("内容简介0"));
        tabLayout.addTab(tabLayout.newTab().setText("作者简介0"));
        tabLayout.addTab(tabLayout.newTab().setText("目录0"));
        tabLayout.addTab(tabLayout.newTab().setText("内容简介0"));
        tabLayout.addTab(tabLayout.newTab().setText("作者简介0"));
        tabLayout.addTab(tabLayout.newTab().setText("目录0"));
    }
}
