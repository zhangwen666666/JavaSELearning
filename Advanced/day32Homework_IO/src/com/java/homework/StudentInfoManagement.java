package com.java.homework;

//1、请使用序列化和反序列化机制，完成学生信息管理系统。
//        系统打开时显示以下信息：
//        欢迎使用学生信息管理系统，请认真阅读以下使用说明：
//        请输入不同的功能编号来选择不同的功能：
//        [1]查看学生列表
//        [2]保存学生
//        [3]删除学生
//        [4]查看某个学生详细信息

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentInfoManagement {

    //保存学生信息的HashMap集合
    private static HashMap<Integer, Student> students = null;

    //判断students集合从加载到内存之后有没有被修改
    private static boolean isModify = false;

    public static void main(String[] args) {
        students = loadFile();
        boolean flag = true;
        menu();
        do {
            System.out.print("\n请输入你要执行的功能:");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            switch (option) {
                case 0:
                    System.out.println("成功退出学生信息管理系统");
                    flag = false;
                    break;
                case 1:
                    showInfo();
                    break;
                case 2:
                    saveInfo();
                    break;
                case 3:
                    removeInfo();
                    break;
                case 4:
                    showStudentInfo();
                    break;
                default:
                    System.out.println("你输入的选择无效");
                    break;
            }
        } while (flag);
        if (isModify)
            saveFile();
    }

    //打印功能菜单
    private static void menu() {
        System.out.println("欢迎使用学生信息管理系统，请认真阅读以下使用说明：");
        System.out.println("请输入不同的功能编号来选择不同的功能");
        System.out.println("[0]退出学生信息管理系统");
        System.out.println("[1]查看学生列表");
        System.out.println("[2]保存学生");
        System.out.println("[3]删除学生");
        System.out.println("[4]查看某个学生详细信息");
    }

    //显示所有学生信息
    public static void showInfo() {
        if (students.isEmpty())
            System.out.println("学生信息表为空");
        else {
            System.out.println("学号\t\t姓名\t\t性别\t\t生日");
            Set<Map.Entry<Integer, Student>> entrySet = students.entrySet();
            for (Map.Entry<Integer, Student> elem : entrySet) {
                System.out.println(elem.getValue());
            }
        }
    }

    //保存某个学生的信息(添加学生)
    public static void saveInfo() {
        System.out.println("请输入你要保存的学生的信息：");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学号：");
        int no = scanner.nextInt();
        System.out.print("请输入姓名：");
        String name = scanner.next();
        System.out.print("请输入性别：");
        String sex = scanner.next();
        System.out.print("请输入生日：");
        String birth = scanner.next();

        students.put(no, new Student(no, name, sex, birth));
        System.out.println("成功保存该学生");
        isModify = true;
    }

    //删除学生
    public static void removeInfo() {
        System.out.print("请输入你要删除的学生的学号：");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        if(!isExist(no)){
            System.out.println("不存在该学生");
            return;
        }
        printStudentInfo(no);
        System.out.println("是否确认删除该学生, 输入0表示取消，其他表示确认");
        System.out.print("请输入：");
        int flag = scanner.nextInt();
        if(flag == 0){
            System.out.println("取消删除该学生");
        }
        else{
            students.remove(no);
            System.out.println("成功删除该学生");
            isModify=true;
        }
    }

    //查看某个学生的信息
    public static void showStudentInfo() {
        System.out.print("请输入你要查看的学生的学号：");
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        if(!isExist(no)){
            System.out.println("不存在该学生");
            return;
        }
        printStudentInfo(no);
    }

    //判断某个学生是否存在
    private static boolean isExist(int no){
        return students.get(no) != null;
    }

    //打印学生信息
    private static void printStudentInfo(int no){
        System.out.println("学号\t\t姓名\t\t性别\t\t生日");
        System.out.println(students.get(no));
    }

    //加载文件中保存的学生信息
    private static HashMap loadFile() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("E:\\students"));
            HashMap<Integer, String> students = (HashMap<Integer, String>) ois.readObject();
            return students;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    //将学生信息保存到文件中
    private static void saveFile() {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("E:\\students"));
            oos.writeObject(students);
            oos.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
