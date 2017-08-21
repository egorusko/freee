package Chapter_7;

public class Who {
    void show(){
        System.out.println("Вызываем метод в Who ");
    }
}
class Who1 extends Who{
    void show(){
        System.out.println("Вызываем метод в Who1 ");
    }
}
class Who2 extends Who1{
    @Override
    void show(){
        System.out.println("Вызываем метод в Who2 ");
    }
}
class WhoDemo{
    public static void main(String[] args) {
        Who who =new Who();
        Who1 who1 = new Who1();
        Who2 who2 = new Who2();
        Who who3;

        who3 = who;
        who3.show();

        who3 = who1;
        who3.show();

        who3 = who2;
        who3.show();
    }
}