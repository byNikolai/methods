import java.time.LocalDate;

public class Main {
    public static int detectLeapYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0) {
            System.out.println(+year + " год является високосным");
        } else {
            System.out.println(+year + " год не является високосным");
        }
        return year;
    }

    public static void detectOSAndYear(int os, int year) {
        int currentYear = LocalDate.now().getYear();
        if (os == 0 && year == currentYear) {
            System.out.println("Install our app from AppStore!");
        } else if (os == 1 && year == currentYear) {
            System.out.println("Install our app from PlayMarket!");
        } else if (os == 0 && year < currentYear) {
            System.out.println("Install light version of our app from AppStore!");
        } else if (os == 1 && year < currentYear) {
            System.out.println("Install light version of our app from PlayMarket!");
        }
    }

    public static void  detectAreaOfDelivery(int distance) {
        int waitTime = 1;
        if (distance <= 20) {
            System.out.println("Потребуется дней: " + waitTime);
        } else if (distance > 20 && distance <= 60) {
            waitTime = 2;
            System.out.println("Потребуется дней: " + waitTime);
        } else if (distance > 60 && distance <= 100) {
            waitTime = 3;
            System.out.println("Потребуется дней: " + waitTime);
        } else {
            System.out.println("Доставки нет, вы слишком далеко :с");
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }



    public static void task1() {
        System.out.println("Задача 1");
        int year = detectLeapYear(2024);
    }

    public static void task2() {
        System.out.println("Задача 2");
        detectOSAndYear(1,2015);
    }

    public static void task3() {
        System.out.println("Задача 3");
        detectAreaOfDelivery(54);
    }
}