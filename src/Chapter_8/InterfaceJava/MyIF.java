package Chapter_8.InterfaceJava;
// Объявление "обычного" метода интерфейса, которое НЕ включает
// определение реализации по умолчанию
public interface MyIF {
    // определение реализации по умолчанию
    int getUserID();

    // Объявление метода по умолчанию, включающее его реализацию
    default int getAdminID() {
        return 1;
    }

    // Объявление статического метода интерфейса
    static  int getUniversalID(){
        return 1;
    }
}
// Реализация интерфейса MyIF
class MyIFimp implements MyIF{
    // Реализации подлежит лишь метод getUserID() интерфейса My!F.
    // Делать это для метода getAdminID() необязательно, поскольку
    // при необходимости может быть использована его реализация,
    // заданная по умолчанию.

    @Override
    public int getUserID() {
        return 100;
    }
}

class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFimp mf = new MyIFimp();
        MyIFimp2 mf2 = new MyIFimp2();
        //вызов переопределеного метода из класса
        System.out.println(mf.getUserID());

        //Вызов медода из интерфейса, хотя в классе мы его не реализоваывали
        System.out.println(mf.getAdminID());

        //в классе MyIFimp2 мы переопределили 2 метод, теперь
        System.out.println(mf2.getUserID());
        System.out.println(mf2.getAdminID());//сработает метод который у нас в классе


        int a = MyIF.getUniversalID();// вызываем статический метод интерфейса

    }
}
class MyIFimp2 implements MyIF{

    @Override
    public int getUserID() {
        return 1000;
    }

    @Override
    public int getAdminID() {
        return -100;
    }
}