package books;

import java.util.Comparator;

public class BookPagesComparator implements Comparator<Book> {

  @Override
  public int compare(Book o1, Book o2) {
    if (o1.getPages() != o2.getPages()) {
      return -(o1.getPages() - o2.getPages());
    }
    return o1.getTitle().toLowerCase().compareTo(o2.getTitle().toLowerCase());
  }
}
