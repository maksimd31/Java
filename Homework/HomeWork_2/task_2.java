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
        public static void insertionSort(int[] sortArr) {
            int j;
            //сортировку начинаем со второго элемента, т.к. считается, что первый элемент уже отсортирован
            for (int i = 1; i < sortArr.length; i++) {
                //сохраняем ссылку на индекс предыдущего элемента
                int swap = sortArr[i];
                for (j = i; j > 0 && swap < sortArr[j - 1]; j--) {
                    //элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
                    sortArr[j] = sortArr[j - 1];
                }
                sortArr[j] = swap;
            }
        }
    
        public static void main(String args[]) throws IOException {
            Logger logger = Logger.getLogger(task_2.class.getName()); //создаем logger
            FileHandler ar = new FileHandler("logTask2.log", true);
            logger.addHandler(ar);
            SimpleFormatter sFormat = new SimpleFormatter();
            ar.setFormatter(sFormat);
            Random random = new Random(); //блок ранома из псевдослучайных чисел для заполнение массива
            int[] sortArr = random.ints(100, 50, 100).toArray();
    //        int[] sortArr = new int[0];
    //        sortArr[] = ((int)(Math.random()*16) - (int)(Math.random()*16)); //пытался разными путями прикруттить блок рандома!
    ////        int[] sortArr = {12, 6, 4, 1, 15, 10};
    //        for(int i = 0; i < sortArr.length; i++) {
    //            sortArr[i] = (int) Math.round((Math.random() * 30) - 15);
            insertionSort(sortArr);
            for (int i = 0; i < sortArr.length; i++) {
                {
                    System.out.printf("Осартированный массив: %d \n", sortArr[i]);
                    logger.log(Level.INFO, String.valueOf(sortArr[i]) + " " + Arrays.toString(sortArr));
    //            logger.log(Level.INFO, String.valueOf(sortArr[i]) + " " + Arrays.toString(sortArr));
                    //Не получается строку логгера ввывести из цикла работующую
                }
            }
        }
    }
    //public class Customer {
    //    static Logger logger = Logger.getLogger(Customer.class);
    //    public static void main(String[] args) {
    //        logger.error("ERROR");
    //        logger.warn("WARNING");
    //        logger.fatal("FATAL");
    //        logger.debug("DEBUG");
    //        logger.info("INFO");
    //        System.out.println("Final Output");
    //    }
    //}
    //class EdurekaLogger {
    //    private final static Logger LOGGER =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    //    public void sampleLog()
    //    {
    //        LOGGER.log(Level.WARNING, "Welcome to Edureka!");
    //    }
    //
    //    public static void main(String[] args)
    //    {
    //        EdurekaLogger obj = new EdurekaLogger();
    //        obj.sampleLog();
    //        LogManager slg = LogManager.getLogManager();
    //        Logger log = slg.getLogger(Logger.GLOBAL_LOGGER_NAME);
    //        log.log(Level.WARNING, "Hi! Welcome from Edureka");}
    //}
    //
    //
    
    
    
    
    