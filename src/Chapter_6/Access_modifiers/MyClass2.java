package Chapter_6.Access_modifiers;
//!! Демонстрация перегрузки конструкторов
public class MyClass2 {
    int a;

    public MyClass2(int a) {
        this.a = a;
        System.out.println("Конструктор, принимаюий тип int");
    }

    public MyClass2(byte a) {
        this.a = (int) a;
        System.out.println("Конструктор, принимаюий тип byte");
    }
    public MyClass2(double a) {
        this.a =(int) a;
        System.out.println("Конструктор, принимаюий тип double");
    }
    public MyClass2(char a) {
        this.a = (int) a;
        System.out.println("Конструктор, принимаюий тип char");
    }

}

class OverloadConsDemo{
    public static void main(String[] args) {
        MyClass2 a = new MyClass2(10);
        MyClass2 a1 = new MyClass2((byte)10);
        MyClass2 a2 = new MyClass2('a');
        MyClass2 a3 = new MyClass2(10.0);

    }
}
