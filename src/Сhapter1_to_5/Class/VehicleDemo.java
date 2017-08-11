package Сhapter1_to_5.Class;/*
* создали класс который демонстрирует, реализацию Vehicle
* */

import java.io.IOException;

public class VehicleDemo {
    public static void main(String[] args) throws IOException{
        Vehicle miniven = new Vehicle(7, 16,21);//создали объект минивен, с типом Vehicle, и задали значения в конструктор
        Vehicle sporcar = new Vehicle(2, 14,12);
        int dist = 1000;
        double galons;

        galons = miniven.fuelneeded(dist);
        System.out.println("Для преодоления Мини-Вену" + dist + " миль потребуется " + galons + " галонов бенза");

        galons = sporcar.fuelneeded(dist);
        System.out.println("Для преодоления Мини-Вену" + dist + " миль потребуется " + galons + " галонов бенза");


    }

}

