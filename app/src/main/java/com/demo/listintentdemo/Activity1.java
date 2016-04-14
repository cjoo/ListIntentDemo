package com.demo.listintentdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jian.cao on 2016/4/14.
 */
public class Activity1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
    }

    public void putSerializable(View view) {
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("dataSerializable", (Serializable) getSerializableData());
        startActivity(intent);
    }

    private List<TestBean> getSerializableData() {
        List<TestBean> list = new ArrayList<TestBean>();
        for (int i = 0; i < 10; i++) {
            TestBean testBean = new TestBean();
            testBean.name = "name" + i;
            testBean.head = "head" + i;
            list.add(testBean);
        }
        return list;
    }
}
