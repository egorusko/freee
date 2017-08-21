package Chapter_7;
// Расширение класса Vehicle для грузовиков
public class Vehicle2 {
    private int passengers; //пасажиры
    private int fuelcap;//емкость топливного бака
    private int mpq;//разход топлива

    public Vehicle2() {
    }

    Vehicle2(int ps, int fc, int mpq){
        this.passengers = ps;
        this.fuelcap = fc;
        this.mpq = mpq;
    }

    //медоты доступа к закрытым переменным

    public int getPassengers() {
        return passengers;
    }

    public Vehicle2 setPassengers(int passengers) {
        this.passengers = passengers;
        return this;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public Vehicle2 setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
        return this;
    }

    public int getMpq() {
        return mpq;
    }

    public Vehicle2 setMpq(int mpq) {
        this.mpq = mpq;
        return this;
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
