/*
* создали класс который демонстрирует, реализацию Vehicle
* */
public class VehicleDemo {

    public static void main(String[] args) {
        Vehicle miniven = new Vehicle();//создали объект минивен, с типом Vehicle
        Vehicle sporcar = new Vehicle();
        int range[] = new int[2];

        miniven.passengers = 7; //присвоили объекту минивен, 14 пассажиров, с помошью "." - это точечная нотация
        miniven.fuelcap = 16; //
        miniven.mpq = 21;
        // разчет дальности поездки
        range[0] = miniven.fuelcap * miniven.mpq;

        sporcar.passengers = 2;
        sporcar.fuelcap = 14;
        sporcar.mpq = 12;
        //расчет дальности для спорткара
        range[1] = sporcar.fuelcap * sporcar.mpq;

        System.out.println("Miniven может перевезти " +
                miniven.passengers + " на растояние " + range[0]);

        System.out.println("SportCar может перевезти " +
                sporcar.passengers + " на растояние " + range[1]);
    }

}

