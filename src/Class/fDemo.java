package Class;
/*
* Реализация метода finalize()
* Сборшик мусора
* */
public class fDemo {
    int x;

    // Конструктор класса
    fDemo(int i){
        this.x = i;
    }
    // Вызывается метод при удалении объекта
    protected void finalize(){
        System.out.println("метод \"finalize()\" сработал в переменной класса " + x );
    }
    //данный метод, будет автоматически создавать объекты класса
    void generator(int i){
        fDemo o = new fDemo(i);
    }
}
class Finalize{
    public static void main(String[] args) {
        int count;
        fDemo o = new fDemo(0);
        //создаем множество объектов, и в какой-то момент должен вызваться finalize()
        for (count = 0; count < 1000000 ; count++) {
            o.generator(count);
        }
    }
}