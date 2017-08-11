package Chapter_6.Access_modifiers;
// Простые тиnы данных передаются методам по значению
public class Test {
    int a,b;
    /* Этот метод не может изменить значения аргументов,
    передаваемых ему при вызове. */

    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setAB(int a,int b) {
        this.a = a;
        this.b = b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public void chenge(Test b) {
        this.b = b.a - b.b;
        this.a = b.a + b.b;


    }
}
    class CallByValue{
        public static void main(String[] args) {
            Test test = new Test(10,15);
            test.setAB(7,8);
            System.out.println(" a and b " + test.a + " " + test.b );
            test.chenge(test);
            System.out.println(" a and b " + test.a + " " + test.b );
        }
    }

