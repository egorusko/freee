package Сhapter1_to_5.Array;
/*
* Использование разновидности for-each цикла for
* */
public class ForEach {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        // Использовать разновидность for-each цикла for
        // для суммирования и отображения значений
        for (int x :arr) {
            sum +=x;
        }
        System.out.println(sum);

        for (int i :arr) {
            if (i == 6 ) break;
            System.out.println(i);
        }

    }
}
