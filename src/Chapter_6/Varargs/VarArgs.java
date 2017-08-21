package Chapter_6.Varargs;
// Демонстрация использования метода с переменным числом
// аргументов
public class VarArgs {
    // Метод vaTest() допускает переменное число аргументов
    static void vaTest(int ... var_Arr){
        System.out.println("Количество аргументов переданных в метод " +
        var_Arr.length);
        System.out.println("Содержание : ");

        for (int i = 0; i < var_Arr.length; i++) {
            System.out.print(var_Arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        VarArgs var = new VarArgs();
        //демонстрация. Вызывается с разными параметрами
        vaTest(10);
        vaTest(10,123123123,123123123,12312312,3123);
        vaTest(10,1,1,4,5,63,5,34,143,1);
        vaTest(101,23,354,5,123,5);
        vaTest(10,1,1);


    }
}
