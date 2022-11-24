package Homework.HomeWork_1;
/*
 * Вывести все простые числа от 1 до 1000
 * 
 * простые числа делятся без остатка только на 1 и на себя. Отсюда получается, что нужно посчитать делители, которых должно быть не больше 2.
 */
public class HomeWork_2 {
    public static void main(String[] args){
        System.out.println("Простые числа от 0 до 1000");
        int i,j; //Без объявлений переменных код не сработает
        for (i=2;i<1000;i++){
            int u = 0;
            for(j=2;j<1000;j++){
                if ((i%j)==0)
                    u++;}
            if (u<2)
                System.out.printf("Простое число => %d ",i);
                }
            }
        }