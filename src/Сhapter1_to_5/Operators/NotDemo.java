package Сhapter1_to_5.Operators;
/*
* Использования логического оператора побитовых операций
* "Исключающего НЕ" (~)
* */

public class NotDemo {
    public static void main(String[] args) {
        byte b = -34;
        int a = 55;
        int c = 22;

//        for (int i = 128; i > 0; i/=2) {
//            if ((b & i)!= 0) System.out.print("0 ");
//            else System.out.print("1 ");
//        }
//
//        b = (byte) ~b;
//        System.out.println();
//        for (int i = 128; i > 0; i/=2) {
//            if ((b & i)!= 0) System.out.print("0 ");
//            else System.out.print("1 ");
//        }
//        System.out.println("\n");

        for (int i = 12800; i > 0; i = i/2) {
            if ((i & a)!= 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
        System.out.print("  int =  "+ a);

        a = ~a;
        System.out.println();
        for (int i = 12800; i > 0; i = i/2) {
            if ((i & a)!= 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
        System.out.print("  int =  "+ a);


    }
}
