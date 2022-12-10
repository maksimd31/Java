package Homework.HomeWork_5;

import java.util.*;

import static java.util.Arrays.*;

public class test3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        List<Integer> earlBio = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            earlBio.add(rnd.nextInt(100));
        }
        System.out.println(earlBio);


        //ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        int[]array = new int[1000];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int)(Math.random()*24);
//        }
//
//        ArrayList<Integer> set= new ArrayList<>(Arrays.asList(array));


        // Set<Integer> set = new HashSet<>(Arrays.asList(array));
//
//        for (int i = 0; i < 1000; i++) {
//            arrayList .add(getRandomNumber());}

        Set<Integer> set = new HashSet<>(earlBio);


        set.forEach((k) -> {
            System.out.printf("%s ", k);
        });

    }
//    public static int getRandomNumber() { // генерирует случайное число
//        double x = (Math.random() * 24);
//        int num = (int) x;
//        return num;
//    }
}




