package Homework.HomeWork_2;
import java.util.Scanner;
import java.io.IOException; //Сигналы о том, что произошло какое-либо исключение ввода-вывода. Этот класс является общим классом исключений, вызванных неудачными или прерванными операциями ввода-вывода.
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.*;
public class task_3 {
/*
Реализовать калькулятор (Прикрутить его к логгеру)
 */

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args)throws IOException {
        Logger logger  = Logger.getLogger(task_3.class.getName()); //init
        // Scanner iScanner = new Scanner(System.in);
        System.out.println("Что будем делать?");
        System.out.println("1 - Сложение");
        System.out.println("2 - Разница");
        System.out.println("3 - Деление");
        System.out.println("4 - Умножение");
        System.out.print("Отлично! Начнем : ");
        Scanner sc = new Scanner(System.in); //Считываем с клавы 
        int vibor = sc.nextInt(); // записываем результат в переменную 


        System.out.print("Введите первое число : "); 
        int x = sc.nextInt();//записываем результат в переменную 
        logger.info(Integer.toString(x)); // записываем в логгер 


        System.out.print("Введите второе число : ");
        int y = sc.nextInt();
        logger.info(Integer.toString(y));// записываем в логгер 

        int c = 0; //счетчик 
        
        FileHandler fh = new FileHandler("logTask_3.log", true); //создаем log 
        logger.addHandler(fh); //Объект используется для регистрации сообщений для конкретной системы или компонента приложения.
        SimpleFormatter log = new SimpleFormatter();
        fh.setFormatter(log);
        String str = String.format("%d", vibor); //форматируем int в string 
        logger.info(str); //запмсываем в логгер / записывается только в str 

        
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
            logger.info(Float.toString(x) + " " + str + " " + Float.toString(y) + " " + "=" + " " + c); //перебор вывода в логер
        

    }
}
