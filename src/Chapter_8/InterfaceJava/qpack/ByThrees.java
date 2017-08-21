package Chapter_8.InterfaceJava.qpack;

import Chapter_8.InterfaceJava.Series;

// Еще одна реализация интерфейса Series
public class ByThrees implements Series {// Друrой способ реаnиэаци1 интерфейса Series
    int start;
    int val;

    public ByThrees() {
        this.start = 0;
        this.val = 0;
    }

    @Override
    public int getNext() {
        val+=3;
        return val;
    }

    @Override
    public void reset() {
    this.val = start = 0;
    }

    @Override
    public void setStart(int x) {
        this.start = val = x;
    }
}
