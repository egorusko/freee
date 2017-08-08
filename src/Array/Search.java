package Array;
/*
* Реализация цикла for-each, для поиска в масивах
* */
public class Search {
    public static void main(String[] args) {
        int arr[] = {1,44,56,67,7,1345,7563234,31234,421,3445}; // обьявляем и иницилизируем массив
        int value = 1345;//искомое значение
        boolean search = false; // логическая переменная

        //поиск, нечем не отличается от поиска в for, окуратней запись
        for (int i :arr) {
            if (i == value){
                search = true;
                break;
            }
        }
        //если логическая переменная true выведется предложение на консоль
        if (search) System.out.println("Значение найденно!");

    }

}
