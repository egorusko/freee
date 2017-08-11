package Сhapter1_to_5.Array;
/*
* Использование цила for-each в многомерных массивах
* */
public class ForEach2 {
    public static void main(String[] args) {
        int arr[][] = new int[3][5];
        int sum = 0;
        //заполнение 2 мерного масива, 2 циклами for
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = (i+1) * (j+1);
            }
        }

        // Использовать разновидность for-each цикла for
        // для суммирования и отображения значений.
        // Обратите внимание на объявление переменной i[].
        //i[] - представляет собой ссылку на одномерный целочисленный массив.

        for (int i[] :arr) {
            for (int i1 :i) {
                System.out.print(i1 + ", ");
                sum += i1;
            }
        }

        System.out.println("\nСумма в arr[3][5] масиве составила: " + sum);

    }
}
