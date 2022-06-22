package com.bridgelabz.empWage;

public class EmpWageBuilderUC1 {
    public static void main(String[] args) {
        int isEmPresent = 1;
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == isEmPresent){
            System.out.println("Employee is present");
        }else {
            System.out.println("Emloyee is Absent");
        }
    }
}
