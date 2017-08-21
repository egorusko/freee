package Chapter_6.Varargs;
//Перегрузка методов, с переменным списком аргументов
public class VarArgsЗ {
    static void vaTest(int ... v ){
        System.out.println(v.length);
    }
    //Перегрузка № 1
    static void vaTest(double ... v ){
        System.out.println(v.length);
    }

    //Перегрузка № 2
    static void vaTest(char ... v ){
        System.out.println(v.length);
    }

    //Перегрузка № 3
    static void vaTest(boolean ... v ){
        System.out.println(v.length);
    }
    //Перегрузка № 4
    static void vaTest(){
        System.out.println("ЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫ");
    }
    //Перегрузка № 5
    static void vaTest(int t){
        System.out.println("ЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫ");
    }


    public static void main(String[] args) {
        vaTest(123,123,12,31231,32123);
        vaTest(true,false,true,false);
        vaTest('a','v','q','h');
        vaTest(1.123123123,12314,123123123,13123123123.12,4345345345.123);
        vaTest();
        vaTest(1);
        vaTest(1,23,4,5,5);
    }
}
