package Class;

/*
* программа в которой используется класс - Vehicle
* класс лишь содержит представление об объекте,
* в котором хранятся различные переменные
* */
public class Vehicle {
    public int passengers; //пасажиры
    public int fuelcap;//емкость топливного бака
    public int mpq;//разгод топлива

    public  void renge(){
        System.out.println("Дальнность поездки, составляет " + fuelcap*mpq + " миль");
    }
}
