package Сhapter1_to_5.Class;

/*
* программа в которой используется класс - Vehicle
* класс лишь содержит представление об объекте,
* в котором хранятся различные переменные
* */
public class Vehicle {
    public int passengers; //пасажиры
    public int fuelcap;//емкость топливного бака
    public int mpq;//разход топлива

    Vehicle(int ps, int fc, int mpq){
        this.passengers = ps;
        this.fuelcap = fc;
        this.mpq = mpq;
    }

    // Определить дальность поездки транспортного средства
    public  int renge(){
        return  fuelcap * mpq;
    }

    // Рассчитать объем топлива, необходимого транспортному
    // средству для преодоления заданного расстояния
    public double fuelneeded(int milles){
        return (double)milles/mpq;
    }
}
