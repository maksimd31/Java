package Homework.HomeWork_4;

import java.io.IOException;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*
Вариант c  рандома, но с работающим Collections.reverse(earlBio); + logger + замер времени выполнения программы.
Пытался прикрутить цветовую палитру в logger. Но цвета срабатывают только в консоли в logger цвета не меняются.
 */

/*
1.Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

 */
public class task_1_2 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();//Старт замера времени


        Logger logger = Logger.getLogger(task_1_2.class.getName());//init log
        FileHandler fh = null; //создаем log
        try {
            fh = new FileHandler("logTask_1_2.log", true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logger.addHandler(fh); //Объект используется для регистрации сообщений для конкретной системы или компонента приложения.
        SimpleFormatter log = new SimpleFormatter();
        fh.setFormatter(log);


        Random rnd = new Random();
        List<Integer> earlBio = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            earlBio.add(rnd.nextInt(100));
        }//добавляем в него рандомный массив//создаем linkedList
//        earlBio.add(1);//добавляем в него рандомный массив
//        earlBio.add(2);
//        earlBio.add(3);
//        earlBio.add(4);
//        earlBio.add(5);
//        earlBio.add(6);
//        earlBio.add(7);
//        earlBio.add(8);
//        earlBio.add(9);
//        earlBio.add(10);

            System.out.printf("Запись в LinkedList: %s \n", earlBio); //Внутри LinkedList нет массива, как в ArrayList, или чего-то похожего.
            // Вся работа с ArrayList (по большому счету) сводится к работе с внутренним массивом.
            logger.info("Запись в LinkedList: " + Arrays.toString(new List[]{earlBio})
                    + "\n_____________________________________________________");

            Collections.reverse(earlBio); //разворот списка
            System.out.printf("Развернутый список: %s \n", earlBio);
            logger.info("Развернутый список:" + Arrays.toString(new List[]{earlBio})
                    + "\n_____________________________________________________");


            System.out.print("Время работы для LinkedList (в миллисекундах) = " + (System.currentTimeMillis() - start));//вывод и замер времени
            logger.info("Время работы для LinkedList (в миллисекундах)" + +(System.currentTimeMillis() - start)
                    + "\n*====================================================*");
        }

    private static void extracted() {
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_RESET = "\u001B[0m";
        String ANSI_BLACK = "\u001B[30m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_PURPLE = "\u001B[35m";
        String ANSI_CYAN = "\u001B[36m";
        String ANSI_WHITE = "\u001B[37m";
    }
}
/*
В LinkedList элементы фактически представляют собой звенья одной цепи. У каждого элемента помимо тех данных, которые он хранит, имеется ссылка на предыдущий и следующий элемент. По этим ссылкам можно переходить от одного элемента к другому.
 */