package Chapter_6.Access_modifiers;
//Реализация внутриних классов, хотя ранее я уже это неоднократно реализировал
public class Outer {
    int num[] ;

    Outer(int[] num) {
        this.num = num;
    }

    void Analiz(){
        Inner inOB = new Inner();
        System.out.println("Минимум " + inOB.min());
        System.out.println("Максимум " + inOB.max());
        System.out.println("Среднее " + inOB.avg());
    }

    class Inner {

        public int min() {
        int min = num[0];
            for (int i = 0; i < num.length; i++) {
                if (min > num[i]) min = num[i];
            }
            return min;
        }

        public int max() {
            int max = num[0];
            for (int i = 0; i < num.length; i++) {
                if (max < num[i]) max = num[i];
            }
            return max;
        }

        public int avg() {
            int sum =0;
            for (int i = 0; i < num.length; i++) {
                sum +=num[i];
            }
            return sum / num.length;
        }
    }
}
