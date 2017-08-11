package Chapter_6.Access_modifiers;

public class AccessDemo {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        /* Доступ к переменной alpha возможен только с помощью
        специально предназначенных для этой цели методов. */
        myClass.setAlpfa(-99);
        myClass.beta = 99;
        myClass.gamma = 999;

        System.out.println(myClass.beta);
        System.out.println(myClass.getAlpfa());
        System.out.println(myClass.gamma);

    }
}
