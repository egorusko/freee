package Chapter_6.Access_modifiers;

// Применение статической переменной
public class StaticDemo {
    int x; // обычная переменная экземпляра
    static int y; // статическая переменная

    // Возвратить сумму значений переменной экземпляра х и
    // статической переменной у
    int sum(){

        return x+y;
    }
}
class SDemo{
    public static void main(String[] args) {
        StaticDemo sd = new StaticDemo();
        StaticDemo sd1 = new StaticDemo();
        sd.x = 10;
        sd1.x = 10;
        System.out.println(sd.x + sd1.x);//переменные разные

        // Все объекты совместно используют одну общую
        // копию статической переменной
        System.out.println("Statical int y - является общей" +
                " переменной, для всех объектов" );
        System.out.println("Присвоть статической переменной значение 19");
        StaticDemo.y = 19;
        System.out.println("воспользуемся методом sum, объекта sd  ");
        System.out.print(sd.sum());
        System.out.println();
        sd.y = 25;
        System.out.println("воспользуемся методом sum, объекта sd1" +
                "\nно присвоим, через объект sd, static int y = 25  ");
        System.out.print(sd.sum());
        System.out.println("\nКак видим, меняя статическую переменную, " +
                "в любом объекте, она во всех экземплярах, потому что она" +
                "она меняется в основном классе ");


        }
}