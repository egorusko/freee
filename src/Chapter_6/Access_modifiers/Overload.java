package Chapter_6.Access_modifiers;

public class Overload {
    void ovlDemo(){
        System.out.println("Без параметров");
    }
    // Перегрузка метода ovlDemo для одного параметра типа int
    void ovlDemo(int i){
        System.out.println("С 1-м параметром " + i);
    }
    // Перегрузка метода ovlDemo для двух типов int
    void ovlDemo(int a, int b){
        System.out.println("C 2-мя параметрами " + a + " " + b);
    }
    // Перегрузка метода ovlDemo для двух типов double
    void ovlDemo(double a, double b){
        System.out.println("C 2-мя параметрами " + a + " " + b);
    }
}
class OverDemo{
    public static void main(String[] args) {
        Overload override = new Overload();
        override.ovlDemo();
        override.ovlDemo(11);
        override.ovlDemo(11,23);
        override.ovlDemo(1.1,1.3);
    }
}

