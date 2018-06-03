package com.android.hjalmar.thewitnessisland.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.android.hjalmar.thewitnessisland.R;

/**
 * Created by hjalmar
 * On 27/05/2018.
 */
public class CategoryFragmentPagerAdapter extends FragmentPagerAdapter {

    private final static int FRAGMENTS_COUNT = 4;
    private final Context mContext;
    private final String[] mTabTitles;

    public CategoryFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.mContext = context;
        this.mTabTitles = buildTabTitles();
    }

    private String[] buildTabTitles() {
        String[] tabTitles = new String[FRAGMENTS_COUNT];
        tabTitles[0] = mContext.getString(R.string.category_area);
        tabTitles[1] = mContext.getString(R.string.category_puzzle);
        tabTitles[2] = mContext.getString(R.string.category_art);
        tabTitles[3] = mContext.getString(R.string.category_obelisk);

        return tabTitles;
    }

    @Override
    public int getCount() {
        return FRAGMENTS_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new IslandAreaFragment();
            case 1:
                return new IslandPuzzleFragment();
            case 2:
                return new IslandArtFragment();
            case 3:
                return new IslandObeliskFragment();
            default:
                throw new IllegalArgumentException("Invalid position as input: must be less than " + FRAGMENTS_COUNT);
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabTitles[position];
    }

}
