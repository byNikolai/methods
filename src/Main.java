import java.time.LocalDate;

public class Main {


    public static void detectLeapYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0) {
            System.out.println(year + " is leap year!");
        } else {
            System.out.println(year + " is not leap year!");
        }
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

    public static int detectAreaOfDelivery(int distance) {
        int waitTime = 0;
        if (distance > 20) {
            waitTime = waitTime + 1;
            if (distance > 20 && distance <= 60) {
                waitTime = waitTime + 2;
            } else if (distance > 60 && distance <= 100) {
                waitTime = waitTime + 3;
            }
        }return waitTime;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }



    public static void task1() {
        System.out.println("Задача 1");
        detectLeapYear(2023);
    }

    public static void task2() {
        System.out.println("Задача 2");
        detectOSAndYear(1,2015);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int yourArea = detectAreaOfDelivery(54);
        System.out.println("Дней до доставки : " + yourArea);
    }
}