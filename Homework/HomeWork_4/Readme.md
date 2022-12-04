# java: знакомство и как пользоваться базовым API (семинары)
Урок 4. Хранение и обработка данных ч1: приоритетные коллекции
Домашнее задание Семинар 
# 1.Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
## вариант 1
>Вариант 1: пытался прикрутить массив из рандома ничего не вышло все срабатывает до метода Collections.reverse(Arrays.asList(earlBio));
затем он не делает reverse.
```java
import java.util.*;
import java.util.Collections;

/*
Пытался прикрутить массив из рандома ничего не вышло все срабатывает до метода Collections.reverse(Arrays.asList(earlBio));
затем он не делает reverse
 */
/*
1.Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

 */
public class task_1 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();//Старт замера времени 

        int[] arr = RANDOM(); //рандомом заполняем массив
        String arre = new String(Arrays.toString(arr)); // конвертируем в str
        System.out.printf("Массив int: %s \n", arre); //

        List<String> earlBio = new LinkedList<String>(); //создаем linkedList
        earlBio.add(arre); //добавляем в него рандомный массив

        System.out.printf("Запись в LinkedList: %s \n", earlBio); //Внутри LinkedList нет массива, как в ArrayList, или чего-то похожего.
        // Вся работа с ArrayList (по большому счету) сводится к работе с внутренним массивом.

//        Collections.reverse(Arrays.asList(earlBio));
//        System.out.printf("Развернутый список: %s \n", earlBio);


//
//        List<Integer> revData = reverse(earlBio);
//        System.out.printf("Развернутый список: %s \n", earlBio);


//        earlBio = reverse(earlBio);//не работает 
        System.out.printf("Развернутый список: %s \n", earlBio);


        System.out.print("Время работы для LinkedList (в миллисекундах) = " + (System.currentTimeMillis() - start));//вывод и замер времени


    }

    public static List<Integer> reverse(List<Integer> direct) {
        List<Integer> reversed = new LinkedList<>();

        for (int i = direct.size() - 1; i >= 0; i--) {
            reversed.add(direct.get(i));
        }

        return reversed;
    }


    private static int[] RANDOM() {//метод рандома
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 31) - 0);
        }
        return arr;
    }


}
/*
В LinkedList элементы фактически представляют собой звенья одной цепи. У каждого элемента помимо тех данных, которые он хранит, имеется ссылка на предыдущий и следующий элемент. По этим ссылкам можно переходить от одного элемента к другому.
 */
```
## Вариант 2 
>Вариант без рандома, но с работающим Collections.reverse(earlBio); 
+ logger 
+ замер времени выполнения программы.
Пытался прикрутить цветовую палитру в logger. Но цвета срабатывают только в консоли в logger цвета не меняются.
```java
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*
Вариант без рандома, но с работающим Collections.reverse(earlBio); + logger + замер времени выполнения программы.
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


        List<Integer> earlBio = new LinkedList<>(); //создаем linkedList
        earlBio.add(1);//добавляем в него рандомный массив
        earlBio.add(2);
        earlBio.add(3);
        earlBio.add(4);
        earlBio.add(5);
        earlBio.add(6);
        earlBio.add(7);
        earlBio.add(8);
        earlBio.add(9);
        earlBio.add(10);

        System.out.printf("Запись в LinkedList: %s \n", earlBio); //Внутри LinkedList нет массива, как в ArrayList, или чего-то похожего.
        // Вся работа с ArrayList (по большому счету) сводится к работе с внутренним массивом.
        logger.info("Запись в LinkedList: " + Arrays.toString(new List[]{earlBio})
                + "\n_____________________________________________________");

        Collections.reverse(earlBio); //разворот списка
        System.out.printf("Развернутый список: %s \n", earlBio);
        logger.info("Развернутый список:" + Arrays.toString(new List[]{earlBio})
                + "\n_____________________________________________________");


        System.out.print("Время работы для LinkedList (в миллисекундах) = " + (System.currentTimeMillis() - start));//вывод и замер времени
        logger.info(ANSI_GREEN + "Время работы для LinkedList (в миллисекундах)" + +(System.currentTimeMillis() - start)
                + ANSI_RED + "\n*====================================================*");
    }

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

}
/*
В LinkedList элементы фактически представляют собой звенья одной цепи. У каждого элемента помимо тех данных, которые он хранит, имеется ссылка на предыдущий и следующий элемент. По этим ссылкам можно переходить от одного элемента к другому.
 */
```
## Вариант 3
>Вариант с рандомом (единственный рабочий вариант с рандомом),
с работающим Collections.reverse(earlBio);
+ logger
+ замер времени выполнения программы.
```java
import java.io.IOException;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*
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
        earlBio.add(getRandomNumber(10));//добавляем в него рандомный массив
        earlBio.add(getRandomNumber(10));
        earlBio.add(getRandomNumber(10));
        earlBio.add(getRandomNumber(10));
        earlBio.add(getRandomNumber(10));
        earlBio.add(getRandomNumber(10));
        earlBio.add(getRandomNumber(10));


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

    public static int getRandomNumber(int i) { // генерирует случайное число
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }


}

/*
В LinkedList элементы фактически представляют собой звенья одной цепи. У каждого элемента помимо тех данных, которые он хранит, имеется ссылка на предыдущий и следующий элемент. По этим ссылкам можно переходить от одного элемента к другому.
 */
```

# 2.Реализуйте очередь с помощью LinkedList со следующими методами:
- enqueue() - помещает элемент в конец очереди,
- dequeue() - возвращает первый элемент из очереди и удаляет его,
- first() - возвращает первый элемент из очереди, не удаляя.
# 3.* (дополнительное задание, сдавать не обязательно) В калькулятор добавьте возможность отменить последнюю операцию.