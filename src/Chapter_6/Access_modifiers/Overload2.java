package Chapter_6.Access_modifiers;
/* Автоматическое преобразование типов может влиять
*  на выбор перегружаемого метода.
*/
public class Overload2 {
    void f(int i){
        System.out.println("Bнyтpи f(int): "+ i);
    }
    void  f(double i){
        System.out.println("Bнyтpи f(double): "+ i);
    }
    //добавление определенного типа byte
    void f(byte i){
        System.out.println("Bнyтpи f(byte): "+ i);
    }

}

class OverDemo2{
    public static void main(String[] args) {
        Overload2 o = new Overload2();
        int i = 10;
        double d = 10.1;
        byte b = 99;
        short s = 10;
        float f = 11.0F;

        o.f(i); // вызов метода ob.f(int)
        o.f(d); // ВЫЗОВ метода ob.f(double)
        o.f(b); // вызов метода ob.f(int) с преобразованием типов
        o.f(s); // ВЫЗОВ метода ob.f(int) с преобразованием типов
        o.f(f); // вызов метода ob.f(douЬle) с преобразованием типов

    }
}
