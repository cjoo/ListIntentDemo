package com.demo.listintentdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jian.cao on 2016/4/14.
 */
public class Activity2 extends Activity {
    private TextView tv_msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        initView();
    }

    private void initView() {
        tv_msg = (TextView) findViewById(R.id.tv_msg);
        List<TestBean> list= (List<TestBean>) getIntent().getSerializableExtra("dataSerializable");
        tv_msg.setText(list.toString());
    }
}
