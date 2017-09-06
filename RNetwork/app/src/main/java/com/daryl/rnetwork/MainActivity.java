package com.daryl.rnetwork;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.design.widget.TabLayout;

import butterknife.Bind;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.toolBar) Toolbar toolbar;
    @Bind(R.id.viewPager) ViewPager mViewPager;
    @Bind(android.R.id.tabs) TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
