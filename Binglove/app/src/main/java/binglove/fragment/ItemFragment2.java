package binglove.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jian.binglove.R;

/**
 * Created by jian on 2016/10/30.
 */

public class ItemFragment2 extends Fragment {
    View v;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.item_fragment2, null, false);//获取布局文件
        initView();//初始化视图
        return v;
    }

    private void initView() {


    }
}
