package com.demo.listintentdemo;

import java.io.Serializable;

/**
 * Created by jian.cao on 2016/4/14.
 */
public class TestBean implements Serializable {
    public String name;
    public String head;

    @Override
    public String toString() {
        return "TestBean{" +
                "name='" + name + '\'' +
                ", head='" + head + '\'' +
                '}';
    }
}
