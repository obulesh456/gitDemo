import java.util.ArrayList;
import java.util.List;

public class BookDao {

    public List<Book> getBooks(){
        List<Book> books=new ArrayList<>();
        books.add(new Book(1,"core java",200));
        books.add(new Book(2,"Advanced java",200));
        books.add(new Book(3,"web java",200));
        books.add(new Book(4,"hibernate java",200));
        return books;
    }
}
