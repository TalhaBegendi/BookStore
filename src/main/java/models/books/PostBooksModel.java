package models.books;

import java.util.List;

public class PostBooksModel {

    String userId;
    List<Isbn> collectionOfIsbns;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Isbn> getCollectionOfIsbns() {
        return collectionOfIsbns;
    }

    public void setCollectionOfIsbns(List<Isbn> collectionOfIsbns) {
        this.collectionOfIsbns = collectionOfIsbns;
    }

    public static class Isbn
  {
      String isbn;

      public Isbn()
      {}

      public Isbn(String isbn)
      {
          setIsbn(isbn);
      }

      public String getIsbn() {
          return isbn;
      }

      public void setIsbn(String isbn) {
          this.isbn = isbn;
      }
  }

}
