package com.date;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//继承Converter<String , Date>  重写convert
public class date implements Converter<String , Date> {
    @Override
    public Date convert(String s) {
        if(s==null){
            throw new RuntimeException("请你传一个正当的数据来");
        }
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return  df.parse(s);
        } catch (Exception e) {
            throw new RuntimeException("请你传一个正当的数据来");
        }
    }
}
