package com.bridgelabz.empWage;

public class RefactorCodeClass_Method {
    int isPartTime = 1;
    int isFullTime = 2;
    public static int maxHrsInMonth = 100;
    static int empRatePerHr = 20;
    static int numOfWorkingDays = 20;

    int computeEmpWage() {
        // Variables
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        // Computation
        while (totalEmpHrs <= maxHrsInMonth &&
                totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case 0:
                    empHrs = 8;
                    break;
                case 1:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * empRatePerHr;
        System.out.println("Total Emp Wage: " + totalEmpWage);
        return totalEmpWage;
    }
    public static void main(String[] args) {
        RefactorCodeClass_Method Result = new RefactorCodeClass_Method();
        System.out.println("Welcome to the Employee Wage Computation Calculation");
        Result.computeEmpWage();
    }
}