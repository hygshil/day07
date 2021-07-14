package com.hp.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将当前系统时间以"yyyy-MM-dd HH:mm:ss"格式输出
 */
public class Testdemo02 {
    public static void main(String[] args) {
        Date date = new Date();
        String pattern="yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String dateStr = sdf.format(date);
        System.out.println("当前系统时间为：" + dateStr);
    }
}
