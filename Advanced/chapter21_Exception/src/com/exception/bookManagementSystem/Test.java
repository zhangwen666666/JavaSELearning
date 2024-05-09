package com.exception.bookManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    /*
    public static void main(String[] args) {
        menu();
        Stock stock = new Stock(new ArrayList<BookItem>());
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("请选择你要进行的操作：");
            int opt = scanner.nextInt();
            if (opt < 0 || opt > 6) {
                System.out.println("你的选择有误，请重新选择！！！");
                continue;
            }
            switch (opt) {
                case 0 -> {
                    System.out.println("成功退出管理系统");
                    flag = false;
                }

                case 1 -> {
                    boolean ret = false;
                    try {
                        ret = stock.lendBook();
                    } catch (BookNotFoundException e) {
                        e.printStackTrace();
                    } finally {
                        if (ret)
                            System.out.println("借书成功");
                        else
                            System.out.println("借书失败");
                    }
                }

                case 2 -> {
                    boolean ret = false;
                    try {
                        ret = stock.returnBook();
                    } catch (BookNotFoundException e) {
                        e.printStackTrace();
                    } finally {
                        if (ret)
                            System.out.println("还书成功");
                        else
                            System.out.println("还书失败");
                    }
                }

                case 3 -> {
                    try {
                        Book book = stock.findBook();
                        System.out.println(book);
                    } catch (BookNotFoundException e) {
                        e.printStackTrace();
                    }
                }

                case 4 -> {
                    if (stock.addBook())
                        System.out.println("添加成功");
                    else
                        System.out.println("添加失败");
                }

                case 5 -> {
                    boolean ret = false;
                    try {
                        ret = stock.deleteBook();
                    } catch (BookNotFoundException e) {
                        e.printStackTrace();
                    }finally {
                        if(ret)
                            System.out.println("删除成功");
                        else
                            System.out.println("删除失败");
                    }
                }

                case 6 -> stock.display();
            }
        }
    }
     */


    private static void menu() {
        System.out.println("---------欢迎来到图书管理系统------------");
        System.out.println("----------     [1]借书     ------------");
        System.out.println("----------     [2]还书     ------------");
        System.out.println("---------    [3]查找图书    ------------");
        System.out.println("----------   [4]添加图书    ------------");
        System.out.println("----------   [5]删除图书    ------------");
        System.out.println("----------  [6]显示所有图书  ------------");
        System.out.println("----------   [0]退出系统    ------------");
    }

    public static void main(String[] args) {
        String str1 = "javac++cpythonjavaphp".replace("java", "golang");
        System.out.println(str1);//golangc++cpythongolangphp
        String str2 = "a1c23b4n35d76f9q0".replaceAll("\\d", "");
        System.out.println(str2);//acbndfq
        String[] split = "a123d321n123jldj32ka".split("\\d+");
        for (String s : split) {
            System.out.print(s);//202405081711
        }
        System.out.println();

        String str = "1813505899@qq.com";
        System.out.println(str.matches("[1-9]{1}[0-9]{4,}@[q]{2}\\.com"));

        String s1 = new String("abc");
        System.out.println(s1);
        StringBuilder s2 = new StringBuilder("abc");
        System.out.println(s2);
        //equals方法在判断时会先判断s1和s2是否是同一个类型
        //这里由于s1和s2是两种不同的类型，所以equals方法会直接返回false
        System.out.println(s1.equals(s2));

        StringBuilder ss1 = new StringBuilder("ssss");
        StringBuilder ss2 = ss1.append("hello");
        System.out.println(ss1==ss2);
    }
}
