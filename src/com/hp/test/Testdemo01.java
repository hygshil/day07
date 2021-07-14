package com.hp.test;

import java.util.Date;

/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 *
 *
 */
public class Testdemo01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("当前的时间为" + date);
        long time = date.getTime();  //获取时间的long值
        time+=1000*60*60*24*3L;  //计算三天的时间
        date.setTime(time);
        System.out.println("三天后的时间为" + date);
    }

}
