package com.bridgelabz.empWage;

public class empParttimeWageUC3 {
    public static void main(String[] args) {
        int isEmpPresent = 1;
        int isEmpParttime = 2;
        int Emp_Wage_Hr = 20;
        int Emp_Day_Hr = 8;
        int EmpParttime_Day_Hr = 4;
        double empcheck = Math.floor(Math.random() * 10) % 3;
        if (empcheck == isEmpPresent){
            System.out.println("Employee Is Present");
            System.out.println("Employee Daily Wage is " + Emp_Wage_Hr * Emp_Day_Hr);

        } else if (empcheck == isEmpParttime) {
            System.out.println("Employee Is Part Time");
            System.out.println("Employee Daily Wage is " + Emp_Wage_Hr * EmpParttime_Day_Hr);
        }else {
            System.out.println("Employee Is Absent");
        }
    }
}
