package Homework;

public class teeest {
    public static void main(String[] args) {
        //6. Напишите рекурсивный метод, отображающий символы, составляющие строку в
        //обратном порядке.
        String s = "Hello miss. Do you speak English?";
        String s1 = ABSTest.abs(s);

        System.out.println(s);
        System.out.println(s1);

        //12. Создайте метод sum () , принимающий список аргументов переменной длины и
        //предназначенный для суммирования передаваемых ему значений типа int. Ме­
        //тод должен возвращать результат суммирования. Продемонстрируйте работу это­
        //го метода.

        System.out.println(sum(12,3,234,3245,3,653,1,2,3));




    }

    private static int sum(int... arr){
        int sum =0;
        for (int i :arr) {
            sum +=i;
        }
        return sum;
    }
}

class ABSTest {

    public static String abs(String ss){
        String s_result = "";
        char ch[] = new char[ss.length()];
        ch = srtRecurs(ss,ss.length()-1,ch);
        for (int i = 0; i < ch.length; i++) {
            s_result += Character.toString(ch[i]);
        }
        return s_result;
    }
    private static char[] srtRecurs(String str, int i, char arr_CH[]) {

        if (i >= 0){
            arr_CH[(str.length()-1) - i] = str.charAt(i);
            srtRecurs(str,--i,arr_CH);
        }

        return arr_CH;
    }


}


