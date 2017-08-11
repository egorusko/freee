package Сhapter1_to_5.Operators;

public class ShowBits {
    public static void main(String[] args) {
        byte val;
        int t;
        val = 10;
        for ( t = 128; t > 0  ; t/=2) {
            if ((val &t) !=0) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
}
