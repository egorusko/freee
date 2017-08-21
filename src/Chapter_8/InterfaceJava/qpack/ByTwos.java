package Chapter_8.InterfaceJava.qpack;

import Chapter_8.InterfaceJava.Series;

// Реализация интерфейса Series и добавление метода getPrevious()
public class ByTwos implements Series { //Реоnизует интерфейс Series
    int start;
    int val;
    int prev;

    public ByTwos() {
        this.start = start = val = 0;
        this.prev = -2;
    }


    @Override
    public int getNext() { // метод, обьявляеться публичным, потому как интерфейс буличный!!!
        prev = val;
        val +=2;
        System.out.print("\nCлeдyющee значение: " + val);
        return val;
    }

    @Override
    public void reset() { // метод, обьявляеться публичным, потому как интерфейс буличный!!!
        System.out.print("\nСброс ");
        this.start =0;
        this.val = 0;
        this.prev = -2;
    }

    @Override
    public void setStart(int x) {  // метод, обьявляеться публичным, потому как интерфейс буличный!!!
        System.out.print("\nЗадано новое значение "  + x);
        this.start = start = val = x;
        this.prev = x -2;
    }

    public int getPrev() { // Добавление метода, не объ1вnенноrо в интерфейсе Series
        return prev;
    }
}
