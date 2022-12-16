package Homework.HomeWork_6.Version_1;

import java.util.Objects;
import java.util.Scanner;

public class metod {
    /**
     * Метод фильтра по бренду
     */
    public static void brend(Bazza[] Baza) { // фильтр бренда
        while (true) {
            System.out.print("\nДоступны: Apple, HUAVEI, MSI, GIGABYTE, HP, Honor, Acer, Lenovo\nКакого бренда интересует вас ноутбук: ");
            Scanner iScanner = new Scanner(System.in);
            String vibor = iScanner.nextLine();
            if (Objects.equals(vibor, "Apple")) {
                System.out.print(Bazza.getloptopBrandFUUL(Baza, "Apple"));
                break;
            } else if (Objects.equals(vibor, "HUAWEI")) {
                System.out.print(Bazza.getloptopBrandFUUL(Baza, "HUAWEI"));
                break;
            } else if (Objects.equals(vibor, "MSI")) {
                System.out.print(Bazza.getloptopBrandFUUL(Baza, "MSI"));
                break;
            } else if (Objects.equals(vibor, "GIGABYTE")) {
                System.out.print(Bazza.getloptopBrandFUUL(Baza, "GIGABYTE"));
                break;
            } else if (Objects.equals(vibor, "HP")) {
                System.out.print(Bazza.getloptopBrandFUUL(Baza, "HP"));
                break;
            } else if (Objects.equals(vibor, "Honor")) {
                System.out.print(Bazza.getloptopBrandFUUL(Baza, "Honor"));
                break;
            } else if (Objects.equals(vibor, "Acer")) {
                System.out.print(Bazza.getloptopBrandFUUL(Baza, "Acer"));
                break;
            } else if (Objects.equals(vibor, "Lenovo")) {
                System.out.print(Bazza.getloptopBrandFUUL(Baza, "Lenovo"));
                break;
            } else {
                System.out.print("Нет такого попробуй еще");
            }
        }
    }

    /**
     * Метод фильтра по цвету
     */
    public static void Collore(Bazza[] Baza) { //фильтр цвета
        while (true) {

            System.out.print("Доступные цвета: silver, black\nКакого Цвета интересует вас ноутбук: ");
            Scanner iScanner = new Scanner(System.in);
            String vibor = iScanner.nextLine();
            if (Objects.equals(vibor, "silver")) {
                System.out.print(Bazza.getCollore(Baza, "silver"));
                break;
            } else if (Objects.equals(vibor, "black")) {
                System.out.print(Bazza.getCollore(Baza, "black"));
                break;
            } else {
                System.out.print("Нет такого попробуй еще");
            }
        }
    }

    /**
     * Метод фильтра по системе
     */

    public static void getOS(Bazza[] Baza) {
        while (true) {
            System.out.print("\nДоступные системы: Windows, БЕЗ OS, MacOS\nКакая система вас интересует ? : ");
            Scanner iScanner = new Scanner(System.in);
            String vibor = iScanner.nextLine();
            if (Objects.equals(vibor, "Windows")) {
                System.out.print(Bazza.getOSS(Baza, "Windows"));
                break;
            } else if (Objects.equals(vibor, "БЕЗ OS")) {
                System.out.print(Bazza.getOSS(Baza, "БЕЗ OS"));
                break;
            } else if (Objects.equals(vibor, "MacOS")) {
                System.out.print(Bazza.getOSS(Baza, "MacOS"));
                break;
            } else {
                System.out.print("Нет такого попробуй еще");
            }
        }
    }

    /**
     * Метод фильтра по процессору
     */
    public static void getprogg(Bazza[] Baza) {
        while (true) {
            System.out.print("\nДоступные процессоры: AMD, intel, M1 pro, M1\nКакой процессор вас интересует ? : ");
            Scanner iScanner = new Scanner(System.in);
            String vibor = iScanner.nextLine();
            if (Objects.equals(vibor, "AMD")) {
                System.out.print(Bazza.getprog(Baza, "AMD"));
                break;
            } else if (Objects.equals(vibor, "intel")) {
                System.out.print(Bazza.getprog(Baza, "intel"));
                break;
            } else if (Objects.equals(vibor, "M1 pro")) {
                System.out.print(Bazza.getprog(Baza, "M1 pro"));
                break;
            } else if (Objects.equals(vibor, "M1")) {
                System.out.print(Bazza.getprog(Baza, "M1"));
                break;
            } else {
                System.out.print("Нет такого попробуй еще");

            }
        }
    }


    /**
     * Метод фильтра по ram
     */
    public static void GETRAMM(Bazza[] Baza) {
        while (true) {
            System.out.print("\nДоступные варианты: 8,16\nКакое количество RAM вас интересует ? : ");
            Scanner iScanner = new Scanner(System.in);
            Integer vibor = iScanner.nextInt();
            if (Objects.equals(vibor, 16)) {
                System.out.print(Bazza.getRAM(Baza, 16));
                break;
            } else if (Objects.equals(vibor, 8)) {
                System.out.print(Bazza.getRAM(Baza, 8));
                break;
            } else {
                System.out.print("Нет такого попробуй еще");
            }
        }
    }

    /**
     * Метод фильтра по SSD
     */
    public static void SSDD(Bazza[] Baza) { //фильтр ОС
        while (true) {
            System.out.print("\nДоступные варианты: 128, 256, 512 \nКакого размера SSD вас интересует? : ");
            Scanner iScanner = new Scanner(System.in);
            Integer vibor = iScanner.nextInt();
            if (Objects.equals(vibor, 128)) {
                System.out.print(Bazza.getSSD(Baza, 128));
                break;
            } else if (Objects.equals(vibor, 256)) {
                System.out.print(Bazza.getSSD(Baza, 256));
                break;
            } else if (Objects.equals(vibor, 512)) {
                System.out.print(Bazza.getSSD(Baza, 512));
                break;
            } else {
                System.out.print("Нет такого попробуй еще");
            }
        }
    }

}
