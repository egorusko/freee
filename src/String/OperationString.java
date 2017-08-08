package String;
/*
* Рассмотрим основные операции с объектом String
* */
public class OperationString {
    public static void main(String[] args) {
        //1. boolean equals(строка) - данный метод, возрашает true false, если сравнимая строка, имеет ту же
        //последовательность. Например:
        String s = "Hello world!";
        String s1 = "Helo world!";
        String s2 = "Hello world!";
        String s3 = "world!";

        System.out.println(s.equals(s1)); // сравнимаем 1 & 2 строку - false
        System.out.println(s.equals(s2)); // cравнимаем 1 & 3 строку - true

        //2. int length() - возращает длину строки
        System.out.println(s.length()); // вернет количество символов в строке - 12

        //3.  char charAt ( index) , данный метов, возрашает символ (char) по индексу,
        // номерация строки начинается от 0
        System.out.println(s.charAt(2)); //вернет символ типа char  - l

        //4. int compareTo (String str) - проводит сразу 3 операции над строками,
        //сравнивает на длину (короче, длинее, равны), и возрашает значение
        //если текущая строка меньше строки str; = return -число
        //если эти строки ровны return 0
        //если текущая строка больше строки str = return +число
        System.out.println(s.compareTo(s1));//return -3
        System.out.println(s.compareTo(s2));//return 0
        System.out.println(s1.compareTo(s2));//return +3

        //5. int indexOf(String str)Выполняет в текущей строке поиск подстроки, определяемой
        //параметром str. Возвращает индекс первого вхождения
        //подстроки str или -1, если поиск завершается неудачно

        System.out.println(s.indexOf(s3)); //return 6 возрашает начальный символ, первого совпадения

        //6. int lastindexOf (String str)  аналогичный 5. пункту, только он ищет самое последнее совпадение
        s+=" привет, world!";
        System.out.println(s.lastIndexOf(s3));//return 21 пропускает первое совпадение, и возрашает последнее

        //7. Также уже знакомый, нам методо конкатенации, объеденение строк (+) строка плюс строка2
        // Но данный метод, для реализации учебного процесса, подходит, но его не используют, так как он
        // съедает куча памьяти




    }
}
