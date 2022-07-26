package models.account;

import models.books.Books;

public class AccountModel {
    String userID;
    String username;
    Books.Book[] books;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Object[] getBooks() {
        return books;
    }

    public void setBooks(Books.Book[] books) {
        this.books = books;
    }

}
