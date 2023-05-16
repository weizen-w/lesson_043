import books.Book;
import books.BookPagesComparator;
import books.BookTitleComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Book> books1 = new ArrayList<>();
    books1.add(new Book("Autor 1", "Title 1", 100));
    books1.add(new Book("Autor 2", "Title 2", 300));
    books1.add(new Book("Autor 1", "Title 2", 100));
    books1.add(new Book("Autor 2", "Title 2", 100));
    books1.add(new Book("Autor 1", "Title 1", 300));
    books1.add(new Book("Autor 2", "Title 1", 100));
    System.out.println("Задача №1");
    System.out.println(books1);
    books1.sort(new BookTitleComparator());
    System.out.println(books1);
    List<Book> books2 = new ArrayList<>();
    books2.add(new Book("Autor 1", "Title 1", 100));
    books2.add(new Book("Autor 2", "Title 2", 300));
    books2.add(new Book("Autor 1", "Title 2", 100));
    books2.add(new Book("Autor 2", "Title 2", 100));
    books2.add(new Book("Autor 1", "Title 1", 300));
    books2.add(new Book("Autor 2", "Title 1", 100));
    System.out.println("\nЗадача №2");
    System.out.println(books2);
    books2.sort(new BookPagesComparator());
    System.out.println(books2);
  }
}
