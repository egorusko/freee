package Chapter_8.Access_modifier.bookpackext;
// Пример использования модификатора protected
public class ExtBook extends Chapter_8.Access_modifier.bookpack.Book {
    private String publisher;

    public ExtBook(String title, String autor, int putDate, String publisher) {
        super(title, autor, putDate);
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return  super.toString() + "\n" +  "ExtBook{" +
                "publisher='" + publisher + '\'' +
                '}';
    }
    //seter-geter для переменной publisher
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /*Следующие операторы допустимы, поскольку подклассы имеют
        право доступа к членам класса, объявленным защищенными. */

    public String getTitle(){return  title;}
    public String getAutor(){return  autor;}
    public int getputDate(){return putDate;}
    public void setTitle(String s){this.title = s;}
    public void setAutor(String s){this.autor = s;}
    public void setputDate(int i){this.putDate = i;}
}

//Демонстрация

class ProtectedDemo{
    public static void main(String[] args) {
        ExtBook extbook [] = new ExtBook[3];
        extbook[0] = new ExtBook("Java: А Beginner's Guide",
                "Schildt", 2007, "Osborne/McGraw-Hill");
        extbook[1]= new ExtBook( "Java: The Complete Reference",
                "Schildt", 2007, "Osborne/McGraw-Hill");
        extbook[2]= new ExtBook( "The Art of Java",
                "Schildt and Holmes", 2003,
                "Osborne/McGraw-Hill");

        for (int i = 0; i < extbook.length; i++) {
            if (extbook[i].getAutor() == "Schildt") System.out.println(extbook[i].getTitle());
        }
        //extbook.putDate = 200; доступ закрыт, так как класс ProtectedDemo
        // не являеться подклассом Book


    }
}