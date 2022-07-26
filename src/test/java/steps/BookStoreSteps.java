package steps;

import account.Account;
import bookStore.BookStore;
import context.TestStore;
import models.account.AccountCredentials;
import models.account.AccountModel;
import models.books.Books;
import models.books.PostBooksModel;
import okhttp3.Credentials;
import org.junit.Before;
import org.junit.Test;
import utils.StringUtilities;

import java.util.ArrayList;
import java.util.List;

public class BookStoreSteps {

    BookStore bookStore = new BookStore();
    Account account = new Account();

    @Before
    public void authorization()
    {
        StringUtilities strUtils = new StringUtilities();

        AccountCredentials accountCredentials = new AccountCredentials();
        accountCredentials.setUserName(strUtils.generateRandomString("talha",10,true,true));
        accountCredentials.setPassword("Talhagebendi3@");
        String basic = Credentials.basic(accountCredentials.getUserName(),accountCredentials.getPassword());
        TestStore.put("basic",basic);
        TestStore.put("userId",account.addAccount(accountCredentials).getUserID());
        TestStore.put("token",account.generateToken(accountCredentials).getToken());
    }

    @Test
    public void getBooks()
    {
        TestStore.put("books",bookStore.getBooks());
    }

    @Test
    public void postBooks()
    {
        PostBooksModel books = new PostBooksModel();
        books.setUserId(TestStore.get("userId").toString());
        List<PostBooksModel.Isbn> isbns = new ArrayList<>();
        Books savedBooks = bookStore.getBooks();
        isbns.add(new PostBooksModel.Isbn(savedBooks.getBooks()[0].getIsbn()));
        books.setCollectionOfIsbns(isbns);
        bookStore.postBooks(books);

    }
}
