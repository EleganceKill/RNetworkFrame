package com.daryl.rnetwork;

import android.app.Fragment;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.design.widget.TabLayout;

import com.daryl.rnetwork.fragment.RecycleFragment;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.toolBar) Toolbar toolbar;
    @Bind(R.id.viewPager) ViewPager viewPager;
    @Bind(android.R.id.tabs) TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        viewPager.setAdapter(new FragmentPagerAdapter(getFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                switch (position) {
                    case 0:
                        return new Fragment();
                    case 1:
                        return new RecycleFragment();
                    default:
                        return new RecycleFragment();
                }
            }

            @Override
            public int getCount() {
                return 2;
            }
        });
    }
}
