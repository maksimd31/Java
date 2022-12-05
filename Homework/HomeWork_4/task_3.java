import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Scanner;
import java.io.IOException; //Сигналы о том, что произошло какое-либо исключение ввода-вывода. Этот класс является общим классом исключений, вызванных неудачными или прерванными операциями ввода-вывода.
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.*;

public class task_3 {
    /*
    3.* (дополнительное задание, сдавать не обязательно)
     В калькулятор добавьте возможность отменить последнюю операцию.
     *
/*
Реализовать калькулятор (Прикрутить его к логгеру)
 */

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task_3.class.getName()); //init
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
//        logger.info(str); //запмсываем в логгер / записывается только в str


        switch (vibor) {
            case 1:
                c = x + y;
                System.out.printf("Ответ %d", c);
                break;

            case 2:
                c = x - y;
                System.out.printf("Ответ %d", c);
                break;

            case 3:
                c = x / y;
                System.out.printf("Ответ %d", c);
                break;

            case 4:
                c = x * y;
                System.out.printf("Ответ %d", c);
                break;

        }

        logger.info("Действие: 1.Сложение 2.Разница 3.Деление 4.Умножение " +
                "\nПервое число: " +
                Float.toString(x) +
                "\nДействие: " +
                str + "\nВторое число: " +
                Float.toString(y) +
                "\nВердикт: " +
                deque(c) + "\nРавно: = " +
                c + "\n***************************************"); //перебор вывода в логер
        //блок стека DEQUE
//        deque(c);


    }

    private static Object deque(int c) {
        ArrayDeque<Integer> arr = new ArrayDeque<>();
        arr.add(c);
        System.out.print("\nПоследняя операция" + arr
                + "\nБудем отменять последнюю операцию?\n да/нет\nВвод: ");
        Scanner SS = new Scanner(System.in); //Считываем с клавы
        String VV = SS.next(); // записываем результат в переменную

        if (Objects.equals(VV, "да")) {
            arr.removeLast();
            System.out.println("Все готово откатили последнюю операцию, не понято н за чем");
        } else if (Objects.equals(VV, "нет")) {
            System.out.print("не очень то откатывать и хотелось");
        } else {
            System.out.print("Промазал завай по новой");
//            return VV;
        }
        return VV;
    }

}