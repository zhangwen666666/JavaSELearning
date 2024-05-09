package com.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.println(year + "年" + (month + 1) + "月" + day + "日" +
                hour + "时" + minute + "分" + second + "秒");//2024年5月9日14时34分34秒


        calendar.set(2000,Calendar.SEPTEMBER,8);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = "2000-12-22 13:14:30";
        Date date = sdf.parse(time);
        calendar.setTime(date);
        System.out.println(calendar);
    }
}
