package Chapter_6.Varargs;
// Использование массива аргументов переменной длины
// наряду с обычными аргументами
public class VarArgs2 {
    // Здесь msg - обычный параметр,
    // а v - массив параметров переменной длины
    //!ПРИМЕЧАНИЕ
    // список переменной длины должен передаватся последним
    // список, можешь быть только один
    static  void vaTesta(String msg, int ... var_Arr){
        System.out.println(msg + var_Arr.length);
        if (var_Arr.length ==0) return;
        System.out.print("Содержание : ");

        for (int i = 0; i < var_Arr.length; i++) {
            System.out.print(var_Arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        VarArgs2 var2 = new VarArgs2();
        var2.vaTesta("Передаю методу 2 параметра ", 1,3);
        vaTesta("Передаю методу 1 параметр ", 1111111);
        vaTesta("Непередаю параметры ");

    }
}
