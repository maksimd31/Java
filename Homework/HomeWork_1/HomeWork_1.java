package Homework.HomeWork_1;
import java.util.Scanner;
// # Домашнее задание Семинар 1
// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!(произведение чисел от 1 до n)
class Homework_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //
        int n = sc.nextInt();
        int s = 0;
        for(int i = 0;i<=n;i++) {
            s += i;
        }
        System.out.printf("число %d Сумма %d%n",n,s);
//https://ru.wikipedia.org/wiki/Треугольное_число
//        int sum = n*(n+1)/2; //по формуле треугольных чисел
//        System.out.print(sum);

//вывод всех значений!
//        for(int i = 1;i<=n;i++){
//            if (i!=n) {
////                int sum =
//                System.out.print(i);
//            } else {
//                System.out.print(i + "=");
//            }
//        }
//        System.out.print("Input name: ");
//        Integer name = in.nextInt();

    }
}
//Памятка
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input name: ");
//        String name = in.nextLine();
//        System.out.print("Input age: ");
//        int age = in.nextInt();
//        System.out.print("Input height: ");
//        float height = in.nextFloat();
//        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);
//        in.close();
//    }
//}
