package Chapter_7;

public class ErrorMsg {
    final int OUTERR = 0;
    final int INERR = 1;
    final int DISKERR = 2;
    final int INDEXERR = 3;

    String msg[] = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапазона"
    };

    // Возвратить сообщение об ошибке
    String getErorrmsg(int i) {
        return (i >= 0 & i < msg.length) ?
                msg[i] : "Несуществующий код ошибки";
    }
}
class FinalID{
    public static void main(String[] args) {
        ErrorMsg err = new ErrorMsg();

        // При вызове метода используются константы,
        // объявленные с помощью ключевого слова final

        System.out.println(err.getErorrmsg(err.DISKERR));
        System.out.println(err.getErorrmsg(err.OUTERR));
        System.out.println(err.getErorrmsg(err.INERR));
        System.out.println(err.getErorrmsg(err.INDEXERR));
        System.out.println(err.getErorrmsg(5));
    }
}