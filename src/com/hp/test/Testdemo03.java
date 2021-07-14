package com.hp.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 */
public class Testdemo03 {
    public static void main(String[] args) throws ParseException {
        System.out.println("生日格式例如：2001-03-16");
        System.out.println("请输入你的生日：");
        Scanner scanner = new Scanner(System.in);
        String birthday = scanner.nextLine();
        Date date = new Date();
        String pattern="yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String dateStr = sdf.format(date); //指定日期格式
        Date birthdaytime = sdf.parse(birthday);  //转换成日期格式
        long l = date.getTime() - birthdaytime.getTime(); //相减后的long值
        long l1 =l/1000/60/60/24;
        long l2 = l1 / 7;
        System.out.println("生日到今天经历了" + l2+"周");
    }
}
