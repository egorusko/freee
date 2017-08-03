package Class;/*
* создали класс который демонстрирует, реализацию Vehicle
* */
public class VehicleDemo {

    public static void main(String[] args) {
        Vehicle miniven = new Vehicle();//создали объект минивен, с типом Vehicle
        Vehicle sporcar = new Vehicle();

        miniven.passengers = 7; //присвоили объекту минивен, 14 пассажиров, с помошью "." - это точечная нотация
        miniven.fuelcap = 16; //
        miniven.mpq = 21;
        // разчет дальности поездки

        sporcar.passengers = 2;
        sporcar.fuelcap = 14;
        sporcar.mpq = 12;
        //расчет дальности для спорткара

        System.out.print("Miniven может перевезти " +
                miniven.passengers + " пасажиров " );
        miniven.renge();

        System.out.print("SportCar может перевезти " +
                sporcar.passengers + " пасажиров " );
        sporcar.renge();
    }

}

