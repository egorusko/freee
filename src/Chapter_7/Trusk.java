package Chapter_7;

public class Trusk extends Vehicle2 {
   private int cargocap; // грузоподъемность в фунтах
    //Конструктор класса Trusk
    public Trusk(int ps, int fc, int mpq, int cargocap) {
        super(ps, fc, mpq);
        this.cargocap = cargocap;
    }

    public int getCargocap() {
        return cargocap;
    }

    public Trusk setCargocap(int cargocap) {
        this.cargocap = cargocap;
        return this;
    }
}
