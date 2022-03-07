package com.infogalaxy.employeewagebuilder;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        //Display Welcome massage for User
        System.out.println("Welcome to Employee wage builder Problem Developed by Yash");
        //UC-2 calculate Daily Employee Wage
         final int WAGE_PER_HR = 20 ;
         final  int FULL_DAY_HR = 8;
         int total_wage = 0;
        //UC-1 Checking for Employee Present or Absent
        Random random=new Random();
        int empAttendance=random.nextInt()%2;
        System.out.println(empAttendance);
        if(empAttendance == 0) {
            System.out.println("Employee is Absent.");
        } else {
            System.out.println("Employee is Present.");
            total_wage = WAGE_PER_HR * FULL_DAY_HR;

        }
        System.out.println("total wage ="+ total_wage);

               
            }
        }


