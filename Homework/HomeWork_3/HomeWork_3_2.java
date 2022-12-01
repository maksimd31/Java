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

