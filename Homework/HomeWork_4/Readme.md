# java: знакомство и как пользоваться базовым API (семинары)
Урок 4. Хранение и обработка данных ч1: приоритетные коллекции
Домашнее задание Семинар 
# 1.Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
## вариант 1
>Починил все работает
Вариант 1: пытался прикрутить массив из рандома ничего не вышло все срабатывает до метода Collections.reverse(Arrays.asList(earlBio));
затем он не делает reverse.
```java
import java.util.*;
import java.util.Collections;

/*
Починил все работает 
Пытался прикрутить массив из рандома ничего не вышло все срабатывает до метода Collections.reverse(Arrays.asList(earlBio));
затем он не делает reverse
 */
/*
1.Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

 */
public class task_1 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();//Старт замера времени

//        int[] arr = RANDOM(); //рандомом заполняем массив
//        String arre = new String(Arrays.toString(arr)); // конвертируем в str
//        System.out.printf("Массив int: %s \n", arre); //
        Random rnd = new Random();
        List<Integer> earlBio = new LinkedList<>(); //создаем linkedList
        for (int i = 0; i <10 ; i++) {
            earlBio.add(rnd.nextInt(100));//добавляем в него рандомный массив
        }

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

>[ПОЧИНИЛ вариант с рандомом]Вариант без рандома, но с работающим Collections.reverse(earlBio); 
+ logger 
+ замер времени выполнения программы.
Пытался прикрутить цветовую палитру в logger. Но цвета срабатывают только в консоли в logger цвета не меняются.
```java
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
```
## Вариант 3
>[ПОЧИНИЛ 2 варианта с рандомайзером] Вариант с рандомом (единственный рабочий вариант с рандомом),
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
```

# 2.Реализуйте очередь с помощью LinkedList со следующими методами:
- enqueue() - помещает элемент в конец очереди,
- dequeue() - возвращает первый элемент из очереди и удаляет его,
- first() - возвращает первый элемент из очереди, не удаляя.
>Реализовал все функции из домашнего задания 
+ logger (что то я там накрутил сам мало понял чето сделал, но работает)
+ Замер времени 

```java
import java.io.IOException;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task_2 {
    /*
    queue and linkedList
     */
    /*
    2.Реализуйте очередь с помощью LinkedList со следующими методами:
    - enqueue() - помещает элемент в конец очереди,
    - dequeue() - возвращает первый элемент из очереди и удаляет его,
    - first() - возвращает первый элемент из очереди, не удаляя.
     */
    public static void main(String[] args) {

        long start = System.currentTimeMillis();//Старт замера времени 


        Logger logger = Logger.getLogger(task_2.class.getName());//init log
        FileHandler fh = null; //создаем log
        try {
            fh = new FileHandler("logTask_2.log", true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logger.addHandler(fh); //Объект используется для регистрации сообщений для конкретной системы или компонента приложения.
        SimpleFormatter log = new SimpleFormatter();
        fh.setFormatter(log);


        Queue<Integer> earlBio = new LinkedList<>(); //создаем linkedList
        earlBio.add(getRandomNumber(10));//добавляем в него рандомный массив
        earlBio.add(getRandomNumber(10));
        earlBio.add(getRandomNumber(10));
        earlBio.add(getRandomNumber(10));
        earlBio.add(getRandomNumber(10));
        earlBio.add(getRandomNumber(10));
        earlBio.add(getRandomNumber(10));


        System.out.printf("Запись в LinkedList: %s \n", earlBio); //Внутри LinkedList нет массива, как в ArrayList, или чего-то похожего.
//        // Вся работа с ArrayList (по большому счету) сводится к работе с внутренним массивом.
        logger.info("Запись в LinkedList: " + Arrays.toString(new List[]{(List) earlBio})
                + "\n_____________________________________________________");

        int SS = size(earlBio); // размер списка
        logger.info(new StringBuilder().append("Размер списка в LinkedList: ").append(Arrays.toString(
                        new List[]{Collections.singletonList(SS)})).
                append("\n_____________________________________________________").toString());

        int AA = enqueue((LinkedList<Integer>) earlBio); //помещает элемент в конец очереди
        logger.info(new StringBuilder().append("Добавленный элемент: ").append(Arrays.toString(
                        new List[]{Collections.singletonList(AA)})).
                append("\n_____________________________________________________").toString());

        System.out.printf("Список с добавленным элементом: %s\n", earlBio);
        logger.info("Список с добавленным элементом: " + Arrays.toString(new List[]{(List) earlBio})
                + "\n_____________________________________________________");


        int BB = size(earlBio); // размер списка
        logger.info(new StringBuilder().append("Размер списка в LinkedList: ").append(Arrays.toString(
                        new List[]{Collections.singletonList(BB)})).
                append("\n_____________________________________________________").toString());


//        - first() - возвращает первый элемент из очереди, не удаляя.
        int FF = first((LinkedList<Integer>) earlBio); //первый элемент из очереди
        logger.info(new StringBuilder().append("первый элемент из очереди: ").append(Arrays.toString(
                        new List[]{Collections.singletonList(FF)})).
                append("\n_____________________________________________________").toString());

//        - dequeue() - возвращает первый элемент из очереди и удаляет его
        int DD = dequeue((LinkedList<Integer>) earlBio);
        logger.info(new StringBuilder().append("Удаляет первый элемент: ").append(Arrays.toString(
                        new List[]{Collections.singletonList(DD)})).
                append("\n_____________________________________________________").toString());


        System.out.printf("итоговая запись в LinkedList: %s \n", earlBio);
        logger.info("Список с добавленным элементом: " + Arrays.toString(new List[]{(List) earlBio})
                + "\n_____________________________________________________");
        //Внутри LinkedList нет массива, как в ArrayList, или чего-то похожего.

        int WW = size(earlBio);
        logger.info(new StringBuilder().append("Размер списка в LinkedList: ").append(Arrays.toString(
                        new List[]{Collections.singletonList(BB)})).
                append("\n_____________________________________________________").toString());
//

        System.out.print("Время работы для LinkedList (в миллисекундах) = " + (System.currentTimeMillis() - start));//вывод и замер времени
        logger.info("Время работы для LinkedList (в миллисекундах)" + +(System.currentTimeMillis() - start)
                + "\n*====================================================*");
    }

    private static int dequeue(LinkedList<Integer> earlBio) {
        Integer first = earlBio.get(0);
        earlBio.remove(0);
        System.out.printf("Удаленный элемент: %s\n", first);
        return first;
    }

    private static int first(LinkedList<Integer> earlBio) {
        Integer first = earlBio.get(0);
        System.out.printf("Первый элемент очереди: %s\n", first);
        return first;
    }

    private static int size(Queue<Integer> earlBio) {
        int aa = earlBio.size();
        System.out.printf("Размер списка: %s\n", aa);

        return aa;
    }


    public static int enqueue(LinkedList<Integer> earlBio) { //Добавляет элемент в конец стека при вызове
        // не понял как сделать что бы добавлял что типа append.
        earlBio.add(getRandomNumber(10));
        int ae = earlBio.get(7); //по индексу не вышло вывести добавленный элемент
        // если ставить вывод по индексу  -1  выдает Exsrpsion
        System.out.printf("Добавленный элемент %s\n", ae);
//        System.out.printf("Добавленный элемент %s\n",earlBio);
//        return earlBio;
        return ae;
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

# 3.* (дополнительное задание, сдавать не обязательно) В калькулятор добавьте возможность отменить последнюю операцию.
> stak - прочитал что устарело заменяемый элемент deque
> + logger
> + deque
> + замер времени
```java
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
        long start = System.currentTimeMillis();//Старт замера времени
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
//        logger.info(str); //записываем в логгер / записывается только в str


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
        System.out.print("\nВремя работы для LinkedList (в миллисекундах) = " + (System.currentTimeMillis() - start));//вывод и замер времени
        logger.info("\nВремя работы для LinkedList (в миллисекундах)" + +(System.currentTimeMillis() - start)
                + "\n*====================================================*");



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
            System.out.print("Промазал давай по новой");
//            return VV;
        }
        return VV;
    }

}
```