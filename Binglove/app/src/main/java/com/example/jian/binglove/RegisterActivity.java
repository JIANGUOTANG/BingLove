package com.example.jian.binglove;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.jian.binglove.databinding.ActivityRegisterBinding;

import binglove.entity.CardInfo;

/**
 * Created by jian on 2016/10/30.
 */

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bindData();
    }

    private void bindData() {
        ActivityRegisterBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_register);//利用databinding。
        CardInfo cardInfo = new CardInfo("小明","男","身份证","445566778899003322","1996/12/12","广东省公安局","2012/9/9","2017/9/9","广东省广州市这里","");
        binding.setCardInfo(cardInfo);
    }

}
