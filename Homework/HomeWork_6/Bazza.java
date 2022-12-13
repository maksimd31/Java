package Homework.HomeWork_6;

//ноутбуки база
public class Bazza {
    int id;
    String brand, model, color, os, prog;
    int RAM, SSD, HDD;

//    boolean gender;

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

    //    public String toString(int number) {
//        String temp = this.gender ? "Male" : "Female";
//        return "Cat's number: " + number + "\n" +
//                "Name: " + name + "\n" +
//                "Gender: " + temp + "\n" +
//                "Breed: " + breed + "\n" +
//                "Colour: " + color + "\n" +
//                "Weight: " + weight + "\n" +
//                "Age: " + age + "\n";
//    }

    public static StringBuilder getloptopBrandFUUL(Bazza[] Baza, String brand) {
        StringBuilder result = new StringBuilder();
        for (Bazza c : Baza) {
            if (c.brand == brand) {
                result.append("Бренд : " + c.brand);
                result.append(" Модель: " + c.model);
                result.append(" Цвет : " + c.color);
                result.append(" Система : " + c.os);
                result.append(" Процессор : " + c.prog); //процессор
                result.append(" ОЗУ : " + c.RAM);
                result.append(" SSD : " + c.SSD);
                result.append("\n");

//                result.append(" ");
            }
        }
        return result;
    }

    public static StringBuilder getloptopBrand(Bazza[] Baza, String brand) {
        StringBuilder result = new StringBuilder();
        for (Bazza c : Baza) {
            if (c.brand == brand) {
                result.append("\n" + c.brand);
//                result.append("\n"+c.model);
//                result.append(" ");
            }
        }
        return result;
    }

    public static StringBuilder getloptopmodel(Bazza[] Baza, String model) {
        StringBuilder result = new StringBuilder();
        for (Bazza c : Baza) {
            if (c.model == model) {
                result.append("\n" + c.model);
//                result.append("\n"+c.model);
//                result.append(" ");
            }
        }
        return result;
    }

    public static StringBuilder getCollor(Bazza[] Baza, String color) {
        StringBuilder result = new StringBuilder();
        for (Bazza c : Baza) {
            if (c.color == color) {
                result.append("\n" + c.color);
//                result.append("\n"+c.model);
//                result.append(" ");
            }
        }
        return result;
    }


}
