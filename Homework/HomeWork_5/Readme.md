# Java: знакомство и как пользоваться базовым API (семинары)
Урок 5. Хранение и обработка данных ч2: множество коллекций Map
Домашнее задание Семинар 5

​
​
# 1.Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
>если все же заходит реч о телефонном справочнике Hashmap  на мой взгляд не самый подходящий метод
ели рассматривать логику справочника то я вижу ее так.
Каждого пользователя заводить отдельной сущностью и потом присвоить к ним ключ hashmap,
затем прикрутить поиск по массиву.
```java
package Homework.HomeWork_5;

// import java.net.StandardSocketOptions;
import java.util.*;
/*
если все же заходит реч о телефонном справочнике Hashmap  на мой взгляд не самый подходящий метод
ели рассматривать логику справочника то я вижу ее так.
Каждого пользователя заводить отдельной сущностью и потом присватывать к ним ключ hashmap,
затем прикрутить поиск по массиву.

 */
public class task_1 {
   //1.Реализуйте структуру телефонной книги с помощью HashMap,
   // учитывая, что 1 человек может иметь несколько телефонов.
/*
HashMap - хранит значения в произвольном порядке, но позволяет быстро искать элементы карты. Позволяет задавать ключ или значение ключевым словом null.
LinkedHashMap - хранит значения в порядке добавления.
TreeMap - сама сортирует значения по заданному критерию. TreeMap используется либо с Comparable элементами, либо в связке с Comparator. Смотрите статью "Интерфейсы Comparable и Comparator".
Hashtable - как HashMap, только не позволяет хранить null и синхронизирован с точки зрения многопоточности - это значит, что много потоков могут работать безопасно с Hashtable.
Но данная реализация старая и медленная, поэтому сейчас уже не используется в новых проектах.
 */
   public static void main(String[] args) {
      String[] str = {"Иван Иванов = +7 988 888 33 22 +7 999 234 45 77\n"};
      String[] str2 = {"Светлана Петрова = +7 888 21 22 +7 799 231 88 33\n"};
      String[] str3 = {"Анна Мусина = +7 999 123 44 33 + 7 932 123 44 55\n"};
      String[] str4 = {"Петр Лыков = +7 234 434 34 +7 832 233 23 44\n"};
      String[] str5 = {"Марина Лугова = +7 234 434 24 +7 832 233 25 44\n"};
      String[] str6 = {"Иван Ежов = +7 234 484 34 +7 832 233 23 41"};

      ArrayList<String> subscribers = new ArrayList<>(Arrays.asList(str));
      ArrayList<String> subscribers1 = new ArrayList<>(Arrays.asList(str2));
      ArrayList<String> subscribers2 = new ArrayList<>(Arrays.asList(str3));
      ArrayList<String> subscribers3 = new ArrayList<>(Arrays.asList(str4));
      ArrayList<String> subscribers4 = new ArrayList<>(Arrays.asList(str5));
      ArrayList<String> subscribers5 = new ArrayList<>(Arrays.asList(str6));


      //преобразуем массив в Arrays.asList - Array list
        /*
            V putIfAbsent(K k, V v): помещает в коллекцию новый объект с ключом k и значением v,
            если в коллекции еще нет элемента с подобным ключом.
             */
      HashMap<Integer, ArrayList<String>> name = new HashMap<>();
      name.putIfAbsent(1, subscribers);
      name.putIfAbsent(2, subscribers1);
      name.putIfAbsent(3, subscribers2);
      name.putIfAbsent(4, subscribers3);
      name.putIfAbsent(5, subscribers4);
      name.putIfAbsent(6, subscribers5);

      System.out.println(name);


   }
}

```


# 2. Пусть дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
Дополнительные задачи (сдавать не обязательно):
```java
package Homework.HomeWork_5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;
public class test3 {
    /*
    Иван Иванов , Светлана Петрова, Кристина Белова, Анна Мусина
Анна Крутова Иван Юрин Петр Лыков Павел Чернов Петр Чернышов
Мария Федорова Марина Светлова Мария Савина Мария Рыкова
Марина Лугова Анна Владимирова Иван Мечников Петр Петин Иван Ежов
     */
    public static void main(String[] args) {
        String[] str = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова",
                "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
                "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"};
        ArrayList <String> staff = new ArrayList<>(Arrays.asList(str)); //переводим массив в строку
        TreeMap <Integer, String> names = new TreeMap<>(Collections.reverseOrder()); //init TerreMap (сортировка)
        for (int i = 0; i < staff.size(); i++) { //xthtp for отделяем имена
            String[] FIO = staff.get(i).split(" ");
            String name = FIO[0];
            int count = 0;
            for (int j = 0; j < staff.size(); j++) { //через for отделяем фамилии
                String[] FIO1 = staff.get(j).split(" ");
                String name1 = FIO1[0];
                if (name.equals(name1)) {
                    count ++;
                }
            }
            if (!names.containsValue(name)) { // унарныый оператор
                names.put(count, name);
            }
        }
        for (var el : names.entrySet()) {
            System.out.printf("Количество повторений : %s Имена: %s", el.getKey(),el.getValue() + "\n");
        }
    }
}

```
# 3.* Реализовать алгоритм пирамидальной сортировки (HeapSort).
# 4.* На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
https://habr.com/ru/post/343738/
   Разница между HashMap, TreeMap, и Hashtable

Есть три основных воплощения интерфейса Map в Java: HashMap, TreeMap, и Hashtable. Главные отличия заключаются в следующем:
Порядок прохода. HashMap и HashTable не дают гарантий по упорядоченности в Map; в частности, они не гарантируют что порядок останется тем же самым в течении времени. Но TreeMap будет упорядочивать все значения в "естественном порядке" ключей или по компаратору.
Допустимые пары ключ-значение. HashMap позволяет иметь ключ null и значение null. HashTable не позволяет ключ null или значение null. Если TreeMap использует естественный порядок или компаратор не позволяет использовать ключ null, будет выброшено исключение.
Синхронизация. Только HashTable синхронизирована, остальные — нет. Но, "если потокобезопасное воплощение не нужно, рекомендуется использовать HashMap вместо HashTable".
