package Array;
/*
* for-each цикла for не может, присваивать объекту значейний
* */
public class NoChange {
    public static void main(String[] args) {
        //обьявление переменной которая содержит ссылку на массив
        int arr[] = new int[10];
        //иницилизация массива
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        //вывод на консоль содепржания массива
        for (int i :arr) {
            System.out.println(i);
        }
        //попытка, проинициализировать массив, чере for-each
        for (int i :arr) {
            i+=i;
        }
        //вывод на консоль, подтверждение, цикл for-each не проинициализировал массив
        for (int i :arr) {
            System.out.println(i);
        }

    }
}
