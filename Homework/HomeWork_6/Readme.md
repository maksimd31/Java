# Java: знакомство и как пользоваться базовым API (семинары)
## Урок 6. Хранение и обработка данных ч3: множество коллекций Set
### Домашнее задание Семинар 6
Создать класс Ноутбук для магазина техники.
Добавить атрибуты класса с соответствующими типами. 
Например, 
- идентификатор
- производитель
- название модели
- RAM
- объем HD
- операционная система
- и т.д.
Добавить конструктор класса.
Добавить необходимые методы класса.
Создать множество ноутбуков (множество объектов класса ноутбук).
3-10 штук
Написать метод, который будет запрашивать у пользователя критерий фильтрации (один) и выведет ноутбуки, отвечающие критерию.
Например:

“Введите цифру, соответствующую необходимому критерию: 
1 - RAM
2 - Объем HD
3 - Операционная система
4 - Цвет …

Для критериев объем и память необходимо запросить дополнительно диапазон. 
Например,
"Введите минимальное значение"
"Введите максимальное значение"
Отфильтровать ноутбуки и вывести проходящие по критерию.
Пример вывода:

Ноутбуки с объем HD от 256 до 512
1 HP EliteBook...
2..
3...

Пример вывода:

Ноутбуки с цвет Серебристый
1 Honor ...
2..
3...

> main Ниже закомментированные варианты решения которые я не смог побороть
Решение через switch пришло ко мне по причине того что iScanner срабатывал только один раз в нескольких if!! это проблема в iScanner, поэтому решил каждый посиковик вывести в отдельный метод и вызывать его поочередной через switch и тем самым клиентский код стал максимально прост)))

```java
package Homework.HomeWork_6.Version_1;

import java.util.Scanner;

import static Homework.HomeWork_6.Version_1.metod.*;

//public Bazza(int id,
// String brand, 1
// String model, 2
// String color, 3
// String os,    4
// String prog,  5
// int RAM,      6
// int SSD,      7
// int HDD)      8

/*
В этом варианте
Не получается использовать сканер в нескольких if поэтому под каждый запрос свой метод,
*/
public class Main {
    public static void main(String[] args) {
        Bazza Loptop = new Bazza(1, "HUAWEI", "MATEBOOK D15", "SILVER", "WINDOWS", "AMD", 16, 128, 0);
        Bazza Loptop2 = new Bazza(2, "HUAWEI", "MATEBOOK D16", "SILVER", "WINDOWS", "INTEL", 16, 512, 0);
        Bazza Loptop3 = new Bazza(3, "MSI", "GF76 Katana", "black", "БЕЗ OS", "intel core", 16, 512, 0);
        Bazza Loptop4 = new Bazza(4, "GIGABYTE", "G5 GE", "black", "БЕЗ OS", "intel core", 16, 512, 0);
        Bazza Loptop5 = new Bazza(5, "HP", "Laptop 15s-fq2128ur", "silver", "БЕЗ OS", "intel core", 8, 256, 0);
        Bazza Loptop6 = new Bazza(6, "Honor", "MagicBook X 15", "black", "Windows", "intel core", 8, 512, 0);
        Bazza Loptop7 = new Bazza(7, "Apple", "MacBook pro", "silver", "MacOS", "M1 pro", 16, 512, 0);
        Bazza Loptop8 = new Bazza(8, "Apple", "MacBook Air", "silver", "MacOS", "M1", 8, 256, 0);
        Bazza Loptop9 = new Bazza(9, "Acer", "Aspire", "black", "Windows", "AMD", 8, 256, 0);
        Bazza Loptop10 = new Bazza(10, "Lenovo", "V15 G3", "black", "БЕЗ OS", "AMD", 8, 512, 0);

        Bazza[] Baza = new Bazza[]{Loptop, Loptop2, Loptop3, Loptop4, Loptop5, Loptop6, Loptop7, Loptop8, Loptop9, Loptop10};
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Добро пожаловать в программу для выбора ноутбука\nСледуйте дальнейшим инструкциям");
        System.out.print("По какому критерию будем выбирать ноутбук? \n1 - По Бренду \n2 - по цвету \n3 - по системе \n4 - по процессору \n5 - по оперативной памяти \n6 - по жесткому диску\nВвод : ");


        int VV = iScanner.nextInt();
        switch (VV) {
            case 1:
                brend(Baza); //бренд
                break;
            case 2:
                Collore(Baza); //цвет
                break;
            case 3:
                getOS(Baza);
                break;
            case 4:
                getprogg(Baza); //процессор
                break;
            case 5:
                GETRAMM(Baza); //RAM
                break;
            case 6:
                SSDD(Baza); //SSD
                break;
//

        }
        System.out.println("Для завершения работы нажмите ENTER ");
    }
}
// Попытки и варианты вариант1
/*
        int vibor1 = iScanner.nextInt();

        switch (vibor1) {
            case 1:
                Scanner iScanner = new Scanner(System.in);
                System.out.print("\nКакого бренда интересует вас ноутбук: ");
                String vibor = iScanner.nextLine();
                if (vibor=="Apple") {
                    System.out.print(Bazza.getloptopBrandFUUL(Baza, "Apple"));
                } else if (Objects.equals(vibor, "HUAWEI")) {
                    System.out.print(Bazza.getloptopBrandFUUL(Baza, "HUAWEI"));
                } else if (Objects.equals(vibor, "MSI")) {
                    System.out.print(Bazza.getloptopBrandFUUL(Baza, "MSI"));
                } else if (Objects.equals(vibor, "GIGABYTE")) {
                    System.out.print(Bazza.getloptopBrandFUUL(Baza, "GIGABYTE"));
                } else if (Objects.equals(vibor, "HP")) {
                    System.out.print(Bazza.getloptopBrandFUUL(Baza, "HP"));
                } else if (Objects.equals(vibor, "Honor")) {
                    System.out.print(Bazza.getloptopBrandFUUL(Baza, "Honor"));
                } else if (Objects.equals(vibor, "Apple")) {
                    System.out.print(Bazza.getloptopBrandFUUL(Baza, "Apple"));
                } else if (Objects.equals(vibor, "Acer")) {
                    System.out.print(Bazza.getloptopBrandFUUL(Baza, "Acer"));
                } else if (Objects.equals(vibor, "Lenovo")) {
                    System.out.print(Bazza.getloptopBrandFUUL(Baza, "Lenovo"));
                } else {
                    System.out.println("Попробуй еще раз");
                    return;
                }
                break;
        }
    }
}

 */
/*
вариант 2
        if (vibor == 1){
            System.out.print(Bazza.getloptopBrand(Baza,"Apple"));
            System.out.print("Какая модель вас интересует?\n1 - 'MacBook pro' 2 - 'MacBook Air'");
            int vibor1 = iScanner.nextInt();
            if (vibor1 == 1){
                System.out.println(Bazza.getloptopmodel(Baza,"MacBook pro"));
            } else if (vibor1 == 2) {
                System.out.println(Bazza.getloptopmodel(Baza, "MacBook Air"));
            }
            System.out.println("Какой цвет вас интересует ?\n1 - black 2 - silver");
            if (vibor1 == 1){
                System.out.println(Bazza.getCollor(Baza,"black"));
            }else if (vibor1 == 2){
                System.out.println(Bazza.getCollor(Baza,"silver"));
            }else {
                System.out.println("Нет таких");
            }
            }



        }


 */

/*
 int VV = iScanner.nextInt();
        switch (VV) {
            case 1:
                String DD = String.valueOf(VV);
                for (int i = 0; i < Baza.length; i++) {
                        if (DD == Loptop.brand){
                            System.out.println(DD);
                    }
                    getloptopBrand(i);

                };
                break;
        }
    }
}
}
 */
```
> Bazza - тут методы для поиска и сортировки в main 
```java
package Homework.HomeWork_6.Version_1;


import java.util.Objects;

public class Bazza {
    int id;
    String brand, model, color, os, prog;
    int RAM, SSD, HDD;

    public Bazza(int id, String brand, String model, String color, String os, String prog, int RAM, int SSD, int HDD) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.os = os;
        this.prog = prog;
        this.RAM = RAM;
        this.SSD = SSD;
        this.HDD = HDD;
    }

    /**
     * Метод фильтра по бренду
     */
    public static StringBuilder getloptopBrandFUUL(Bazza[] Baza, String brand) {
        StringBuilder result = new StringBuilder();
        for (Bazza c : Baza) {
            if (Objects.equals(c.brand, brand)) {
                result.append("Бренд : ").append(c.brand);
                result.append(" Модель: ").append(c.model);
                result.append(" Цвет : ").append(c.color);
                result.append(" Система : ").append(c.os);
                result.append(" Процессор : ").append(c.prog); //процессор
                result.append(" ОЗУ : ").append(c.RAM);
                result.append(" SSD : ").append(c.SSD);
                result.append("\n");
            }
        }
        return result;
    }

    public static StringBuilder getloptopBrand(Bazza[] Baza, String brand) {
        StringBuilder result = new StringBuilder();
        for (Bazza c : Baza) {
            if (c.brand == brand) {
                result.append("\n" + c.brand);
            }
        }
        return result;
    }

    public static StringBuilder getloptopmodel(Bazza[] Baza, String model) {
        StringBuilder result = new StringBuilder();
        for (Bazza c : Baza) {
            if (c.model == model) {
                result.append("\n" + c.model);
            }
        }
        return result;
    }

    /**
     * Метод фильтра по цвету
     */
    public static StringBuilder getCollore(Bazza[] Baza, String color) {
        StringBuilder result = new StringBuilder();
        for (Bazza c : Baza) {
            if (Objects.equals(c.color, color)) {
                result.append("Бренд : ").append(c.brand);
                result.append(" Модель: ").append(c.model);
                result.append(" Цвет : ").append(c.color);
                result.append(" Система : ").append(c.os);
                result.append(" Процессор : ").append(c.prog); //процессор
                result.append(" ОЗУ : ").append(c.RAM);
                result.append(" SSD : ").append(c.SSD);
                result.append("\n");
            }
        }
        return result;
    }

    /**
     * Метод фильтра по системе
     */
    public static StringBuilder getOSS(Bazza[] Baza, String os) {
        StringBuilder result = new StringBuilder();
        for (Bazza c : Baza) {
            if (Objects.equals(c.os, os)) {
                result.append("Бренд : ").append(c.brand);
                result.append(" Модель: ").append(c.model);
                result.append(" Цвет : ").append(c.color);
                result.append(" Система : ").append(c.os);
                result.append(" Процессор : ").append(c.prog); //процессор
                result.append(" ОЗУ : ").append(c.RAM);
                result.append(" SSD : ").append(c.SSD);
                result.append("\n");

//                result.append(" ");
            }
        }
        return result;
    }

    /**
     * Метод фильтра по процессору
     */
    public static StringBuilder getprog(Bazza[] Baza, String prog) {
        StringBuilder result = new StringBuilder();
        for (Bazza c : Baza) {
            if (Objects.equals(c.prog, prog)) {
                result.append("Бренд : ").append(c.brand);
                result.append(" Модель: ").append(c.model);
                result.append(" Цвет : ").append(c.color);
                result.append(" Система : ").append(c.os);
                result.append(" Процессор : ").append(c.prog); //процессор
                result.append(" ОЗУ : ").append(c.RAM);
                result.append(" SSD : ").append(c.SSD);
                result.append("\n");

//                result.append(" ");
            }
        }
        return result;
    }

    /**
     * Метод фильтра по ram
     */
    public static StringBuilder getRAM(Bazza[] Baza, Integer RAM) {
        StringBuilder result = new StringBuilder();
        for (Bazza c : Baza) {
            if (c.RAM == RAM) {
                result.append("Бренд : ").append(c.brand);
                result.append(" Модель: ").append(c.model);
                result.append(" Цвет : ").append(c.color);
                result.append(" Система : ").append(c.os);
                result.append(" Процессор : ").append(c.prog); //процессор
                result.append(" ОЗУ : ").append(c.RAM);
                result.append(" SSD : ").append(c.SSD);
                result.append("\n");

            }
        }
        return result;
    }

    /**
     * Метод фильтра по SSD
     */
    public static StringBuilder getSSD(Bazza[] Baza, Integer RAM) {
        StringBuilder result = new StringBuilder();
        for (Bazza c : Baza) {
            if (c.RAM == RAM) {
                result.append("Бренд : ").append(c.brand);
                result.append(" Модель: ").append(c.model);
                result.append(" Цвет : ").append(c.color);
                result.append(" Система : ").append(c.os);
                result.append(" Процессор : ").append(c.prog); //процессор
                result.append(" ОЗУ : ").append(c.RAM);
                result.append(" SSD : ").append(c.SSD);
                result.append("\n");

            }
        }
        return result;
    }
}



```
>metod - тут методы к switch 
```java
package Homework.HomeWork_6.Version_1;

import java.util.Objects;
import java.util.Scanner;

public class metod {
    /**
     * Метод фильтра по бренду
     */
    public static void brend(Bazza[] Baza) { // фильтр бренда
        while (true) {
            System.out.print("\nДоступны: Apple, HUAVEI, MSI, GIGABYTE, HP, Honor, Acer, Lenovo\nКакого бренда интересует вас ноутбук: ");
            Scanner iScanner = new Scanner(System.in);
            String vibor = iScanner.nextLine();
            if (Objects.equals(vibor, "Apple")) {
                System.out.print(Bazza.getloptopBrandFUUL(Baza, "Apple"));
                break;
            } else if (Objects.equals(vibor, "HUAWEI")) {
                System.out.print(Bazza.getloptopBrandFUUL(Baza, "HUAWEI"));
                break;
            } else if (Objects.equals(vibor, "MSI")) {
                System.out.print(Bazza.getloptopBrandFUUL(Baza, "MSI"));
                break;
            } else if (Objects.equals(vibor, "GIGABYTE")) {
                System.out.print(Bazza.getloptopBrandFUUL(Baza, "GIGABYTE"));
                break;
            } else if (Objects.equals(vibor, "HP")) {
                System.out.print(Bazza.getloptopBrandFUUL(Baza, "HP"));
                break;
            } else if (Objects.equals(vibor, "Honor")) {
                System.out.print(Bazza.getloptopBrandFUUL(Baza, "Honor"));
                break;
            } else if (Objects.equals(vibor, "Acer")) {
                System.out.print(Bazza.getloptopBrandFUUL(Baza, "Acer"));
                break;
            } else if (Objects.equals(vibor, "Lenovo")) {
                System.out.print(Bazza.getloptopBrandFUUL(Baza, "Lenovo"));
                break;
            } else {
                System.out.print("Нет такого попробуй еще");
            }
        }
    }

    /**
     * Метод фильтра по цвету
     */
    public static void Collore(Bazza[] Baza) { //фильтр цвета
        while (true) {

            System.out.print("Доступные цвета: silver, black\nКакого Цвета интересует вас ноутбук: ");
            Scanner iScanner = new Scanner(System.in);
            String vibor = iScanner.nextLine();
            if (Objects.equals(vibor, "silver")) {
                System.out.print(Bazza.getCollore(Baza, "silver"));
                break;
            } else if (Objects.equals(vibor, "black")) {
                System.out.print(Bazza.getCollore(Baza, "black"));
                break;
            } else {
                System.out.print("Нет такого попробуй еще");
            }
        }
    }

    /**
     * Метод фильтра по системе
     */

    public static void getOS(Bazza[] Baza) {
        while (true) {
            System.out.print("\nДоступные системы: Windows, БЕЗ OS, MacOS\nКакая система вас интересует ? : ");
            Scanner iScanner = new Scanner(System.in);
            String vibor = iScanner.nextLine();
            if (Objects.equals(vibor, "Windows")) {
                System.out.print(Bazza.getOSS(Baza, "Windows"));
                break;
            } else if (Objects.equals(vibor, "БЕЗ OS")) {
                System.out.print(Bazza.getOSS(Baza, "БЕЗ OS"));
                break;
            } else if (Objects.equals(vibor, "MacOS")) {
                System.out.print(Bazza.getOSS(Baza, "MacOS"));
                break;
            } else {
                System.out.print("Нет такого попробуй еще");
            }
        }
    }

    /**
     * Метод фильтра по процессору
     */
    public static void getprogg(Bazza[] Baza) {
        while (true) {
            System.out.print("\nДоступные процессоры: AMD, intel, M1 pro, M1\nКакой процессор вас интересует ? : ");
            Scanner iScanner = new Scanner(System.in);
            String vibor = iScanner.nextLine();
            if (Objects.equals(vibor, "AMD")) {
                System.out.print(Bazza.getprog(Baza, "AMD"));
                break;
            } else if (Objects.equals(vibor, "intel")) {
                System.out.print(Bazza.getprog(Baza, "intel"));
                break;
            } else if (Objects.equals(vibor, "M1 pro")) {
                System.out.print(Bazza.getprog(Baza, "M1 pro"));
                break;
            } else if (Objects.equals(vibor, "M1")) {
                System.out.print(Bazza.getprog(Baza, "M1"));
                break;
            } else {
                System.out.print("Нет такого попробуй еще");

            }
        }
    }


    /**
     * Метод фильтра по ram
     */
    public static void GETRAMM(Bazza[] Baza) {
        while (true) {
            System.out.print("\nДоступные варианты: 8,16\nКакое количество RAM вас интересует ? : ");
            Scanner iScanner = new Scanner(System.in);
            Integer vibor = iScanner.nextInt();
            if (Objects.equals(vibor, 16)) {
                System.out.print(Bazza.getRAM(Baza, 16));
                break;
            } else if (Objects.equals(vibor, 8)) {
                System.out.print(Bazza.getRAM(Baza, 8));
                break;
            } else {
                System.out.print("Нет такого попробуй еще");
            }
        }
    }

    /**
     * Метод фильтра по SSD
     */
    public static void SSDD(Bazza[] Baza) { //фильтр ОС
        while (true) {
            System.out.print("\nДоступные варианты: 128, 256, 512 \nКакого размера SSD вас интересует? : ");
            Scanner iScanner = new Scanner(System.in);
            Integer vibor = iScanner.nextInt();
            if (Objects.equals(vibor, 128)) {
                System.out.print(Bazza.getSSD(Baza, 128));
                break;
            } else if (Objects.equals(vibor, 256)) {
                System.out.print(Bazza.getSSD(Baza, 256));
                break;
            } else if (Objects.equals(vibor, 512)) {
                System.out.print(Bazza.getSSD(Baza, 512));
                break;
            } else {
                System.out.print("Нет такого попробуй еще");
            }
        }
    }

}

```