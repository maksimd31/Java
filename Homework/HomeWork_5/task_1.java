package Homework.HomeWork_5;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class task_1 {
    //1.Реализуйте структуру телефонной книги с помощью HashMap,
    // учитывая, что 1 человек может иметь несколько телефонов.


    /**
     * program
     *
     * Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
     123456 Иванов
     321456 Васильев
     234561 Петрова
     234432 Иванов
     654321 Петрова
     345678 Иванов
     Вывести данные по сотрудникам с фамилией Иванов.
     */
    public class program {
        public static void main(String[] args) {

            Map<Integer, String> db = new HashMap<>(); //init
            db.putIfAbsent(111, "Иванов"); //добавляем
            db.putIfAbsent(222, "Петров");
            db.putIfAbsent(333, "Иванов");

            Scanner iScanner = new Scanner(System.in);
            System.out.printf("Кого ищем ? ");
            String str = iScanner.nextLine();
            iScanner.close();

            for (Integer numPass : db.keySet()) {
                if (Objects.equals(db.get(numPass).toLowerCase(), str.toLowerCase())){
                    System.out.printf("Паспорт %d фамилия %s\n", numPass, db.get(numPass));
                }
            }

            // System.out.println("Hello");
        }
    }

}
