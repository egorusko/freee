package Сhapter1_to_5.String;
/*
* В Java тип String  - является объектом, и имеет огромною спецификаю и функционал
* */
public class StringDemo {
    public static void main(String[] args) {
        //создание строк:
        String s = new String("Создали строку 1 способом");
        String s1 = "Создали строку 2 способом";
        String s2 = new String(s); //создали строку 3 способом

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);

    }

}
