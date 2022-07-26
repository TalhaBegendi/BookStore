package models.account;

public class AccountModel {
    String userID;
    String username;
    Object[] books;


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

    public void setBooks(Object[] books) {
        this.books = books;
    }
}
