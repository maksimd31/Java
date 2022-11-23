package Homework.HomeWork_1;
/*
 * Реализовать простой калькулятор (операции + - / * )
 */
// public class HomeWork_3 {
    
// }
//package Homework.HomeWork_1;
import java.util.Scanner;
/*
Реализовать калькулятор
 */
public class HomeWork_3 {
    public static void main(String[] args) {
        System.out.println("Что будем делать?");
        System.out.println("1 - Сложение");
        System.out.println("2 - Разница");
        System.out.println("3 - Деление");
        System.out.println("4 - Умножение");
        Scanner sc = new Scanner(System.in);
        System.out.print("Отлично! Начнем : ");
        int vibor = sc.nextInt();
        System.out.print("Введите первое число : ");
        int x = sc.nextInt();
        System.out.print("Введите второе число : ");
        int y = sc.nextInt();
        int c = 0;

        switch (vibor){
            case 1:
                c = x + y;
                System.out.printf("Ответ %d",c);
                break;

            case 2:
                c = x - y;
                System.out.printf("Ответ %d",c);
                break;

            case 3:
                c = x / y;
                System.out.printf("Ответ %d",c);
                break;

            case 4:
                c = x * y;
                System.out.printf("Ответ %d",c);
                break;

        }
//    public static void main(String[] args) {
//        System.out.println("Что будем делать?");
//        System.out.println("1 - Сложение");
//        System.out.println("2 - Разница");
//        System.out.println("3 - Деление");
//        System.out.println("4 - Умножение");
//        Scanner sc = new Scanner(System.in);
//        vibor = sc.nextInt();
//        System.out.println("Введите первое число");
//        x = sc.nextInt();
//        System.out.println("Введите второе число");
//        y = sc.nextInt();
//
//        switch (vibor){
//            case 1:
//                c = x + y;
//                System.out.print("Ответ",c);
//                break;
//
//            case 2:
//                c = x - y;
//                System.out.print("Ответ",c);
//                break;
//
//            case 3:
//                c = x / y;
//                System.out.print("Ответ",c);
//                break;
//
//            case 4:
//                c = x * y;
//                System.out.print("Ответ",c);
//                break;
//        }
    }
}
