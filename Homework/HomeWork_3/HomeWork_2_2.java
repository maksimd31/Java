import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class HomeWork_2_2 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();

        Logger logger = Logger.getLogger(HomeWork_1.class.getName());//init log
        FileHandler fh = null; //создаем log
        try {
            fh = new FileHandler("logTask_2.log", true);
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
        System.out.printf("список %s\n",number);
        logger.info(Arrays.toString(new List[]{number})); //записываем в log

        number.removeIf(num -> num % 2 == 0); //Удаляем из списка числа которые делятся на 2

        System.out.printf("Без четных чисел %s",number);
        logger.info(Arrays.toString(new List[]{number}));//записываем в log
    }
}
