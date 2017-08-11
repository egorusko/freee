package Chapter_6.Access_modifiers;

/* В этом классе реализуется "отказоустойчивый" массив,
предотвращающий ошибки времени выполнения
*/
public class FailSoftArray {
    private int arr[];
    private int errval;
    public int length;

    /* Конструктору данного класса передается размер массива и
    значение, которое должен возвращать метод get() при
    возникновении ошибки. */

    public FailSoftArray(int size, int errval) {
        this.arr = new int[size];
        this.errval = errval;
        this.length = size;
    }

    public int get(int index) {
        return indexOK(index) ? arr[index] : errval;
    }

    // Установить значение элемента с заданным индексом.
    // Если возникнет ошибка, возвратить логическое значение false.
    public boolean put(int index, int value) {
        if (indexOK(index)) {
            arr[index] = value;
            return true;
        }
        else return false;

    }


    // Вернуть логическое значение true, если индекс
    // не выходит за границы массива
    private boolean indexOK(int index) {
        return (index >= 0 & index < length) ? true : false;
    }
}
