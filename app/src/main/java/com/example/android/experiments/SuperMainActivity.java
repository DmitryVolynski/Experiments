package com.example.android.experiments;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android.experiments.databinding.ActivitySuperMainBinding;

public class SuperMainActivity extends AppCompatActivity {
    ActivitySuperMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_super_main);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_super_main);

        mBinding.text1.setText("aaa");
        mBinding.textView.setText("bbb");

        //changes
    }
}
