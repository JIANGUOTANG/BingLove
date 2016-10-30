package binglove.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.jian.binglove.R;
import com.example.jian.binglove.RegisterActivity;

/**
 * Created by jian on 2016/10/30.
 */

public class ItemFragment extends Fragment implements View.OnClickListener {
    View v;
    private ImageView imgChinaMobile;
    private ImageView imgChinaUnicom;
    private ImageView imgChinaTelecom;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.item_fragment1, null, false);//获取布局文件
        initView();//初始化视图
        initEvent();
        return v;
    }

    private void initEvent() {
        imgChinaMobile.setOnClickListener(this);
        imgChinaTelecom.setOnClickListener(this);
        imgChinaUnicom.setOnClickListener(this);

    }

    private void initView() {
        imgChinaMobile = (ImageView) v.findViewById(R.id.main_imgChinaMobile);

        imgChinaTelecom = (ImageView) v.findViewById(R.id.main_imgChinaTelecom);
        imgChinaUnicom = (ImageView) v.findViewById(R.id.main_imgChinaUnicom);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {

            case R.id.main_imgChinaMobile:
                 intent = new Intent(getActivity(), RegisterActivity.class);
                startActivity(intent);
                break;
            case R.id.main_imgChinaUnicom:
                 intent = new Intent(getActivity(), RegisterActivity.class);
                startActivity(intent);
                break;
            case R.id.main_imgChinaTelecom:
                 intent = new Intent(getActivity(), RegisterActivity.class);
                startActivity(intent);
                break;


        }
    }
}
