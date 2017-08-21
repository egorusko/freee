package Chapter_8.InterfaceJava;

import Chapter_8.InterfaceJava.qpack.ICharQ;

// Класс, реализующий очередь фиксированного размера
// для хранения символов
class FixedQueue implements ICharQ {
    private char q[];// массив для хранения элементов очереди
    private int putloc, getloc; // индексы вставляемых и извлекаемых элементов

    // Создать пустую очередь заданного размера
    public FixedQueue(int size) {
        this.q = new char[size+1]; // выделить память для очереди
        this.putloc = getloc = 0;
    }

    // Поместить символ в очередь
    @Override
    public void put(char ch) {
        //проверяем состояние очереди, если места нету, делаем возврат
        if(putloc==q.length-1){
            System.out.println("Очередь заполнена! ");
            return;
        }
        //иначе, повышаем очередь на 1, и заполняем пустое место
        putloc++;
        q[putloc] = ch;
    }
    // Извлечь символ из очереди
    @Override
    public char get() {
        //если переменные соппали, значить очередь и элемента нет в очереди, но тут не доработанно, так как
        //очередь может быть достигнуть лимита, тогда не логично, что очередь пуста, нужно добавить на мой взгляд
        //еще один блок  if(putloc==q.length-1) потому как у нас стек, ограниченный

        if (putloc == getloc){
            System.out.println("Очередь пуста! " );
            return (char) 0;
        }
        //итерируем переменную getlock, чтобы показать что мы уже взяли взяли элемент
        getloc++;
        return q[getloc];
    }

    @Override
    public void reset() {
        this.getloc = putloc = 0;
        char t[] = new char[q.length];
        q = t;
    }

    //копирование одной очереди в другую, правильно?
    void copyrate(FixedQueue fQ){
        for (int i = 0; i < fQ.q.length; i++) {
            this.put(fQ.get());
        }
    }
}
//класс CircularQueue реализует кольцевую очередь для хранения символов.
class CircularQueue implements ICharQ{
    private char q[]; //Массив для хранения элементов очереди
    private int putloc, getloc; //Индексы вставляемых и извлекаемых элементов

    public CircularQueue(int size) {
        this.q = new char [size+1];// выделить память для очереди
        this.putloc = getloc = 0 ;
    }

    //поместить символ в очередь
    /* Очередь считается полной, если индекс putloc на единицу
        меньше индекса getloc или если индекс putloc указывает
        на конец массива, а индекс getloc - на его начало */
    @Override
    public void put(char ch) {
        if (putloc+1 == getloc | ((putloc == q.length-1) & ( getloc==0 ))){
            System.out.println("Очередь заполнена! ");
            return;
        }
        putloc++;
        if (putloc==q.length)putloc=0;  // перейти в начало массива
        q[putloc] = ch;
    }

    //Извлечь из очереди
    @Override
    public char get() {
        if (putloc == getloc){
            System.out.println("Очередь пустая ");
            return (char) 0;
        }
        getloc++;
        if (getloc == q.length) getloc =0;
        return q[getloc];
    }

    @Override
    public void reset() {
        this.getloc = putloc = 0;
        char t[] = new char[q.length];
        q = t;
    }
}
// Динамическая очередь
class DynQueue implements ICharQ{
    private char q[];
    private int putloc, getloc;

    //устанавливаем создаем стек, и указываем размер стека
    public DynQueue(int size) {
        this.q = new char[size+1];//выделить памьять для очереди
        this.putloc = putloc = getloc = 0;
    }

    //положить в очередь элемент
    @Override
    public void put(char ch) {
        if (putloc == q.length-1){
            //Увеличиваем размер стека, так как достигнут лимит
            char t[] = new char[q.length *2];

            //копируем элементы в новую очередь
            for (int i = 0; i < q.length; i++) {
                t[i]= q[i];
            }
            //вопрос, а можно ли так делать, у нас же уже установленный размер
            q = t;
        }

        putloc++;
        q[putloc] = ch;
    }

    //извлечение элементов
    @Override
    public char get() {
        if (getloc==putloc){
            System.out.println("Очередь пуста");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }

    @Override
    public void reset() {
        this.getloc = putloc = 0;
        char t[] = new char[q.length];
        q = t;
    }
}
//Динамическая-Кольцевая очередь
class Dyb_CircularQueue implements ICharQ{
    private char q[];
    int putloc, getloc;

    public Dyb_CircularQueue(int size) {
        this.q = new char[size];
        this.putloc = getloc = 0;
    }

    @Override
    public void put(char ch) {
        if (putloc+1 == getloc | ((putloc == q.length-1) & ( getloc==0 ))){
            char t[] = new char[q.length*2];
            for (int i = 0; i < q.length; i++) {
                t[i]= q[i];

            }
            q=t;
        }
        putloc++;
        if (putloc==q.length)putloc=0;  // перейти в начало массива
        q[putloc] = ch;
    }

    @Override
    public char get() {
        if (putloc == getloc){
            System.out.println("Очередь пустая ");
            return (char) 0;
        }
        getloc++;
        if (getloc == q.length) getloc =0;
        return q[getloc];
    }

    @Override
    public void reset() {
        this.getloc = putloc = 0;
        char t[] = new char[q.length];
        q = t;
    }
}

public class IQDemo {
    public static void main(String[] args) {
        FixedQueue fq =new FixedQueue(10);//стек реализующий очередь фиксированного размера
        DynQueue dq = new DynQueue(5);// Динамическая очередь, тоесть увеличивающая, если места мало
        CircularQueue cq = new CircularQueue(10); // Кольцевая очередь
        ICharQ Iq; // переменная может храниться ссылка на любой объект, реализующий интерфейс.

        char cg;


        Iq = fq; //копируем методы, которые только объявленны в интерфейсе, (put() and get())

        // Поместить ряд символов в очередь фиксированного размера
        System.out.println("Заполнение фиксированной очереди >> ");
        for (int i = 0; i < 10; i++) {
            Iq.put((char)('A'+i));
        }

        // Отобразить содержимое очереди
        System.out.print("Содержимое фиксированной очереди: ");
        for (int i = 0; i <10; i++) {
            System.out.print(Iq.get() + ", ");
        }

        Iq = dq; //копируем методы, которые только объявленны в интерфейсе, (put() and get())

        // Поместить ряд символов в очередь денамического размера
        System.out.println("\nЗаполнение Динамической очереди >> ");
        for (int i = 0; i < 10; i++) { // вышли за пределы установленного new DynQueue(5);
            Iq.put((char)('Z'-i));
        }

        // Отобразить содержимое очереди
        System.out.print("Содержимое Динамической очереди: ");
        for (int i = 0; i <10; i++) {
            System.out.print(Iq.get() + ", ");
        }

        Iq = dq; //копируем методы, которые только объявленны в интерфейсе, (put() and get())

        // Поместить ряд символов в очередь денамического размера
        System.out.println("\nЗаполнение Кольцевой очереди >> ");
        for (int i = 0; i < 10; i++) { // вышли за пределы установленного new DynQueue(5);
            Iq.put((char)('A'+i));
        }

        // Отобразить содержимое очереди
        System.out.print("Содержимое Кольцевой очереди: ");
        for (int i = 0; i <10; i++) {
            System.out.print(Iq.get() + ", ");
        }

        System.out.println("\nПомещаем в Кольцевую очередь, 20 элементов >> ");
        //Помещаем больше элементов в кольцевую очередь
        for (int i = 10; i < 20; i++) {
            Iq.put((char)('A'+i));
        }

        // Отобразить содержимое очереди
        System.out.print("Содержимое Кольцевой очереди ");
        for (int i = 0; i <10; i++) {
            System.out.print(Iq.get() + ", ");
        }

        System.out.println("\nCoxpaнeниe и использование данных" +
                " кольцевой очереди");
        // Поместить символы в кольцевую очередь и извлечь их оттуда
        //тоесть, по факту, хоть мы и проходим 20 циклов, на самом, деле
        //стек если забиваеться, происходит перезапись старых, или возрат, если еще не извлечен
        //элемент
        for (int i = 0; i <20; i++) {
            Iq.put((char) ('A' + i));
            System.out.print(Iq.get() + ", ");
        }

    }
}
