package Chapter_6.Access_modifiers;

//Алгоритм быстрой сортировки, Рекурсивным - методом
// Упражнение 6.3. Простая версия класса Quicksort,
// реализующего быструю сортировку
public class Quiksort {
    // Организовать вызов фактического метода быстрой сортировки
    static void qsort(char arrCh[]) {
        qs(arrCh, 0, arrCh.length - 1);
    }

    // Рекурсивная версия метода быстрой сортировки символов
    private static void qs(char arrCh[], int left, int right) {
        int i, j;
        char x, y;

        i = left; j = right;
        x = arrCh[(left+right)/2];

        do {
            while ((arrCh[i] < x) && (i < right)) i++;
            while ((x < arrCh[j]) && (j > left)) j--;

            if (i <= j) {
                y = arrCh[i];
                arrCh[i] = arrCh[j];
                arrCh[j] = y;
                i++;
                j--;
            }
        } while (i<=j);

        if (left < j) qs(arrCh,left,j);
        if (i < right) qs(arrCh,i,right);

    }
}
class QSDemo{
    public static void main(String[] args) {
        char arr_Char[] = {'a','u','f','b','t','x','p','c','d',};
        System.out.println("Не отсортированный массив символов");
        for (char ch :arr_Char) {
            System.out.print(ch + " ");
        }

        Quiksort.qsort(arr_Char);
        System.out.println("\nОтсортированный массив символов");
        for (char ch :arr_Char) {
            System.out.print(ch + " ");
        }

    }
}
