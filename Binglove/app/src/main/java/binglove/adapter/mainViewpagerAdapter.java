package binglove.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import binglove.util.FragmentFactory;

/**
 * Created by jian on 2016/10/30.
 */

public class mainViewpagerAdapter extends FragmentPagerAdapter {
   private List<Fragment> mFragments;
    public mainViewpagerAdapter(FragmentManager fm,List<Fragment> fragments) {
        super(fm);
        mFragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return FragmentFactory.createFragment(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}
