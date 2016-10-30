package binglove.fragment;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.jian.binglove.R;

import java.util.ArrayList;
import java.util.List;

import binglove.adapter.mainViewpagerAdapter;

/**
 * Created by jian on 2016/10/30.
 */

public class MainFramgent extends Fragment {
    private View v;//主要视图
    private ViewPager mViewPager;//翻页布局
    private mainViewpagerAdapter viewpagerAdapter;
    private List<Fragment> fragments;
    LayoutInflater mLayoutInflater;
    LinearLayout mNumLayout;
    Button mPreSelectedBt;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_viewpager, container, false);
        initView();
        initData();
        initEvent();
        return v;
    }

    private void initEvent() {
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }
            @Override
            public void onPageSelected(int position) {
                if (mPreSelectedBt != null) {
                    mPreSelectedBt.setBackgroundResource(R.mipmap.indicate);
                }
                Button currentBt = (Button) mNumLayout.getChildAt(position);
                currentBt.setBackgroundResource(R.mipmap.indicated);
                mPreSelectedBt = currentBt;

                //Log.i("INFO", "current item:"+position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void initData() {
        fragments = new ArrayList<>();
        ItemFragment itemFragment = new ItemFragment();
        ItemFragment2 itemFragment2 = new ItemFragment2();
        fragments.add(itemFragment);
        fragments.add(itemFragment2);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.indicate);
        for (int i = 0; i < fragments.size(); i++) {
            Button bt = new Button(getActivity());
            bt.setLayoutParams(new ViewGroup.LayoutParams(bitmap.getWidth()/3, bitmap.getHeight()/3));

            bt.setBackgroundResource(R.mipmap.indicate);
            bt.setPadding(35,0,35,0);
            mNumLayout.addView(bt);
        }
        viewpagerAdapter = new mainViewpagerAdapter(getChildFragmentManager(), fragments);
        mViewPager.setAdapter(viewpagerAdapter);

    }

    private void initView() {
        mViewPager = (ViewPager) v.findViewById(R.id.main_ViewPager);

        mNumLayout = (LinearLayout) v.findViewById(R.id.main_indicator);
    }
}
