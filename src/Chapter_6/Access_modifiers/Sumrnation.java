package Chapter_6.Access_modifiers;
// Инициализация одного объекта посредством другого 
public class Sumrnation {
    int sum =0;
    // Создать объект на основе целочисленного значения 
    public Sumrnation(int num) {
        for (int i = 0; i < num ; i++) {
            this.sum += i;
        }
    }

    public Sumrnation(Sumrnation ob) {
        this.sum = ob.sum;
    }
}

class SumDemo{
    public static void main(String[] args) {
        Sumrnation sm = new Sumrnation(5);
        Sumrnation sm1 = new Sumrnation(sm);

        System.out.println(sm.sum);
        System.out.println(sm1.sum);


    }
}