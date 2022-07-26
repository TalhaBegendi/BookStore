package bookStore;

import models.books.Books;
import org.junit.Assert;
import retrofit2.Call;
import utils.Caller;
import utils.Printer;
import utils.ServiceGenerator;

public class BookStore extends Caller {

    BookStoreServices services = new ServiceGenerator().generate(BookStoreServices.class);
    Printer log = new Printer(BookStore.class);

    public void getBook(Books book) {

        Call<Books> getBook = services.getBook();
        Books responseModel = perform(getBook, false, true, "getBook -> BookStoreServices");

        Assert.assertNotNull(responseModel.getBooks()[0].getTitle());

        log.new Important(responseModel.getBooks()[0].getTitle());

    }

    public void updateBook() {

    }
}
