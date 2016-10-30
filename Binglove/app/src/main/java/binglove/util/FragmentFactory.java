package binglove.util;

import android.support.v4.app.Fragment;

import java.util.HashMap;
import java.util.Map;

import binglove.fragment.ItemFragment;
import binglove.fragment.ItemFragment2;

/**
 * Created by jian on 2016/10/30.
 */

public class FragmentFactory {
    private static Map<Integer, Fragment> mFragments = new HashMap<Integer, Fragment>();


    public static Fragment createFragment(int position)
    {
        Fragment fragment = null;
        fragment = mFragments.get(position);  //在集合中取出来Fragment
        if(fragment == null)   //如果在集合中没有取出来，需要重新创建
        {
            if(position == 0)
            {
                fragment = new ItemFragment();
            }
            else if(position == 1)
            {
                fragment = new ItemFragment2();
            }
            if(fragment != null)
            {
                mFragments.put(position, fragment);
            }
        }
        return fragment;

    }
}
