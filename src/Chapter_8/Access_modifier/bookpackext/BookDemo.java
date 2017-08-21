package Chapter_8.Access_modifier.bookpackext;

import Chapter_8.Access_modifier.bookpack.*;

public class BookDemo // <-- Класс BookDemo таКJКе принадnежнт пакету bookpack
{
/*
* Уровни доступа к членам классов
                            |Закрытый|    |По-умолчанию|    |Защищенный|      |Открытый|
Доступен в том же классе        Да             Да               Да               Да
Доступен из подкласса
в том же пакете                 Нет            Да               Да               Да
Доступен из пюбого класса
в том же пакете                 Нет            Да               Да               Да
Доступен из подкласса
в любом пакете                  Нет            Нет              Да               Да
Доступен из всякого класса
в любом пакете                  Нет            Нет              Нет              Да

Если модификатор доступа явно не указан для члена класса он доступен только в своем пакете
*
* */


    public static void main(String[] args) {
        Book book[] = new Book[4];
        book[0]= new Book("Java: А Beginner's Guide",
                "Schildt", 2014);
        book[1] = new Book("Java: The Complete Reference",
                "Schildt", 2014);
        book[2] =new Book( "The Art of Java",
                "Schildt and Holmes", 2003);
        book[3] = new Book("Red Storm Rising",
                "Clancy", 1986);
        //вывод содержание объектов
        for (Book book1 :book) {
            //if (book1.title.equals(null)) continue;
            System.out.println(book1.toString());
        }

    }
}
