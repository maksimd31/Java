package Homework.HomeWork_4;

import java.io.IOException;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*
2 варианта рандомайзера
Вариант с рандомом (единственный рабочий вариант с рандомом),
с работающим Collections.reverse(earlBio);
+ logger
+ замер времени выполнения программы.
 */
/*
1.Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

 */
public class task_1_3 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();//Старт замера времени 


        Logger logger = Logger.getLogger(task_1_3.class.getName());//init log
        FileHandler fh = null; //создаем log
        try {
            fh = new FileHandler("logTask_1_3.log", true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logger.addHandler(fh); //Объект используется для регистрации сообщений для конкретной системы или компонента приложения.
        SimpleFormatter log = new SimpleFormatter();
        fh.setFormatter(log);


        List<Integer> earlBio = new LinkedList<>(); //создаем linkedList
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            earlBio.add(rnd.nextInt(100));

        }
//        earlBio.add(getRandomNumber(10));//добавляем в него рандомный массив
//        earlBio.add(getRandomNumber(10));
//        earlBio.add(getRandomNumber(10));
//        earlBio.add(getRandomNumber(10));
//        earlBio.add(getRandomNumber(10));
//        earlBio.add(getRandomNumber(10));
//        earlBio.add(getRandomNumber(10));
//


        System.out.printf("Запись в LinkedList: %s \n", earlBio); //Внутри LinkedList нет массива, как в ArrayList, или чего-то похожего.
        // Вся работа с ArrayList (по большому счету) сводится к работе с внутренним массивом.
        logger.info("Запись в LinkedList: " + Arrays.toString(new List[]{earlBio})
                + "\n_____________________________________________________");

        Collections.reverse(earlBio);
        System.out.printf("Развернутый список: %s \n", earlBio);
        logger.info("Развернутый список:" + Arrays.toString(new List[]{earlBio})
                + "\n_____________________________________________________");


        System.out.print("Время работы для LinkedList (в миллисекундах) = " + (System.currentTimeMillis() - start));//вывод и замер времени
        logger.info("Время работы для LinkedList (в миллисекундах)" + +(System.currentTimeMillis() - start)
                + "\n*====================================================*");
    }

//    public static int getRandomNumber(int i) { // генерирует случайное число
//        double x = (Math.random() * 99);
//        int num = (int) x;
//        return num;
//    }


}

/*
В LinkedList элементы фактически представляют собой звенья одной цепи. У каждого элемента помимо тех данных, которые он хранит, имеется ссылка на предыдущий и следующий элемент. По этим ссылкам можно переходить от одного элемента к другому.
 */