package com.bridgelabz.empWage;
public class emWageSwitchUC4 {
    public static void main(String[] args) {
        int isEmpPresent = 1;
        int isEmpParttime = 2;
        int Emp_Wage_Hr = 20;
        int Emp_Day_Hr = 8;
        int EmpParttime_Day_Hr = 4;
        int empcheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empcheck){
            case 0 :
                System.out.println("Employee Is Absent");
                break;
            case 1 :
                System.out.println("Employee is Present");
                System.out.println("Daily Wage for a Day is " + Emp_Day_Hr * Emp_Wage_Hr);
                break;
            case 2 :
                System.out.println("Employee Is Part Time");
                System.out.println("Daily Wage for a Day is " +Emp_Wage_Hr * EmpParttime_Day_Hr);
                break;
            default:
                System.out.println("Invalid Data");
        }
        }
    }
