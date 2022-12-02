## Урок 3. Коллекции JAVA: Введение
```json
 ( ( .  (   (   (   (( (     ( .  (   (   (           (    
 )\)\ . )\  )\: )\ (\())\    )\ . )\  )\  )\          )\   
(_)(_) ((_)((_)((_))(_)(_)  ((() ((_)((_)((_)__      ((_)_ 
| || |/ _ \|  \/  | __| \    / // _ \| _ \ |/ /      |__ / 
| __ | (_) | |\/| | _| \ \/\/ /| (_) |   /   <        |_ \ 
|_||_|\___/|_|  |_|___| \_/\_/  \___/|_|_\_|\_\      |___/ 

```
Домашнее задание Семинар 3
>
1. Реализовать алгоритм сортировки слиянием.
>Прикрутил логгер и рандом в отдельный класс 
> Как в логгер записать в графу info обозначение ?
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

        //logger.info(Arrays.toString(arr) + " " + " " + Arrays.toString(arr) + " " + "=" + " " +Arrays.toString(aux)); //перебор вывода в логгер
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
>Тут пытался сделать logger в отдельный класс/ничего не вышло
```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
тут пытался сделать logger в отдельный класс/ничего не вышло
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

        //logger.info(Arrays.toString(arr) + " " + " " + Arrays.toString(arr) + " " + "=" + " " +Arrays.toString(aux)); //перебор вывода в логгер
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
удаляем эти числа
подробные комментарии указал.
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
        System.out.println("Произвольный список: " + Arrays.toString(arr)); //Вывод без проблема
        arre.add(arr); //добавляю произвольный массив в list
//        arre.removeIf(num -> num % 2 == 0);
//        System.out.println(arre);

        for (int i = 0; i < arre.size(); i++) { // Пробегаемся по массиву
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
>вариант по проще c логером
### HomeWork_3 Вариант 1
```java
import java.io.IOException;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class HomeWork_3 {
    public static void main(String[] args) {
        /*
        Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

         */
        List<Integer> number = new ArrayList<>();

        Logger logger = Logger.getLogger(HomeWork_1.class.getName());//init log
        FileHandler fh = null; //создаем log
        try {
            fh = new FileHandler("logTask_3.log", true);
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
        System.out.printf("список %s\n", number);
        logger.info(Arrays.toString(new List[]{number})); //записываем в log

        int max = Collections.max(number);// максимально число
        System.out.printf("Максимальное число: %s\n", max);
        //System.out.printf("Максимальное число: %s\n", Collections.max(number)); можно в одну строчку но так в log не записать
        logger.info(Arrays.toString(new int[]{max}));

        int min = Collections.min(number); // минимальное число
        System.out.printf("Минимальное число: %s\n", min);
        logger.info(Arrays.toString(new int[]{min}));

        int sum = extracted(number); // сумма листа
        System.out.printf("Сумма чисел: %s\n", sum);
        logger.info(Arrays.toString(new int[]{sum}));

        int mid = extracted(number) /2; // середина
        System.out.printf("Средняя сумма: %s\n", mid);
        logger.info(Arrays.toString(new int[]{mid}));
        
 }
    private static int extracted(List<Integer> number) { // сумма листа
        int sum = 0;
        for (int i = 0; i < number.size(); i++) {
            sum += number.get(i);
        }
        return sum;
    }
}
```
### HomeWork_3_2 Вариант 2
>Вариант посложнее (Сделано при помощи коллег)
```java
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class HomeWork_3_2 {
    public static void main(String[] args) {
        /*
        Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

         */
        List<Integer> number = new ArrayList<>();

        Logger logger = Logger.getLogger(HomeWork_1.class.getName());//init log
        FileHandler fh = null; //создаем log
        try {
            fh = new FileHandler("logTask_3_2.log", true);
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
        int[] numbers = Numbers((ArrayList<Integer>) number);
        System.out.printf("Максимальное значение: %d, минимальное значение: %d, среднее значение: %d ", numbers[0], numbers[1], numbers[2]);
        logger.info(Arrays.toString(new int[]{numbers[0], numbers[1], numbers[2]}));

    }
    public static int[] Numbers (ArrayList <Integer> intList) {
        int[] numbers = new int [4];
        Collections.sort(intList); // сортировка для нахождения минимального и максимального значений
        numbers[1] = intList.get(0);
        numbers[0] = intList.get(intList.size()-1);
        int middle = (numbers[0] + numbers[1]) / 2; // находим общее среднее значение на отрезке от минимума до максимума
        int[] count = new int [intList.size()];
        for (int i = 0; i < intList.size(); i++) { // высчитываем с помощью счетчика элемент, который ближе всего к среднему значению
            if (intList.get(i) > middle) {
                while (intList.get(i) != middle) {
                    middle++;
                    count[i]++;
                }
            }
            else {
                while (intList.get(i) != middle) {
                    middle--;
                    count[i]++;
                }
            }
            middle = (numbers[0] + numbers[1]) / 2;
        }
        int indexMin = 0;
        for (int i = 1; i < count.length; i++) { // находим индекс этого элемента

            if (count[i] < count[indexMin]) {
                indexMin = i;
            }
        }
        numbers[2] = intList.get(indexMin);
        return numbers;
    }
}
```