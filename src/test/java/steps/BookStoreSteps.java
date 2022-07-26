package steps;

import account.Account;
import bookStore.BookStore;
import context.TestStore;
import models.account.AccountCredentials;
import models.books.Books;
import org.junit.Before;
import org.junit.Test;
import utils.StringUtilities;

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
        account.addAccount(accountCredentials);
        TestStore.put("token",account.generateToken(accountCredentials).getToken());
    }

    @Test
    public void getBook()
    {
        Books books = new Books();
        bookStore.getBook(books);
    }

    @Test
    public void bookUpdate()
    {
        bookStore.updateBook();
    }
}
