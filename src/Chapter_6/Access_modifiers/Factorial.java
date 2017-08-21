package Chapter_6.Access_modifiers;
//нахождения факториала, 2 методами
public class Factorial {

    //Рекурсивный метод
    public static int factR(int n) {
       int result;
       return n==1? 1:factR(n-1)*n;
    }

    // Вариант программы, вычисляющий факториал итеративным способом
    public static int factI(int n){
        if (n==1)return  1;
        int result  = 1;

        for (int i = 1; i <= n ; i++) {
            result *=i;
        }
        return result;
    }

}
class FactorialDemo{
    public static void main(String[] args) {
        System.out.println("нахождение факториала, рекурсивным-методом: ");
        System.out.print(Factorial.factR(5));
        System.out.println("нахождение факториала, итеративным-методом: ");
        System.out.print(Factorial.factI(5));
    }
}

