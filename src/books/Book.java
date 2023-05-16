package books;

public class Book {

  private final String autor;
  private final String title;
  private final int pages;

  public Book(String autor, String title, int pages) {
    this.autor = autor;
    this.title = title;
    this.pages = pages;
  }

  public String getAutor() {
    return autor;
  }

  public String getTitle() {
    return title;
  }

  public int getPages() {
    return pages;
  }

  @Override
  public String toString() {
    return String.format("%s - \"%s\" (%d pages)", autor, title, pages);
  }
}
