package Array;

public class LengthDemo {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int arr1[] = {1, 2, 3};
        int[][] arrTable = { //таблица строк, переменной длины
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9},
        };

        System.out.println("Paзмep arr: " + arr.length);
        System.out.println("Paзмep arr1: " + arr1.length);
        System.out.println("Paзмep arrTable: " + arrTable.length);
        System.out.println("Paзмep arrTable[О]: " + arrTable[0].length);
        System.out.println("Paзмep arrTable[l]: " + arrTable[1].length);
        System.out.println("Paзмep arrTable[2]: " + arrTable[2].length);
        System.out.println();
   /*
   * ///////////////////////////////////////////////////////////////////////
   * */



    }
}
