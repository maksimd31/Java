import java.util.*;
import java.util.Collections;

/*
Починил все работает
Пытался прикрутить массив из рандома ничего не вышло все срабатывает до метода Collections.reverse(Arrays.asList(earlBio));
затем он не делает reverse
 */
/*
1.Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

 */
public class task_1 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();//Старт замера времени

//        int[] arr = RANDOM(); //рандомом заполняем массив
//        String arre = new String(Arrays.toString(arr)); // конвертируем в str
//        System.out.printf("Массив int: %s \n", arre); //
        Random rnd = new Random();
        List<Integer> earlBio = new LinkedList<>(); //создаем linkedList
        for (int i = 0; i <10 ; i++) {
            earlBio.add(rnd.nextInt(100));//добавляем в него рандомный массив
        }

        System.out.printf("Запись в LinkedList: %s \n", earlBio); //Внутри LinkedList нет массива, как в ArrayList, или чего-то похожего.
        // Вся работа с ArrayList (по большому счету) сводится к работе с внутренним массивом.

//        Collections.reverse(Arrays.asList(earlBio));
//        System.out.printf("Развернутый список: %s \n", earlBio);


//
//        List<Integer> revData = reverse(earlBio);
//        System.out.printf("Развернутый список: %s \n", earlBio);


//        earlBio = reverse(earlBio);//не работает
        System.out.printf("Развернутый список: %s \n", earlBio);


        System.out.print("Время работы для LinkedList (в миллисекундах) = " + (System.currentTimeMillis() - start));//вывод и замер времени


    }

    public static List<Integer> reverse(List<Integer> direct) {
        List<Integer> reversed = new LinkedList<>();

        for (int i = direct.size() - 1; i >= 0; i--) {
            reversed.add(direct.get(i));
        }

        return reversed;
    }


    private static int[] RANDOM() {//метод рандома
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 31) - 0);
        }
        return arr;
    }


}
/*
В LinkedList элементы фактически представляют собой звенья одной цепи. У каждого элемента помимо тех данных, которые он хранит, имеется ссылка на предыдущий и следующий элемент. По этим ссылкам можно переходить от одного элемента к другому.
 */