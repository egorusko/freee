package Сhapter1_to_5.Operators;
/*
* Использования логического оператора побитовых операций
* "Исключающего ИЛИ" (^)
* Данная программа, демонстрирует простейшую шифрацию дешифрацию
* */
public class Encode {
    public static void main(String[] args) {
        String s =  "Goodbye miss";
        String encoding_s ="";
        String decoding_s = "";
        String key_String_in ="12345678";
        String key_String_out = "";
        for (int i = 0; i < key_String_in.length(); i++) {
            key_String_out += (int)key_String_in.charAt(i);
        }
        long key = Long.parseLong(key_String_out);
        int encod;
        int encod2;

        System.out.print("Исходное сообщение: ");
        System.out.println(s);

        //encoding msg(s) 
        for (int i = 0; i < s.length(); i++) {
            //process encoding
            encod = s.charAt(i);
            encoding_s = encoding_s + (char) (s.charAt(i) ^ key);
            encod2 = encoding_s.charAt(i);
            }
        //result encoding
        System.out.print("Результат кодирование: ");
        System.out.println(encoding_s);

        //decoding
        for (int i = 0; i < encoding_s.length(); i++) {
            decoding_s = decoding_s + (char) (encoding_s.charAt(i) ^ key);
        }

        //result decoding
        System.out.print("Результат разкодирования: ");
        System.out.println(decoding_s);

        }
}
