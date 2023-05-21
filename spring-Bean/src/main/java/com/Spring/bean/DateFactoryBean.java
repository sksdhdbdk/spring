package com.Spring.bean;

import org.springframework.beans.factory.FactoryBean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFactoryBean implements FactoryBean<Date> {
    public DateFactoryBean(String date) {
        this.date = date;
    }

    private String date;
    @Override
    public Date getObject() throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = dateFormat.parse(date);
        return date1;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
