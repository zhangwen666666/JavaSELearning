package com.calendar;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTimeTest {
    /*
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);  //2024-05-09T14:46:09.459958
        LocalDateTime localDateTime = LocalDateTime.of(2000,12,22,13,14);
        System.out.println(localDateTime);//2000-12-22T13:14

        LocalDateTime ldt = localDateTime.plusYears(1).plusMonths(1).plusDays(2).plusMinutes(30);
        System.out.println(ldt);//2002-01-24T13:44

        LocalDateTime ldt2 = localDateTime.minusYears(10).minusHours(3);
        System.out.println(ldt2);//1990-12-22T10:14
        System.out.println(now.getYear());
        System.out.println(now.getMonth());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getDayOfYear());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());

        Instant instant = Instant.now();
        System.out.println(instant);
        long epochMilli = instant.toEpochMilli();
        System.out.println(epochMilli); //1715238405351

        LocalDateTime now1 = LocalDateTime.of(2008,8,8,8,8,8);
        LocalDateTime now2 = LocalDateTime.of(2009,9,9,9,9,9);
        Duration between1 = Duration.between(now1, now2);
        // 两个时间差多少个小时
        System.out.println(between1.toHours());//9529
        // 两个时间差多少天
        System.out.println(between1.toDays());// 397

        LocalDate date1 = LocalDate.of(2007,7,31);
        LocalDate date2 = LocalDate.of(2008,8,8);
        Period between = Period.between(date1, date2);
        // 相差年数
        System.out.println(between.getYears());//1
        // 相差月数
        System.out.println(between.getMonths());//0
        // 相差天数
        System.out.println(between.getDays());//8
    }

     */

    public static void main(String[] args) {
//        LocalDateTime now = LocalDateTime.now(); // 获取系统当前时间
//        System.out.println(now);//2024-05-09T15:26:54.316268600
//        LocalDateTime t1 = now.with(TemporalAdjusters.firstDayOfMonth()); // 当前月的第一天
//        System.out.println(t1);//2024-05-01T15:26:54.316268600
//        LocalDateTime t2 = now.with(TemporalAdjusters.firstDayOfNextYear()); // 下一年的第一天
//        System.out.println(t2);//2025-01-01T15:26:54.316268600v
//        LocalDateTime t3 = now.with(TemporalAdjusters.lastDayOfYear()); // 本年最后一天
//        System.out.println(t3);//2024-12-31T15:26:54.316268600
//        LocalDateTime t4 = now.with(TemporalAdjusters.lastDayOfMonth()); // 本月最后一天
//        System.out.println(t4);//2024-05-31T15:26:54.316268600
//        LocalDateTime t5 = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY)); // 下周一
//        System.out.println(t5);//2024-05-13T15:26:54.316268600

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String time = df.format(now);
        System.out.println(time);

        String s = "05/09/2024 15:33:30";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse(s, dtf);
        System.out.println(ldt);//2024-05-09T15:33:30
    }
}
