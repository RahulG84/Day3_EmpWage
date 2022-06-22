package com.bridgelabz.empWage;

public class EmpWageForMonthUC5 {
    int isPartTime = 1;
    int isFullTime = 2;
    static int empRatePerHr = 20;
    static int numOfWorkingDays = 20;

    public static void main(String[] args) {
        // Variables
        int empHrs = 0, empWage = 0, totalEmpWage = 0;
        // Computation
        for (int day = 0; day < numOfWorkingDays; day++) {
            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
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
            empWage = empHrs * empRatePerHr;
            totalEmpWage += empWage;
            System.out.println("Emp Wage: " + empWage);
        }
        System.out.println("Total Emp Wage: " + totalEmpWage);
    }
}
