package com.java.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class StudentData {
    public static List<Student> getStudentList(){
        List<Student> list = new ArrayList<>();
        list.add(new Student("张四",20,"男","北京市"));
        list.add(new Student("李四",45,"女","山西省大同市"));
        list.add(new Student("王五",17,"女","河北省张家口市"));
        list.add(new Student("赵六",62,"男","天津市"));
        list.add(new Student("王八",35,"女","陕西省西安市"));
        return list;
    }
}
