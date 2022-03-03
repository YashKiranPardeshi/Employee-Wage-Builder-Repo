package com.infogalaxy.employeewagebuilder;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        //Display Welcome massage for User
        System.out.println("Welcome to Employee wage builder Problem Developed by Yash");
        //UC-1 Checking for Employee Present or Absent
        Random random=new Random();
        int empAttendance=random.nextInt()%2;
        System.out.println(empAttendance);
        if(empAttendance == 0) {
            System.out.println("Employee is Absent");
        } else {
            System.out.println("Employee is Present");
        }
    }
}
