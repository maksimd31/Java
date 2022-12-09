package Homework.HomeWork_5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class test {
    // Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов


    public class Task1 {
        public static void main (String[] args) {
            String[] str = {"Иванов 12345", "Иванов 54321", "Петров 45678", "Сидоров 78456", "Петров 13459"};

            ArrayList <String> subscribers = new ArrayList<>(Arrays.asList(str)); //приабраззуем массив в Arrays.asList - Array list

            HashMap <String, ArrayList<Integer>> telephone = new HashMap<>(); //init

            for (int i = 0; i < subscribers.size(); i++) {

                String[] subscriber = subscribers.get(i).split(" "); //разбиванем массив на пробелы
                String key = subscriber[0]; //получаем ключ

                int value = Integer.parseInt(subscriber[1]);

                ArrayList <Integer> number = new ArrayList<>();//созвем лист
                number.add(value); // добовляем номера

                if (telephone.containsKey(key)) {
                    number.add(value);
                    telephone.put(key, number);
                } else {
                    telephone.put(key, number);
                }
            }
            System.out.println(telephone);
        }
    }
}
//Метод parseInt() – в Java используется для получения примитивного типа данных определенной строки,
// другими словами – преобразует строку в число.
// Метод parseXxx() – это статический метод и может иметь один аргумент или два.