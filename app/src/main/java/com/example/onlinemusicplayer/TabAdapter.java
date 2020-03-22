package com.example.onlinemusicplayer;

import android.net.LinkAddress;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class TabAdapter extends FragmentStatePagerAdapter {
    private final List<Fragment> fragmetList = new ArrayList<>();
    private final List<String> mtitle = new ArrayList<>();
    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmetList.get(position);
    }

    @Override
    public int getCount() {
        return fragmetList.size();
    }

    public void addFragment(Fragment fragment , String title){
        fragmetList.add(fragment);
        mtitle.add(title);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mtitle.get(position);
    }
}
