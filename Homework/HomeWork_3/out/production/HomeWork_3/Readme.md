## Урок 3. Коллекции JAVA: Введение
```json

```
Домашнее задание Семинар 3
>
1. Реализовать алгоритм сортировки слиянием.
>Прикрутил логгер и рандом в отдельный класс 
> Как в логгере записать в графу info обозначение ?
Например, INFO: Исходный массив: и тд...
и         INFO: Отсортированный массив: и тд...
>Как вывести логгер в отдельный метод ? я пробовал ничего не выходит
### HomeWork_1 Вариант 1 
```java

import java.util.Arrays;
import java.io.IOException; //Сигналы о том, что произошло какое-либо исключение ввода-вывода. Этот класс является общим классом исключений, вызванных неудачными или прерванными операциями ввода-вывода.
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.*;

public class HomeWork_1 {
    public static void merge(int[] arr, int[] aux, int low, int mid, int high)//метод слияния
    {
        int k = low, i = low, j = mid + 1; //определяем типизацию и присвоение

        while (i <= mid && j <= high)// Пока есть элементы в левом и правом прогонах
        {
            if (arr[i] <= arr[j]) {
                aux[k++] = arr[i++];
            } else {
                aux[k++] = arr[j++];
            }
        }
        while (i <= mid) {// Копируем оставшиеся элементы
            aux[k++] = arr[i++];
        }

        for (i = low; i <= high; i++) {// копируем обратно в исходный массив, чтобы отразить порядок сортировки
            arr[i] = aux[i];
        }
    }

    // Сортируем массив используя вспомогательный массив `aux`
    public static void mergesort(int[] arr, int[] aux, int low, int high) //сортировка
    {
        if (high == low) {        // если размер прогона == 1
            return;
        }

        int mid = (low + ((high - low) >> 1));// найти середину

        // рекурсивное разделение выполняется на две половины до тех пор, пока размер выполнения не станет == 1,
        // затем объединяем их и возвращаемся вверх по цепочке вызовов

        mergesort(arr, aux, low, mid);          // разделить/объединить левую половину
        mergesort(arr, aux, mid + 1, high);     // разделить/объединить правую половину

        merge(arr, aux, low, mid, high);        // объединяем две половинки
    }

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(HomeWork_1.class.getName());//init log
        FileHandler fh = null; //создаем log
        try {
            fh = new FileHandler("logTask_1.log", true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logger.addHandler(fh); //Объект используется для регистрации сообщений для конкретной системы или компонента приложения.
        SimpleFormatter log = new SimpleFormatter();
        fh.setFormatter(log);

        int[] arr = RANDOM();
//        int[] arr = { 12, 3, 18, 24, 0, 5, -2 };
        System.out.printf("Исходный массив: %s \n", Arrays.toString(arr));

        logger.info(Arrays.toString(arr)); // запись в log


        int[] aux = Arrays.copyOf(arr, arr.length);
        //logger.info(Arrays.toString(aux));// запись в log
        // сортируем массив `arr`, используя вспомогательный массив `aux`
        mergesort(arr, aux, 0, arr.length - 1);
        System.out.printf("Отсортированный массив: %s ", Arrays.toString(arr));
        logger.info(Arrays.toString(arr));// запись в log

        //logger.info(Arrays.toString(arr) + " " + " " + Arrays.toString(arr) + " " + "=" + " " +Arrays.toString(aux)); //перебор вывода в логер
    }


    private static int[] RANDOM() {//метод рандома
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 51) - 15);
        }
        return arr;
    }
}
 /*
 как в логгере записать в графу info обозначение ?
 например INFO: Исходный массив: и тд...
 и        INFO: Отсортированный массив: и тд...
  */
```
### HomeWork_1_1 Вариант 2
>Тут пытался сделать logger в отдельный клас/ничего не вышло
```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
тут пытался сделать logger в отдельный клас/ничего не вышло
 */

public class HomeWork_1_1 {
    public static void merge(int[] arr, int[] aux, int low, int mid, int high)//метод слияния
    {
        int k = low, i = low, j = mid + 1; //определяем типизацию и присвоение

        while (i <= mid && j <= high)// Пока есть элементы в левом и правом прогонах
        {
            if (arr[i] <= arr[j]) {
                aux[k++] = arr[i++];
            } else {
                aux[k++] = arr[j++];
            }
        }
        while (i <= mid) {// Копируем оставшиеся элементы
            aux[k++] = arr[i++];
        }

        for (i = low; i <= high; i++) {// копируем обратно в исходный массив, чтобы отразить порядок сортировки
            arr[i] = aux[i];
        }
    }

    // Сортируем массив используя вспомогательный массив `aux`
    public static void mergesort(int[] arr, int[] aux, int low, int high) //сортировка
    {
        if (high == low) {        // если размер прогона == 1
            return;
        }

        int mid = (low + ((high - low) >> 1));// найти середину

        // рекурсивное разделение выполняется на две половины до тех пор, пока размер выполнения не станет == 1,
        // затем объединяем их и возвращаемся вверх по цепочке вызовов

        mergesort(arr, aux, low, mid);          // разделить/объединить левую половину
        mergesort(arr, aux, mid + 1, high);     // разделить/объединить правую половину

        merge(arr, aux, low, mid, high);        // объединяем две половинки
    }

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
//    {   Logger logger  = Logger.getLogger(HomeWork_11.class.getName());//init log
//        FileHandler fh = null; //создаем log
//        try {
//            fh = new FileHandler("logTask_11.log", true);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        logger.addHandler(fh); //Объект используется для регистрации сообщений для конкретной системы или компонента приложения.
//        SimpleFormatter log = new SimpleFormatter();
//        fh.setFormatter(log);

        int[] arr = RANDOM();
//        int[] arr = { 12, 3, 18, 24, 0, 5, -2 };
        System.out.printf("Исходный массив: %s \n", Arrays.toString(arr));

//        logger.info(Arrays.toString(arr)); // запись в log


        int[] aux = Arrays.copyOf(arr, arr.length);
        //logger.info(Arrays.toString(aux));// запись в log
        // сортируем массив `arr`, используя вспомогательный массив `aux`
        mergesort(arr, aux, 0, arr.length - 1);
        System.out.printf("Отсортированный массив: %s ", Arrays.toString(arr));
//        logger.info(Arrays.toString(arr));// запись в log

        //logger.info(Arrays.toString(arr) + " " + " " + Arrays.toString(arr) + " " + "=" + " " +Arrays.toString(aux)); //перебор вывода в логер
    }


    private static int[] RANDOM() {//метод рандома
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 31) - 15);
        }
        return arr;
    }

    public class Logger {
        private static Logger logger;

        private Logger() {
        }

        public static Logger getInstance() {
            //...
            return null;
        }
    }

    public class Filter {
        protected int treshold;

        public Filter(int treshold) {
            this.treshold = treshold;
        }

        public List<Integer> filterOut(List<Integer> source) {
            Logger logger = Logger.getInstance();
            List<Integer> result = new ArrayList<>();
            //..
            return result;
        }
    }

}

 /*
 как в логгере записать в графу info обозначение ?
 например INFO: Исходный массив: и тд...
 и        INFO: Отсортированный массив: и тд...
  */


```
2. Пусть дан произвольный список целых чисел, удалить из него четные числа
>Пытался сделать но ничего не вышло! сделал вывод рандомного массива типа int
перевел его в Array.asList 
добавил в лист arre
проверил на кратность 2 
удаляем эити числа
подробные коммеетарии указал.
Рабочее простое решение в HomeWork_3_2
### HomeWork_2 Вариант 1
```java
import java.util.*;
import java.util.function.Predicate;

/*
Пусть дан произвольный список целых чисел, удалить из него четные числа
 */
/*

 */
public class HomeWork_2 {

    public static void main(String[] args) {

        int[] arr = RANDOM(); //формирую массив случайных чисел

        List arre = new ArrayList<>();//init
        Arrays.asList(arr); //формирования списка из массива
        System.out.println("Произвольный список: " + Arrays.toString(arr)); //Ввывод без проблемм
        arre.add(arr); //добавляю произвольный массив в list
//        arre.removeIf(num -> num % 2 == 0);
//        System.out.println(arre);

        for (int i = 0; i < arre.size(); i++) { // Пробигаемся по массиву
            int even = (int) arre.get(i) % 2; //проверяем кратность 2

            if (even == 0) {
                System.out.println("This is Even Number:" + arre.get(i));
                arre.remove(i); // удаляем все числа которые делятся на 2
                i--;
            }
        }
    }

    private static int[] RANDOM() {//метод рандома
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 31) - 0);
        }
        return arr;
    }
}

```
### HomeWork_2_2 Вариант 2
> Самое простое решение - прикрутил логгер 
```java
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class HomeWork_2_2 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();

        Logger logger = Logger.getLogger(HomeWork_1.class.getName());//init log
        FileHandler fh = null; //создаем log
        try {
            fh = new FileHandler("logTask_2.log", true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logger.addHandler(fh); //Объект используется для регистрации сообщений для конкретной системы или компонента приложения.
        SimpleFormatter log = new SimpleFormatter();
        fh.setFormatter(log);

        number.add(11); //Добавляем в список данные
        number.add(45);
        number.add(12);
        number.add(32);
        number.add(36);
        number.add(36);
        number.add(63);
        number.add(38);
        number.add(87);
        number.add(88);
        number.add(99);
        System.out.printf("список %s\n",number);
        logger.info(Arrays.toString(new List[]{number})); //записываем в log

        number.removeIf(num -> num % 2 == 0); //Удаляем из списка числа которые делятся на 2

        System.out.printf("Без четных чисел %s",number);
        logger.info(Arrays.toString(new List[]{number}));//записываем в log
    }
}
```
3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
>
```java

```