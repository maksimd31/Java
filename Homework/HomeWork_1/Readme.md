 _   _ _____       ___   _       _ _____ ___   _   _     _   _____ _____ _   _ _____ 
( ) ( )  _  ) \_/ \  _ \( )  _  ( )  _  )  _ \( ) ( )  /  ) (___  )  _  ) ) ( )  _  )
| |_| | ( ) |     | (_(_) | ( ) | | ( ) | (_) ) |/ /  (_  |     | | (_) | | | | (_) |
|  _  | | | | (_) |  _)_| | | | | | | | |    /|   (     | |  _  | |  _  ) | | |  _  )
| | | | (_) | | | | (_( ) (_/ \_) | (_) | |\ \| |\ \    | |_( )_| | | | | \_/ | | | |
(_) (_)_____)_) (_)____/ \__/\___/(_____)_) (_)_) (_)   (_)_)\___/(_) (_)\___/(_) (_)
                                                                        
                                                                    
# Домашнее задание Семинар 1
### 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!(произведение чисел от 1 до n)
```java
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
    }
}
```
### 2. Вывести все простые числа от 1 до 1000
```java
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
```
### 3. Реализовать простой калькулятор (операции + - / * )
```java
package Homework.HomeWork_1;
/*
 * Реализовать простой калькулятор (операции + - / * )
 */
// public class HomeWork_3 {
    
// }
//package Homework.HomeWork_1;
import java.util.Scanner;
/*
Реализовать калькулятор
 */
public class HomeWork_3 {
    public static void main(String[] args) {
        System.out.println("Что будем делать?");
        System.out.println("1 - Сложение");
        System.out.println("2 - Разница");
        System.out.println("3 - Деление");
        System.out.println("4 - Умножение");
        Scanner sc = new Scanner(System.in);
        System.out.print("Отлично! Начнем : ");
        int vibor = sc.nextInt();
        System.out.print("Введите первое число : ");
        int x = sc.nextInt();
        System.out.print("Введите второе число : ");
        int y = sc.nextInt();
        int c = 0;

        switch (vibor){
            case 1:
                c = x + y;
                System.out.printf("Ответ %d",c);
                break;

            case 2:
                c = x - y;
                System.out.printf("Ответ %d",c);
                break;

            case 3:
                c = x / y;
                System.out.printf("Ответ %d",c);
                break;

            case 4:
                c = x * y;
                System.out.printf("Ответ %d",c);
                break;
        }
    }
}

```
# Дополнительное задание (сдавать не обязательно)
## 4. * Задано уравнение вида q + w = e, q, w, e >= 0. 
Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
Требуется восстановить выражение до верного равенства. 
Предложить хотя бы одно решение или сообщить, что его нет.

