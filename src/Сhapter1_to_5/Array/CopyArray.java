package Сhapter1_to_5.Array;
/*
** Проверка, и копирования, одного массива в другой
*/
public class CopyArray {
    public static void main(String[] args) {
        int arr3[] = new int[10];
        int arr4[] = new int[10];

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = i;
        }

        if (arr3.length <= arr4.length)
            for (int i = 0; i < arr4.length; i++)
                arr4[i] = arr3[i];

        for (Integer integer :arr4) {
            System.out.println(integer+ " ");
        }

    }
}
