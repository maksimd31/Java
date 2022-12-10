package Homework.HomeWork_5;

import java.util.ArrayList;
import java.util.HashSet;

public class test__2 {
    public static void main(String[] args) {
        String[] str = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова",
                "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
                "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"};
        printWords(str);

        if (str == str){
            String strr = String.valueOf(str);
            System.out.printf("Осторитрованный список (без повтарений) %s",strr);
        }



    }
    static public void printWords(String [ ] arr)
    {

        for(String s : arr) {
            String[] s2 = s.split(" ");
            for(String results : s2) {
//                System.out.println(results);
            }
        }

    }
}
