import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

    public List<Book> getBooksBySort(){
        List<Book> books= new BookDao().getBooks();
        Collections.sort(books,(b1,b2)->b1.getName().compareTo(b2.getName()));
        return books;
    }

    public static void main(String[] args) {
        System.out.println( new BookService().getBooksBySort());
    }

    /*class myComparator implements Comparator<Book>{

        @Override
        public int compare(Book o1, Book o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }*/
}
