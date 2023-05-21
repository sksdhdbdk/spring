package com.Spring.bean;

import java.util.Date;//在spring为简单类型,但注入的字符串类型有要求
//java.util.Date也可以为非简单类型

public class Student {
    private Date birth;

    @Override
    public String toString() {
        return "Student{" +
                "birth=" + birth +
                '}';
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
