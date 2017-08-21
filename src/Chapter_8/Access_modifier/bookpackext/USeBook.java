package Chapter_8.Access_modifier.bookpackext;
import Chapter_8.Access_modifier.bookpack.Book; //extends Chapter_8.bookpack.Book
public class USeBook {
    public static void main(String[] args) {
        Book book[] = new Book[5];
        book[0] = new Book("Java: А Beginner's Guide",
        "Schildt", 2007);
        book[1] = new Book("Java: А Beginner's Guide",
                "Schildt", 2007);
        book[2] = new Book("Java: А Beginner's Guide",
                "Schildt", 1986);
        book[3] = new Book("Java: А Beginner's Guide",
                "Schildt", 2003);
        book[4] = new Book("Java: А Beginner's Guide",
                "Schildt", 1955);

        //book[1].title = "123"; не доступно, но если

        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i].toString());
        }
    
    

    
    }
        
    
}
