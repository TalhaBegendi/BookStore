package models.books;

import utils.Caller;

public class Books extends Caller {

    public Book[] getBooks() {
        return books;
    }

    Book[] books;

    public static class Book
    {
        String isbn;
        String title;
        String author;
        String subTitle;
        String publish_date;
        String publisher;
        int pages;
        String description;
        String website;

        public Book() {}

        public Book(String isbn, String title, String author, String subTitle, String publish_date, String publisher, int pages, String description, String website) {
            this.isbn = isbn;
            this.title = title;
            this.author = author;
            this.subTitle = subTitle;
            this.publish_date = publish_date;
            this.publisher = publisher;
            this.pages = pages;
            this.description = description;
            this.website = website;
        }


        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getSubTitle() {
            return subTitle;
        }

        public void setSubTitle(String subTitle) {
            this.subTitle = subTitle;
        }

        public String getPublish_date() {
            return publish_date;
        }

        public void setPublish_date(String publish_date) {
            this.publish_date = publish_date;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getWebsite() {
            return website;
        }

        public void setWebsite(String website) {
            this.website = website;
        }
    }
}
