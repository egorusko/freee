package Сhapter1_to_5.Operators;
/*
* Использования логических операторов побитовых операций
* " Сдвих Влево, Вправо, вправо без знака" (<< || >> | >>>)
*
*/

public class ShiftDerno {
    public static void main(String[] args) {
        int val =1;

        for (int i = 0; i < 8; i++) {
            for (int j = 128; j > 0; j/=2) {
                if ((val&j) !=0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.print(" " + val);
            System.out.println();
            val = val << 1;

        }
        System.out.println();
        val = 128;

        for (int i = 0; i < 8; i++) {
            for (int j = 128; j > 0; j/=2) {
                if ((val&j) !=0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.print(" " + val);
            System.out.println();
            val = val >> 1;

        }

    }
}
