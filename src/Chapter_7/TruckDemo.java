package Chapter_7;
public class TruckDemo {
    public static void main(String[] args) {
        // Создать ряд новых объектов типа Truck
        Trusk semi = new Trusk(2,200,7,40000);
        Trusk pickup = new Trusk(3,28,15,2000);

        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);
        System.out.println("Грузовик может перевезти " + semi.getCargocap() + " фунтов.");
        System.out.println("Для преодоления " + dist + " миль грузовику потребуется " +
        gallons + " галонов топлива \n");

        System.out.println("Пикaп может перевезти "
                 + pickup.getCargocap() +
                        " фунтов.");
                System.out.println("Для преодоления "
                         + dist + " миль пикапу требуется "
                         + pickup.fuelneeded(dist) +" галлонов топлива.");

    }
}
