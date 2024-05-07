package com.exception.bookManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
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
}
