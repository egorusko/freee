package Сhapter1_to_5.String;
/*
*метод substring (), возвращающий новую строку, которая содержит часть вы­
*зывающей строки
* */
public class SubStr {
    public static void main(String[] args) {
        String orgstr = "Java - двигатель Интернета.";
        String substr = orgstr.substring(7, 25);

        System.out.println(orgstr);
        System.out.println(substr);

    }
}
