package com.jalaj.firstapp.tabactionbars;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.jalaj.firstapp.tabactionbars.fragment.FirstFragment;

public class MainActivity extends AppCompatActivity {

    ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = (ViewPager) findViewById(R.id.mVwPager);
        mViewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));

    }

    public static class MyPagerAdapter extends FragmentPagerAdapter{

        private static int NUM_ITEMS=3;
        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 1:
                    return FirstFragment.newInstance(0, "Page # 1");
                case 2:
                    return FirstFragment.newInstance(0, "Page # 2");
                case 3:
                    return FirstFragment.newInstance(0, "Page # 3");

            }
            return FirstFragment.newInstance(0, "Page 0");
        }

        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return "page: "+ position;
        }
    }
}
