package Chapter_7;
// Использование ключевого слова super для предотвращения
// сокрытия имен
// Переопределенеие метода
public class A {
    int i,j;
    // Демонстрация очередности вызова конструкторов.

    public A(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public A() {
        System.out.println("Конструктор А ");
    }

    // Отобразить переменные i и j
    void show(){
        System.out.println("i и j: " + i + " " + j);
    }

    //создаем не переопределяеммый метод  c использованием слова final
    final void abs(){
        System.out.println(" Hello people!");
    }
}

// Создать подкласс путем расширения класса А
class  B extends  A{
    int i;// эта переменная i скрывает переменную i из класса А

    public B() {
        super();
        System.out.println("Конструктор В ");
    }

    public B(int i, int j, int i1) {
        super(i, j);
        this.i = i1;
    }

    public B(int a, int b) {
        super.i = a; // переменная из класса А
        this.i = b; // переменная из класса В
    }

    //Донный метод nepeonpeдeляет метод show() нз кnоссо А
    void show(){
        System.out.println("в Под-классе i = " + i);

    }

    //пробуем переопределить метод final? не получиться !!!
    /*void abs(){
        System.out.println("Goodbye miss");
    }*/
}
final class C extends B{ // создаем класс с словом final, который запрешает наследовать класс и пользоваться им
    public C() {
        super();
        System.out.println("Конструктор C ");
    }
}
//Ощибка класс не может унаследоватся от C так как он final
/*class СС extends C{

}*/


class UserSuper{
    public static void main(String[] args) {
        A aa = new A();
        B bb = new B(1,2);
        C cc = new C();//Конструкторы вызываються, от восходячего класса
        bb.show();

        B bb2  = new B(1,2,3);
        bb2.show(); // данный метод, переопределяет метод в супер классе, но можно, вызвать метод супер класса super.show();


    }
}