package Chapter_8.InterfaceJava.qpack;

public class ByTwosDemo {
    public static void main(String[] args) {
        ByTwos byTwos = new ByTwos();

        for (int i = 0; i <5; i++) {
              byTwos.getNext();
        }
        byTwos.reset();
        for (int i = 0; i < 5; i++) {
            byTwos.getNext();
        }

        byTwos.setStart(100);
        for (int i = 0; i < 5; i++) {
            byTwos.getNext();
        }
    }

}
