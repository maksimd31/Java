
import java.util.Arrays;
import java.io.IOException; //Сигналы о том, что произошло какое-либо исключение ввода-вывода. Этот класс является общим классом исключений, вызванных неудачными или прерванными операциями ввода-вывода.
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.*;

public class HomeWork_1 {
    public static void merge(int[] arr, int[] aux, int low, int mid, int high)//метод слияния
    {
        int k = low, i = low, j = mid + 1; //определяем типизацию и присвоение

        while (i <= mid && j <= high)// Пока есть элементы в левом и правом прогонах
        {
            if (arr[i] <= arr[j]) {
                aux[k++] = arr[i++];
            } else {
                aux[k++] = arr[j++];
            }
        }
        while (i <= mid) {// Копируем оставшиеся элементы
            aux[k++] = arr[i++];
        }

        for (i = low; i <= high; i++) {// копируем обратно в исходный массив, чтобы отразить порядок сортировки
            arr[i] = aux[i];
        }
    }

    // Сортируем массив используя вспомогательный массив `aux`
    public static void mergesort(int[] arr, int[] aux, int low, int high) //сортировка
    {
        if (high == low) {        // если размер прогона == 1
            return;
        }

        int mid = (low + ((high - low) >> 1));// найти середину

        // рекурсивное разделение выполняется на две половины до тех пор, пока размер выполнения не станет == 1,
        // затем объединяем их и возвращаемся вверх по цепочке вызовов

        mergesort(arr, aux, low, mid);          // разделить/объединить левую половину
        mergesort(arr, aux, mid + 1, high);     // разделить/объединить правую половину

        merge(arr, aux, low, mid, high);        // объединяем две половинки
    }

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(HomeWork_1.class.getName());//init log
        FileHandler fh = null; //создаем log
        try {
            fh = new FileHandler("logTask_1.log", true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logger.addHandler(fh); //Объект используется для регистрации сообщений для конкретной системы или компонента приложения.
        SimpleFormatter log = new SimpleFormatter();
        fh.setFormatter(log);

        int[] arr = RANDOM();
//        int[] arr = { 12, 3, 18, 24, 0, 5, -2 };
        System.out.printf("Исходный массив: %s \n", Arrays.toString(arr));

        logger.info(Arrays.toString(arr)); // запись в log


        int[] aux = Arrays.copyOf(arr, arr.length);
        //logger.info(Arrays.toString(aux));// запись в log
        // сортируем массив `arr`, используя вспомогательный массив `aux`
        mergesort(arr, aux, 0, arr.length - 1);
        System.out.printf("Отсортированный массив: %s ", Arrays.toString(arr));
        logger.info(Arrays.toString(arr));// запись в log

        //logger.info(Arrays.toString(arr) + " " + " " + Arrays.toString(arr) + " " + "=" + " " +Arrays.toString(aux)); //перебор вывода в логер
    }


    private static int[] RANDOM() {//метод рандома
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 51) - 15);
        }
        return arr;
    }
}
 /*
 как в логгере записать в графу info обозначение ?
 например INFO: Исходный массив: и тд...
 и        INFO: Отсортированный массив: и тд...
  */