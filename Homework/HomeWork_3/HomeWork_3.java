import java.io.IOException;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class HomeWork_3 {
    public static void main(String[] args) {
        /*
        Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

         */
        List<Integer> number = new ArrayList<>();

        Logger logger = Logger.getLogger(HomeWork_1.class.getName());//init log
        FileHandler fh = null; //создаем log
        try {
            fh = new FileHandler("logTask_3.log", true);
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
        System.out.printf("список %s\n", number);
        logger.info(Arrays.toString(new List[]{number})); //записываем в log

        int max = Collections.max(number);// максимально число
        System.out.printf("Максимальное число: %s\n", max);
        //System.out.printf("Максимальное число: %s\n", Collections.max(number)); можно в одну строчку но так в log не записать
        logger.info(Arrays.toString(new int[]{max}));

        int min = Collections.min(number); // минимальное число
        System.out.printf("Минимальное число: %s\n", min);
        logger.info(Arrays.toString(new int[]{min}));

        int sum = extracted(number); // сумма листа
        System.out.printf("Сумма чисел: %s\n", sum);
        logger.info(Arrays.toString(new int[]{sum}));

        int mid = extracted(number) /2; // середина
        System.out.printf("Средняя сумма: %s\n", mid);
        logger.info(Arrays.toString(new int[]{mid}));

 }
    private static int extracted(List<Integer> number) { // сумма листа
        int sum = 0;
        for (int i = 0; i < number.size(); i++) {
            sum += number.get(i);
        }
        return sum;
    }
}





