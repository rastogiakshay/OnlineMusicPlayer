package com.example.onlinemusicplayer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.onlinemusicplayer.Fragments.TrackFragment;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabAdapter tabAdapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);


        tabAdapter = new TabAdapter(getSupportFragmentManager());
        tabAdapter.addFragment(new TrackFragment(),"Track");
        tabAdapter.addFragment(new TrackFragment(),"Track");

        viewPager.setAdapter(tabAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
