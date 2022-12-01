import java.util.*;
import java.util.function.Predicate;

/*
Пусть дан произвольный список целых чисел, удалить из него четные числа
 */
/*
Пытался сделать но ничего не вышло! подробные коммеетарии указал.
Рабочее простое решение в HomeWork_3_2
 */
public class HomeWork_2 {

    public static void main(String[] args) {

        int[] arr = RANDOM(); //формирую массив случайных чисел

        List arre = new ArrayList<>();//init
        Arrays.asList(arr); //формирования списка из массива
        System.out.println("Произвольный список: " + Arrays.toString(arr)); //Ввывод без проблемм
        arre.add(arr); //добавляю произвольный массив в list
//        arre.removeIf(num -> num % 2 == 0);
//        System.out.println(arre);

        for (int i = 0; i < arre.size(); i++) { // Пробигаемся по массиву
            int even = (int) arre.get(i) % 2; //проверяем кратность 2

            if (even == 0) {
                System.out.println("This is Even Number:" + arre.get(i));
                arre.remove(i); // удаляем все числа которые делятся на 2
                i--;
            }
        }
    }

    private static int[] RANDOM() {//метод рандома
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 31) - 0);
        }
        return arr;
    }
}
