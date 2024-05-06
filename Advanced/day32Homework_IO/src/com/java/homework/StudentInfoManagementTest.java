package com.java.homework;

import org.junit.jupiter.api.Test;

public class StudentInfoManagementTest {
    @Test
    public void testMenu(){
        StudentInfoManagement.menu();
    }

    @Test
    public void testShowInfo(){
        StudentInfoManagement.showInfo();
    }

    @Test
    public void testSaveInfo(){
        StudentInfoManagement.saveInfo();
        StudentInfoManagement.showInfo();
    }
}
