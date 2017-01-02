package com.example.administrator.putilive;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.flyco.tablayout.SlidingTabLayout;

import remen.Remen_Fragment;
import shangshi.shangshi_Fragment;
import toncheng.toncheng_Fragment;
import zuixin.zuixin_Fragment;

public class Main_Activity extends AppCompatActivity {

    private ViewPager mViewpager_main;
    private FragmentManager mFragmentManager;
    private String[] mTabnames;
    private Fragment[] mFragments;
    private Toolbar mToolbar;
    private SlidingTabLayout mTablayout_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFragmentManager = getSupportFragmentManager();
        findView();
        initData();
        init();
    }

    private void initData() {
        mTabnames = new String[]{"热门","最新","同城","上师"};
        mFragments = new Fragment[]{new Remen_Fragment(),new shangshi_Fragment(),
                new toncheng_Fragment(),new zuixin_Fragment()};
    }

    private void init() {
        mViewpager_main.setAdapter(new Adapter_Main(mFragmentManager,mTabnames,mFragments));
        mTablayout_main.setViewPager(mViewpager_main,mTabnames);
    }

    private void findView() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mTablayout_main = (SlidingTabLayout) findViewById(R.id.tablayout_main);
        mViewpager_main = (ViewPager) findViewById(R.id.viewpager_main);
    }
}
