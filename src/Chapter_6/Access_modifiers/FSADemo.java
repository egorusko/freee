package Chapter_6.Access_modifiers;
// Демонстрация работы с "отказоустойчивым" массивом
public class FSADemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x ;
        String s = " 123123";
        s.length();
        System.out.println("Демонстрация, корректной обработки ошибок");

        for (int i = 0; i < (fs.length *2); i++) {
            fs.put(i,i*10);
        }
        //вывод заполненого массива
        for (int i = 0; i < (fs.length *2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.println(x + " ");
        }
        // Обработать ошибки
        System.out.println("\nОбработка Ошибок с выводом отчета");
        for (int i = 0; i < (fs.length *2); i++) {
            if (!fs.put(i,i*10))System.out.println("Индeкc " + i +
                    " вне допустимого диапазона");
        }

        for (int i = 0; i < (fs.length *2); i++) {
            x = fs.get(i);
            if (x != -1) System.out.println(x + " ");
            else System.out.println("Индeкc " + i +
                    " вне допустимого диапазона");
        }
    }
}
