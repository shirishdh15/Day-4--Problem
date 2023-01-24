package Day4;

import java.util.Random;
public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        Random attendance = new Random();
        int atndc = attendance.nextInt(2);
        if (atndc == 0) {
            System.out.println("employee is absent");
        } else {
            System.out.println("employee is present");

            int wagePerHour = 20;
            int fullDay = 8;
            int dailyWage = (wagePerHour * fullDay);
            System.out.println("Daily employee Wage is  " + dailyWage);

            int partTimeWage = 10;
            int partTimeHour = 8;
            int partimeWage = (partTimeWage * partTimeHour);
            System.out.println("Part time wage is  " + partimeWage);

            switch (atndc) {
                case 0:
                    System.out.println("Absent");
                    break;
                case 1:
                    System.out.println("Present");
                    break;
            }
            int workingDayMonth = 20;
            int wageInMonth = (workingDayMonth * dailyWage);
            System.out.println("Wage in a month is  " + wageInMonth);

            int workingHours = 0;
            int workingDay = 0;
            int wage;
            while (workingHours <= 100 || workingDay <= 20) {
                wage = workingHours * workingDay;
                workingHours++;
                workingDay++;
            }
        }
    }
}
