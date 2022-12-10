package Homework.HomeWork_5;

import java.util.*;

public class task_2 {
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
