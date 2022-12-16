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