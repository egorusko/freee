package Chapter_6.Access_modifiers;

public class ErrorMsg {
    private static String sError[] = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапазона"
    };

    String getrrorMsg(int i){
        if (i >= 0 & i < sError.length) return sError[i];
        else return "Несуществующий код ошибки";
    }
}

class MsgErrorDemo{
    public static void main(String[] args) {
        ErrorMsg err = new ErrorMsg();

        System.out.println(err.getrrorMsg(0));
        System.out.println(err.getrrorMsg(1));
        System.out.println(err.getrrorMsg(2));
        System.out.println(err.getrrorMsg(11));

    }
}