package Сhapter1_to_5.Operators;
/*
* побитовые операции
* &              Поразрядное И
|                Поразрядное ИЛИ
^                Поразрядное исключающее ИЛИ
>>               Сдвиг вправо
>>>              Сдвиг вправо без знака
<<               Сдвиг влево
~                Дополнение до 1 (унарная операция НЕ)
* */
public class UpCase {
    public static void main(String[] args) {
        char ch;
        int chInt;
        int a = 0b101010100101;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('a'+i);
            chInt = (int) ch;
            System.out.println("char = " + ch + "  int = " + chInt);

            ch = (char)     ((int) ch & 65503 );
            chInt = (int) ch;
            System.out.println("char = " + ch + "  int = " + chInt);
            System.out.println("byte a = " + a);

        }
    }
}
