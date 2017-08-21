package Chapter_7;

public class X {
    int a;

    public X(int i) {
        this.a = i;
    }
}

class Y {
    int a;

    Y(int i) {
        this.a = a;
    }

}
class Z extends X {
    int a;

    public Z(int i, int a) {
        super(i);
        this.a = a;
    }
}
class IncompatiЬleRef {
    public static void main(String[] args) {
        X x1 = new X(20);
        X x2;
        Y y = new Y(10);
        Z zz = new Z(10,20);
        x2 = x1; //Допустимо, так как обе переменные одного типа
        x2 = zz; // По-прежнему допустимо по указанной вьппе причине
        x2.a = 20; // допустимо
        //x2.b = 10; // не допустимо, так как супер класс, не видит своиъ подклассов

        //x2 = y; //Ошибка, так как переменные разных типов



    }
}