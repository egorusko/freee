package Chapter_8.Access_modifier.bookpack; // <-- каталог или путь пакета, для класса book
// Простая программа, демонстрирующая применение пакетов
public class Book {
    protected String  title;// сменили на protected чтобы понять, как действует этот модификатор доступа
    protected String autor;
    protected int putDate;

    public Book(String title, String autor, int putDate) {
        this.title = title;
        this.autor = autor;
        this.putDate = putDate;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                ", putDate=" + putDate +
                '}';
    }


}
