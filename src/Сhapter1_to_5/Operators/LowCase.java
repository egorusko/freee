package Сhapter1_to_5.Operators;
/*
* Преобразование прописных букв английского алфавита в строчные
* Используя, оператор побитового сдвига "ИЛИ" (|)
* */
public class LowCase {
    public static void main(String[] args) {
        char ch;
        int a;
        for (int i = 0; i < 10; i++) {
            ch = (char) ('A'+i);
            a = (int)ch;
            System.out.print(ch + "(" +a+ ")" + "-");
            // В результате установки в единицу шестого бита значения
            // переменной ch она всегда будет содержать прописную букву
            ch = (char) ((int) ch | 32);
            a = (int)ch;
            System.out.print(ch + "(" +a+ ")" + " " );



        }
    }
}
