package com.example.administrator.putilive;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Administrator on 2017/1/2.
 */

public class Adapter_Main extends FragmentPagerAdapter {
    private String[] mTabnames ;
    private Fragment[] mFragments ;
    public Adapter_Main(FragmentManager fm , String[] mTabnames , Fragment[] mFragments) {
        super(fm);
        this.mTabnames = mTabnames ;
        this.mFragments = mFragments ;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments[position];
    }

    @Override
    public int getCount() {
        return mTabnames.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabnames[position];
    }
}
