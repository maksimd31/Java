import java.io.IOException;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task_2 {
    /*
    queue and linkedList
     */
    /*
    2.Реализуйте очередь с помощью LinkedList со следующими методами:
    - enqueue() - помещает элемент в конец очереди,
    - dequeue() - возвращает первый элемент из очереди и удаляет его,
    - first() - возвращает первый элемент из очереди, не удаляя.
     */
    public static void main(String[] args) {

        long start = System.currentTimeMillis();//Старт замера времени 


        Logger logger = Logger.getLogger(task_2.class.getName());//init log
        FileHandler fh = null; //создаем log
        try {
            fh = new FileHandler("logTask_2.log", true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logger.addHandler(fh); //Объект используется для регистрации сообщений для конкретной системы или компонента приложения.
        SimpleFormatter log = new SimpleFormatter();
        fh.setFormatter(log);


        Queue<Integer> earlBio = new LinkedList<>(); //создаем linkedList

        earlBio.add(getRandomNumber(10));//добавляем в него рандомный массив
        earlBio.add(getRandomNumber(10));
        earlBio.add(getRandomNumber(10));
        earlBio.add(getRandomNumber(10));
        earlBio.add(getRandomNumber(10));
        earlBio.add(getRandomNumber(10));
        earlBio.add(getRandomNumber(10));


        System.out.printf("Запись в LinkedList: %s \n", earlBio); //Внутри LinkedList нет массива, как в ArrayList, или чего-то похожего.
//        // Вся работа с ArrayList (по большому счету) сводится к работе с внутренним массивом.
        logger.info("Запись в LinkedList: " + Arrays.toString(new List[]{(List) earlBio})
                + "\n_____________________________________________________");

        int SS = size(earlBio); // размер списка
        logger.info(new StringBuilder().append("Размер списка в LinkedList: ").append(Arrays.toString(
                        new List[]{Collections.singletonList(SS)})).
                append("\n_____________________________________________________").toString());

        int AA = enqueue((LinkedList<Integer>) earlBio); //помещает элемент в конец очереди
        logger.info(new StringBuilder().append("Добавленный элемент: ").append(Arrays.toString(
                        new List[]{Collections.singletonList(AA)})).
                append("\n_____________________________________________________").toString());

        System.out.printf("Список с добавленным элементом: %s\n", earlBio);
        logger.info("Список с добавленным элементом: " + Arrays.toString(new List[]{(List) earlBio})
                + "\n_____________________________________________________");


        int BB = size(earlBio); // размер списка
        logger.info(new StringBuilder().append("Размер списка в LinkedList: ").append(Arrays.toString(
                        new List[]{Collections.singletonList(BB)})).
                append("\n_____________________________________________________").toString());


//        - first() - возвращает первый элемент из очереди, не удаляя.
        int FF = first((LinkedList<Integer>) earlBio); //первый элемент из очереди
        logger.info(new StringBuilder().append("первый элемент из очереди: ").append(Arrays.toString(
                        new List[]{Collections.singletonList(FF)})).
                append("\n_____________________________________________________").toString());

//        - dequeue() - возвращает первый элемент из очереди и удаляет его
        int DD = dequeue((LinkedList<Integer>) earlBio);
        logger.info(new StringBuilder().append("Удаляет первый элемент: ").append(Arrays.toString(
                        new List[]{Collections.singletonList(DD)})).
                append("\n_____________________________________________________").toString());


        System.out.printf("итоговая запись в LinkedList: %s \n", earlBio);
        logger.info("Список с добавленным элементом: " + Arrays.toString(new List[]{(List) earlBio})
                + "\n_____________________________________________________");
        //Внутри LinkedList нет массива, как в ArrayList, или чего-то похожего.

        int WW = size(earlBio);
        logger.info(new StringBuilder().append("Размер списка в LinkedList: ").append(Arrays.toString(
                        new List[]{Collections.singletonList(BB)})).
                append("\n_____________________________________________________").toString());
//

        System.out.print("Время работы для LinkedList (в миллисекундах) = " + (System.currentTimeMillis() - start));//вывод и замер времени
        logger.info("Время работы для LinkedList (в миллисекундах)" + +(System.currentTimeMillis() - start)
                + "\n*====================================================*");
    }

    private static int dequeue(LinkedList<Integer> earlBio) {
        Integer first = earlBio.get(0);
        earlBio.remove(0);
        System.out.printf("Удаленный элемент: %s\n", first);
        return first;
    }

    private static int first(LinkedList<Integer> earlBio) {
        Integer first = earlBio.get(0);
        System.out.printf("Первый элемент очереди: %s\n", first);
        return first;
    }

    private static int size(Queue<Integer> earlBio) {
        int aa = earlBio.size();
        System.out.printf("Размер списка: %s\n", aa);

        return aa;
    }


    public static int enqueue(LinkedList<Integer> earlBio) { //Добавляет элемент в конец списка при вызове
        // не понял как сделать что бы добавлял что типа append.
        earlBio.add(getRandomNumber(10));
        int ae = earlBio.get(7); //по индексу не вышло вывести добавленный элемент
        // если ставить вывод по индексу  -1  выдает Excretion
        System.out.printf("Добавленный элемент %s\n", ae);
//        System.out.printf("Добавленный элемент %s\n",earlBio);
//        return earlBio;
        return ae;
    }



    public static int getRandomNumber(int i) { // генерирует случайное число
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }


}

/*
В LinkedList элементы фактически представляют собой звенья одной цепи. У каждого элемента помимо тех данных, которые он хранит, имеется ссылка на предыдущий и следующий элемент. По этим ссылкам можно переходить от одного элемента к другому.
 */
   

    
