package com.aanchal.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;

import com.aanchal.fragments.Fragments.FirstFragment;
import com.aanchal.fragments.Fragments.SecondFragment;
import com.google.android.material.tabs.TabLayout;

import Adapter.ViewPageAdapter;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        viewPager=findViewById(R.id.viewPager);

        tabLayout=findViewById(R.id.tabId);
        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#FFFFFF"));
        ViewPageAdapter viewPageAdapter =new ViewPageAdapter(getSupportFragmentManager());
        viewPageAdapter.addFragment(new FirstFragment(),"sum");
        viewPageAdapter.addFragment(new SecondFragment(),"area of circle");

        viewPager.setAdapter(viewPageAdapter);
        tabLayout.setupWithViewPager(viewPager);


    }
}
