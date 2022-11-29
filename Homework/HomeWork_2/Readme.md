```
 _  _   ___   __  __  ___ __      __  ___   ___  _  __ _| | |_    ___  
| || | / _ \ |  \/  || __|\ \    / / / _ \ | _ \| |/ /|_  .  _|  |_  ) 
| __ || (_) || |\/| || _|  \ \/\/ / | (_) ||   /|   < |_     _|   / /  
|_||_| \___/ |_|  |_||___|  \_/\_/   \___/ |_|_\|_|\_\  |_|_|    /___| 

```
# Java: знакомство и как пользоваться базовым API (семинары)
## Урок 2. Почему вы не можете не использовать API
## Домашнее задание Семинар 2
#### Резюмирую 
>У меня после python путаница в голове, постоянно путаюсь в синтаксисе и в командах, путаюсь в скобках, из за того очень долго делаю Д/З.
Тоже самое было и после C#.
У меня курс разработчик Python и в январе опять будет Python  опять начнется путаница.
*Странная программа обучения, не получается выучить хотя-бы один язык нормально, Все как то поверхностно*
*Проблема с VScode когда создается файл логгера он создается в хабе репазитория. можно как то сделать так что бы он создавался в папке с проектом?*
### 1.Дана строка sql-запроса "select * from students where ". 
Сформируйте часть WHERE этого запроса, используя StringBuilder. 
Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
> Мне было бы проще сделать sql запрос.
голову сломал как сделать по заданию, не совсем понятно зачем такое задание, какой функционал оно выполняет как пригодится на практике? 
*В общем шло очень тяжело*
```java
package Homework.HomeWork_2;
import java.util.HashMap;
import java.util.Map;
public class task_1 {
    public static void main(String[] args) {
        Map<String, String> params1 = new HashMap<>();
//            HashMap(Map<? extends K,? extends V> m)
//            Создает новую карту хэш-карты с теми же сопоставлениями, что и указанная карта.
        params1.put("name","Ivanov");
        params1.put("country","Russia");
        params1.put("city","Moscow");
        params1.put("age",null);
        //put(K key, V value)
        //Связывает указанное значение с указанным ключом на этой карте.
        System.out.println(getA(params1)); //Вывод на экран метода
            }
            public static String getA(Map<String, String> Serch) // метод поиска
//              HashMap(Map<? extends K,? extends V> m)
////            Создает новую карту хэш-карты с теми же сопоставлениями, что и указанная карта.
            {
                StringBuilder s = new StringBuilder();
                for (Map.Entry<String,String> P : Serch.entrySet()) //Метод возвращает набор, имеющий те же элементы, что и хэш-карта.
                {
                    if (P.getValue() != null) {
                        s.append(P.getKey() +" = '" + P.getValue()+"' and ");
                    }
                }
                s.delete(s.toString().length()-5,s.toString().length());
                return s.toString();
            }

        }
/*
### 1.Дана строка sql-запроса "select * from students where ".
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

Разъяснение запроса WHERE пример sql запроса с условие where:
SELECT * FROM student WHERE name = 'Ivanov' and country = 'Russia' and city = 'Moscow' and age = 'null'
означает выбрать все столбы (*) в таблице student, где поля name имеет значение Ivanov и country =  и т.д.
требуется вывести строку в таком формате (часть запроса после WHERE) из Map, порядок полей  не важен.
/*
Объекты String являются неизменяемыми, поэтому все операции, которые изменяют строки,
фактически приводят к созданию новой строки, что сказывается на производительности приложения.
Для решения этой проблемы, чтобы работа со строками проходила с меньшими издержками в Java
были добавлены классы StringBuffer и StringBuilder. По сути они напоминает расширяемую строку,
которую можно изменять без ущерба для производительности.
Эти классы похожи, практически двойники, они имеют одинаковые конструкторы, одни
и те же методы, которые одинаково используются. Единственное их различие состоит в том, что
класс StringBuffer синхронизированный и потокобезопасный. То есть класс StringBuffer удобнее
использовать в многопоточных приложениях, где объект данного класса может меняться в различных
потоках. Если же речь о многопоточных приложениях не идет, то лучше использовать класс
StringBuilder, который не потокобезопасный, но при этом работает быстрее, чем StringBuffer
в однопоточных приложениях.
 */
```

### 2.Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
>Я уже и забыл как делать сортировку - пришлось вспоминать. 
Прикрутил модуль для создание псевдо рандомного массива.
Испробовал много методов раномайзеров и оставил единственный который заработал.
```java
package Homework.HomeWork_2;
import java.util.logging.*;
//import org.apache.log4j.Logger;
import java.io.File;
import java.util.Random;
import java.util.random.*;
import java.io.IOException; //Сигналы о том, что произошло какое-либо исключение ввода-вывода. Этот класс является общим классом исключений, вызванных неудачными или прерванными операциями ввода-вывода.
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;
import java.util.logging.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
/*
 * 2.Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 */
public class task_2 {
        public static void insertionSort(int[] sortirov) { //Метод сортировки пузырьком 
            int j;
            //сортировку начинаем со второго элемента
            for (int i = 1; i < sortirov.length; i++) {
                //сохраняем ссылку на индекс предыдущего элемента
                int swap = sortirov[i];
                for (j = i; j > 0 && swap < sortirov[j - 1]; j--) {
                    //элементы отсортированного сегмента перемещаем вперёд
                    sortirov[j] = sortirov[j - 1];
                }
                sortirov[j] = swap;
            }
        }
    
        public static void main(String args[]) throws IOException {
            Logger logger = Logger.getLogger(task_2.class.getName()); //создаем logger
            FileHandler ar = new FileHandler("logTask2.log", true); 
            logger.addHandler(ar);
            SimpleFormatter sFormat = new SimpleFormatter();
            ar.setFormatter(sFormat);
            Random random = new Random(); //блок рандома из псевдослучайных чисел для заполнение массива
            int[] sortirov = random.int(100, 50, 100).toArray();
    //        int[] sortArr = new int[0];
    //        sortArr[] = ((int)(Math.random()*16) - (int)(Math.random()*16)); //пытался разными путями прикрутить блок рандома!
    ////        int[] sortArr = {12, 6, 4, 1, 15, 10};
    //        for(int i = 0; i < sortArr.length; i++) {
    //            sortArr[i] = (int) Math.round((Math.random() * 30) - 15);
            insertionSort(sortirov);
            for (int i = 0; i < sortirov.length; i++) {
                {
                    System.out.printf("Отсортированный массив: %d \n", sortirov[i]);
                    logger.log(Level.INFO, String.valueOf(sortirov[i]) + " " + Arrays.toString(sortirov));
    //            logger.log(Level.INFO, String.valueOf(sortArr[i]) + " " + Arrays.toString(sortArr));
                    //Не получается строку логгера вывести из цикла работующую
                }
            }
        }
    }
   
```

# Дополнительное задание (сдавать не обязательно)

3 *. Дана json строка (можно сохранить в файл и читать из файла)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: 
Студент [фамилия] получил [оценка] по предмету [предмет].
Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
>Не успел сделать.
---
4 *. К калькулятору из предыдущего дз добавить логирование.
>*Проблема с VScode когда создается файл логгера он создается в хабе репазитория. можно как то сделать так что бы он создавался в папке с проектом?*
Хотел еще прикрутить более точный расчет расчет Float, начал переделывать все сломалось, решил оставить рабочую версию. 
Очень долго пытался понять как тут прикрутить логгер, прикрутил и в итоге он сломал вывод, ну как сломал он выводит но выводит в логгер.
Хотел прописать в логгере вид действия через `printf()` ну что бы был текст вывода ничего не вышло. Пытался сделать через ALL тоже команда не работает. 
*В общем как то все я понял очень поверстно*

```java
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
        logger.info(str); //записываем в логгер / записывается только в str 

        
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
            logger.info(Float.toString(x) + " " + str + " " + Float.toString(y) + " " + "=" + " " + c); //перебор вывода в логгер
        

    }
}

```