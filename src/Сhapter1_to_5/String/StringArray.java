package Сhapter1_to_5.String;

public class StringArray {
    public static void main(String[] args) {
            String strArr[] = {"Hello","I undertend Russian", "and speak Russian, are little"};

        for (String s :strArr) {
            System.out.print(s + " ");
        }

        strArr[1] = "I undertend English";
        strArr[2] = "and speak English, a little";

        for (String s :strArr) {
            System.out.print("s = " + s);
        }


    }
}
