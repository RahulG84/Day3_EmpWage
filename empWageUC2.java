package com.bridgelabz.empWage;

public class empWageUC2 {
    public static void main(String[] args) {
        int isEmpPresent = 1;
        int Emp_Wage_Hr = 20;
        int Emp_Day_Hr = 8;

        double empcheck = (Math.floor(Math.random() * 10) % 2);
        if (empcheck == isEmpPresent){
            System.out.println("Employee is present");
            System.out.println("Employee Daily Wages is " + Emp_Day_Hr * Emp_Wage_Hr);
        }else {
            System.out.println("Employee is Absent Employee Daily Wage is 0");
        }
    }
}
