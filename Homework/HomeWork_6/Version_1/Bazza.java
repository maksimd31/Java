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


