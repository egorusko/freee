package Chapter_6.Access_modifiers;

// Усовершенствованный класс очереди, предназначенной
// для хранения символьных значений
public class Queue {
    private char q[];// массив для хранения элементов очереди
    private int putloc, getloc;// индексы для вставки и извлечения элементов bp очереди

    // Конструктор, создающий один объект типа Queue
    // на основе другого
    Queue(Queue оb) {
        putloc = оb.putloc;
        getloc = оb.getloc;
        q = new char[оb.q.length];

    // Копировать элементы очереди
        for (int i = getloc + 1; i <= putloc; i++)
            q[i] = оb.q[i];
    }

    // Сконструировать пустую очередь заданного размера
    Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    Queue (char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length+1];
        for(int i = 0; i < a.length; i++) put(a[i]);

    }

    // Поместить символ в очередь
    void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" Очередь заполнена.");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }

    //Извлечь символ из очереди
    char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста ");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }

}
