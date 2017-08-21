package Chapter_6.Access_modifiers;
//реализация статической переменной и метода
public class StaticMeth {
    static int val = 1024;
    int a = 2;

    static  int ValDiv2(){
        return val/2;
    }
}

class SMDemo{
    public static void main(String[] args) {
        System.out.println("Значение static val ");
        System.out.println("Вызывает метод, по прямому обращению," +
                " не создавая объекта");
        System.out.println(StaticMeth.ValDiv2());

        System.out.println("меняем static int val ");
        StaticMeth.val = 8;
        System.out.println("И снова вызываем метод ValDiv2()");
        System.out.println(StaticMeth.ValDiv2());
        System.out.println("Как видим, что нам не нужно" +
                " создавать объекты класса, а просто обратится" +
                "к static переменной");
        /**
         * ОГРАНИЧЕНИЯ STATIC
         */
        /*  1)  в методе типа static допускается непосредственный вызов только других мето­
                дов типа static;
            2)  для метода типа static непосредственно доступными оказываются только другие
                данные типа static, определенные в его классе;
            3)  в методе типа static должна отсутствовать ссылка this.

            НАПРИМЕ ДАННЫЙ КОД НЕ ПРОЙДЕТ КОМПИЛЯЮЦИЮ
            static int val = 1024;
            int a = 2;

            static  int ValDiv2(){ //Static method
            return val/a;} //a not static
    }


         */



        }
}