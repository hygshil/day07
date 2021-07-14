package com.hp.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 */
public class Testdemo04 {
    public static void main(String[] args) throws ParseException {
        System.out.println("日期格式例如：2001-03-16");
        System.out.println("请输入生产日期:");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        System.out.println("请输入保质期的天数");
        int number = scanner.nextInt();
        //修改日期显示格式为"yyyy-MM-dd"
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(data);   //把接收的日期转换为这个格式
        //创建日历对象
        Calendar calendar = Calendar.getInstance();
        //给保质期添加天数
        calendar.add(Calendar.DAY_OF_YEAR, number);
        //减去2周    也可以 减去14天（calendar.DAY_OF_YEAR, -14）
        calendar.add(Calendar.WEEK_OF_YEAR, -2);
        //calendar.add(Calendar.DAY_OF_YEAR, -14);
        //设置确定的日期周几(当前的周三日期 )
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
        //获取时间
        date = calendar.getTime();
        String number1 = sdf.format(date);
        System.out.println("促销日期为" + number1);
    }
}
