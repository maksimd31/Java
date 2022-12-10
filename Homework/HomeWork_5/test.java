package Homework.HomeWork_5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
// import java.util.LinkedList;

public class test {
    // Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов


    
        public static void main (String[] args) {
            String[] str = {"Иванов 12345", "Иванов 54321", "Петров 45678", "Сидоров 78456", "Петров 13459"};

            ArrayList <String> subscribers = new ArrayList<>(Arrays.asList(str)); //преобразуем массив в Arrays.asList - Array list

            HashMap <String, ArrayList<Integer>> telephone = new HashMap<>(); //init

            for (int i = 0; i < subscribers.size(); i++) {

                String[] subscriber = subscribers.get(i).split(" "); //разбиваем массив на пробелы
                String key = subscriber[0]; //получаем клю

                // System.out.println(key);

                int value = Integer.parseInt(subscriber[1]); // – преобразует строку в число

                ArrayList <Integer> number = new ArrayList<>();//создаем лист
                number.add(value); // добавляем  номера

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
//Метод parseInt() – в Java используется для получения примитивного типа данных определенной строки,
// другими словами – преобразует строку в число.
// Метод parseXxx() – это статический метод и может иметь один аргумент или два.