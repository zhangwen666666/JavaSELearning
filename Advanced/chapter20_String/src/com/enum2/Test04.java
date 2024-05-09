package com.enum2;

public class Test04 {
    public static void main(String[] args) {
        Season season = getSeason();
        switch (season) {
            case SPRING -> System.out.println(season.getDesc());
            case SUMMER -> System.out.println(season.getDesc());
            case AUTUMN -> System.out.println(season.getDesc());
            case WINTER -> System.out.println(season.getDesc());
        }

        //遍历枚举
        Season[] seasons = Season.values();
        for (Season s : seasons) {
            System.out.println(s.getName() + "---->" + s.getDesc());
            s.eat();
        }
    }

    private static Season getSeason() {
        return Season.SPRING;
    }
}
