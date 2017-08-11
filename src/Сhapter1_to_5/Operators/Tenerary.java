package Сhapter1_to_5.Operators;

public class Tenerary {
    public static void main(String[] args) {
        int result;
        for (int i = -6; i <5 ; i++) {
            result =  i!=0 ? 100/i:0;
            System.out.println("lOO /" + i + " равно " + result);
        }

        for (int i = -6; i < 5; i++) {
            if (i !=0 ? true:false) System.out.println("lOO /" + i + " равно " + 100/i);
        }



    }
}
