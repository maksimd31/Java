package Homework.HomeWork_5;

import java.util.HashMap;
import java.util.Map;

import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) {
        //Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

        Map<Integer, ArrayList<String>> telefone = new HashMap<>();

        Map<Integer, String> name = new HashMap<>();
        name.putIfAbsent(1, "Иван Иванов");
        name.putIfAbsent(2, "Светлана Петрова");
        name.putIfAbsent(3, "Анна Мусина");
        name.putIfAbsent(4, "Петр Лыков");

        for (int i = 0; i < name.size(); i++) {

            if (telefone.get(i) == null) {

                telefone.putIfAbsent(i, new ArrayList<>());


                telefone.get(i).add("8-965-454-00- "  + "8-920-855-01- ");
            }
            System.out.println("Телефонные номера абонента" + " " + name.get(i) + " :" + telefone.get(i));
        }

    }
}




