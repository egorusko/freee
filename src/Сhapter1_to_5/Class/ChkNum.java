package Сhapter1_to_5.Class;

public class ChkNum {
    //метод нахождения четных чисел
    boolean isEven(int x) {
        if (x % 2 == 0) return true;
        else return false;
    }

    // Является ли 1 число дилителем 2
    boolean isFactor(int a, int b) {
        if ((b % a) == 0) return true;
        else return false;
    }

}

class ChkNumDemo {
    public static void main(String[] args) {
        ChkNum chkNum = new ChkNum();
//        if (chkNum.isEven(11)) System.out.println("Четное");
//        else System.out.println("Нечетное");

        if (chkNum.isFactor(2,20)) System.out.println("Первое чилос, явлется дилителем");
        if (chkNum.isFactor(3,29)) System.out.println("Первое число, является дилителем");

    }
}
