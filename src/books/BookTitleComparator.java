package books;

import java.util.Comparator;

public class BookTitleComparator implements Comparator<Book> {

  @Override
  public int compare(Book o1, Book o2) {
    if (o1.getTitle().toLowerCase().compareTo(o2.getTitle().toLowerCase()) != 0) {
      return o1.getTitle().toLowerCase().compareTo(o2.getTitle().toLowerCase());
    }
    return o1.getAutor().toLowerCase().compareTo(o2.getAutor().toLowerCase());
  }
}
