package com.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest03 {
    public static void main(String[] args) {
        //创建TreeSet集合时需要使用比较器
        TreeSet<User> ts = new TreeSet<>(new Comparator<User>(){
            public int compare(User u1,User u2){
                return u2.age - u1.age;
            }
        });
        ts.add(new User(23));
        ts.add(new User(13));
        ts.add(new User(33));

        for(User u : ts){
            // User{age=13}  User{age=23}  User{age=33}
            System.out.print(u + "  ");
        }
    }
}

class User{
    int age;
    public User(int age){this.age = age;}

    public String toString() {
        return "User{" + "age=" + age + '}';
    }
}

class UserComparator implements Comparator<User>{
    public int compare(User u1,User u2){
        return u1.age - u2.age;
    }
}
