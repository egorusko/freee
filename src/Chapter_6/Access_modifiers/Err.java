package Chapter_6.Access_modifiers;
// Возврат объекта, определяемого разработчиком программы
public class Err {
    String msg;//сообщение об ошибке
    int severity; //уровень серьезности ошибки

    public Err(String msg, int severity) {
        this.msg = msg;
        this.severity = severity;
    }
}
class ErrorInfo{
    private static String sError[] = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапазона"
    };
    int howbard[] = {3,3,2,4};
    Err getErrorInfo( int i){
    if (i>=0 & i < sError.length) return new Err(sError[i],howbard[i]);
    else return new Err("Несушествуюший код ошибки", 0);
    }
}

class ErrInfoDemo{
    public static void main(String[] args) {
        ErrorInfo err = new ErrorInfo();
        Err e;
        e = err.getErrorInfo(2);
        System.out.println(e.msg + " уровень: " + e.severity);

        e = err.getErrorInfo(11);

        System.out.println(e.msg + " уровень: " + e.severity);
    }
}