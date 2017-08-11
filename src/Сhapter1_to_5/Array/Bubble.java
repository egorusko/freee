package Сhapter1_to_5.Array;

public class Bubble {
    public static int[] sort(int[] arr){
        int t;
        for (int i = 1; i < arr.length; i++) {
            for (int j = arr.length -1; j >=i ; j--) {
                if (arr[j-1] > arr[j]){
                    swap(arr,j-1,j);
                }
            }
        }

        return arr;
    }
    public static char[] sort(char[] arr){
        int t;
        for (int i = 1; i < arr.length; i++) {
            for (int j = arr.length -1; j >=i ; j--) {
                if (arr[j-1] > arr[j]){
                    swap(arr,j-1,j);
                }
            }
        }

        return arr;
    }

    private static void swap(int arr[], int a, int b) {
        int t;
        t = arr[b];
        arr[b] = arr[a];
        arr[a] = t;
        return;

    }
    private static void swap(char arr[], int a, int b) {
        int t;
        t = (char)arr[b];
        arr[b] = arr[a];
        arr[a] = (char) t;
        return;

    }

}
