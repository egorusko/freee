package Throws;
public class TestStackTrace {

    public static void main(String[] args) {
        int i = 30;
        while (i > 0) {
            do {
                if (i > 7){
                    i--;
                    continue;
                }
                i--;
                break;
            } while (i > 0);
            System.out.print(i);
        }
    }
}
