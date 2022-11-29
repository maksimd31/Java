package Homework.HomeWork_2;
import java.util.logging.*;
//import org.apache.log4j.Logger;
import java.io.File;
import java.util.Random;
import java.util.random.*;
import java.io.IOException; //Сигналы о том, что произошло какое-либо исключение ввода-вывода. Этот класс является общим классом исключений, вызванных неудачными или прерванными операциями ввода-вывода.
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;
import java.util.logging.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
/*
 * 2.Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
 */
public class task_2 {
        public static void insertionSort(int[] sortirov) { //Метод сортировки пузырьком 
            int j;
            //сортировку начинаем со второго элемента
            for (int i = 1; i < sortirov.length; i++) {
                //сохраняем ссылку на индекс предыдущего элемента
                int swap = sortirov[i];
                for (j = i; j > 0 && swap < sortirov[j - 1]; j--) {
                    //элементы отсортированного сегмента перемещаем вперёд
                    sortirov[j] = sortirov[j - 1];
                }
                sortirov[j] = swap;
            }
        }
    
        public static void main(String args[]) throws IOException {
            Logger logger = Logger.getLogger(task_2.class.getName()); //создаем logger
            FileHandler ar = new FileHandler("logTask2.log", true); 
            logger.addHandler(ar);
            SimpleFormatter sFormat = new SimpleFormatter();
            ar.setFormatter(sFormat);
            Random random = new Random(); //блок ранома из псевдослучайных чисел для заполнение массива
            int[] sortirov = random.ints(100, 50, 100).toArray();
    //        int[] sortArr = new int[0];
    //        sortArr[] = ((int)(Math.random()*16) - (int)(Math.random()*16)); //пытался разными путями прикрутить блок рандома!
    ////        int[] sortArr = {12, 6, 4, 1, 15, 10};
    //        for(int i = 0; i < sortArr.length; i++) {
    //            sortArr[i] = (int) Math.round((Math.random() * 30) - 15);
            insertionSort(sortirov);
            for (int i = 0; i < sortirov.length; i++) {
                {
                    System.out.printf("Отсортированный массив: %d \n", sortirov[i]);
                    logger.log(Level.INFO, String.valueOf(sortirov[i]) + " " + Arrays.toString(sortirov));
    //            logger.log(Level.INFO, String.valueOf(sortArr[i]) + " " + Arrays.toString(sortArr));
                    //Не получается строку логгера вывезти из цикла работающую
                }
            }
        }
    }
   
    
    
    