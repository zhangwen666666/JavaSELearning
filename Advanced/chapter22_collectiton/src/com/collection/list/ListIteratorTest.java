package com.collection.list;

import java.util.*;

public class ListIteratorTest {
    /*
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        ListIterator<Integer> lit =list.listIterator(2);
        lit.previous();
        lit.set(100);
//        System.out.println(lit.previousIndex());
//        System.out.println(lit.nextIndex());

//        lit.remove();
//        System.out.println(lit.next());
//        while(lit.hasNext()){
//            int i = lit.next();
//            lit.add(0);
//            System.out.println(i);
//        }
        while(lit.hasPrevious()){
            int i = lit.previous();
            System.out.println(i);
        }
        System.out.println(list);
    }

    /*
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("abc");
        c.add("dasd");
        c.add("fdsc");
        c.add("gr5");
        c.add("hgfkj");

        Iterator<String> it = c.iterator();
        it.remove();
    }
    */

    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User("zhangsan",18));
        list.add(new User("lisi",21));
        list.add(new User("wangwu",15));
        list.add(new User("zhaoliu",24));
        System.out.println(list);

        list.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println(list);

        list.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(list);
    }

}

class User{
    private String name;
    private int age;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
