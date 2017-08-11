package Сhapter1_to_5.Operators;

import java.io.IOException;

public class SqrRoot {
    public static void main(String[] args) throws IOException {
        int e;
        int result;
        for (int i = 0; i <= 9; i++) {
            result = 1;
            e = i;
            while (e > 0){
                result *= 2;
                e--;
            }
            System.out.println("2 встепени " + i + " равно " + result);
        }

    }
}