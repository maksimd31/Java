package Homework.HomeWork_5;

import java.util.*;

public class task_2 {
    /*
    2. Пусть дан список сотрудников:
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
Написать программу,
которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности.
     */
    public static void main(String[] args) {
        String[] str = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова",
                "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
                "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"};

        ArrayList<String> staff = new ArrayList<>(Arrays.asList(str)); //реобразуем
        for (int i = 0; i < staff.size(); i++) {
            String[] FIO = staff.get(i).split(" ");
            String name = FIO[0]; // разбираем по имени
//            System.out.println(name);
        }
//        familia(staff);

        ArrayList<String> listGroupCode = new ArrayList<>();
        listGroupCode.add(String.valueOf(staff));

        HashSet<String> set = new HashSet<>(listGroupCode);
        ArrayList<String> result = new ArrayList<>(set);
        if (result == result) {
            System.out.println(result);
        }


//            System.out.println(result);


////        TreeMap<Integer, String> names = new TreeMap<>(Collections.reverseOrder());
//        List<String> allUsers = new ArrayList <>(Arrays.asList(str));
//        Set<String> stringSet = new HashSet<>();
//
//        Set<String> setOfDupl = allUsers.stream().filter(e -> !stringSet.add(e)).collect(Collectors.toSet());
//        setOfDupl.stream().forEach(System.out::println);


    }
//        ArrayList<String> listGroupCode = new ArrayList<>();
//        listGroupCode.add(name);
//
//        HashSet<String> set = new HashSet<>(listGroupCode);
//        ArrayList<String> result = new ArrayList<>(set);
//
//        if (result == result) {
//            System.out.println(result);
//        }


//    private static Object familia(ArrayList<String> staff) {
//        for (int i = 0; i < staff.size(); i++) {
//            String[] FIO = staff.get(i).split(" ");
//            String name = FIO[0]; // разбираем по имени
//
////            System.out.println(name);
//        }
////        return null;
//        return name;
    }

//
//        private static void familia1 (ArrayList < String > staff) {
//            for (int i = 0; i < staff.size(); i++) {
//                String[] FIO = staff.get(i).split(" ");
//                String name = FIO[1]; // разбираем по фамилиям
//                System.out.println(name);
//            }
//        return;
