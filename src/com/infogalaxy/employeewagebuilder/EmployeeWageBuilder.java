package com.infogalaxy.employeewagebuilder;
import java.util.Random;
public class EmployeeWageBuilder {

    int working_days = 0;
    int working_hrs = 0;
    int total_wage =0;
    Random random =new Random();

    public void empwagecalculate() {
        System.out.println("Welcome to Employee wage calculation problem");
        while (working_hrs <= constants.TOTAL_WORKING_HRS && working_days < constants.WORKING_DAYS) {
            working_days++;
            System.out.println("Day : " + working_days);
            int empAttendance = random.nextInt() % 2;
            if (empAttendance == constants.IS_ABSENT) {
                System.out.println("Employee is Absent.");
            } else {
                System.out.println("Employee is Present.");
                int emptype = random.nextInt() % 2;
                if (emptype < 0) {
                    emptype = -emptype;
                }
                switch (emptype) {
                    case constants.IS_PART_TIME:
                        System.out.println("Employee is part time..");
                        total_wage = total_wage + (constants.WAGE_PER_HR * constants.PART_TIME_HR);
                        working_hrs = working_hrs + constants.PART_TIME_HR;
                        break;
                    case constants.IS_FULL_TIME:
                        System.out.println("Employee IS Full Time..");
                        total_wage = total_wage + (constants.WAGE_PER_HR * constants.FULL_TIME_HR);
                        working_hrs = working_hrs + constants.FULL_TIME_HR;
                        break;
                }
            }
        }
    }
    public void showEmpwage() {
        System.out.println("Total Wage =" + total_wage);
        System.out.println("total working hrs =" + working_hrs);
    }
    public static void main(String[] args){
        EmployeeWageBuilder    EmployeeWageBuilder = new EmployeeWageBuilder();
        EmployeeWageBuilder.empwagecalculate();
        EmployeeWageBuilder.showEmpwage();
        }
    }




