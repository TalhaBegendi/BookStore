package bookStore;

import context.TestStore;
import models.books.Books;
import models.books.PostBooksModel;
import okhttp3.Headers;
import org.junit.Assert;
import retrofit2.Call;
import utils.Caller;
import utils.Printer;
import utils.ServiceGenerator;

public class BookStore extends Caller {

    BookStoreServices services = new ServiceGenerator(
            new Headers.Builder()
                    .add("Authorization", TestStore.get("basic").toString())
                    .build())
            .generate(BookStoreServices.class);
    Printer log = new Printer(BookStore.class);

    public Books getBooks() {

        Call<Books> getBook = services.getBooks();
        Books responseModel = perform(getBook, false, true, "getBook -> BookStoreServices");

        Assert.assertNotNull(responseModel.getBooks()[0].getTitle());

        log.new Important(responseModel.getBooks()[0].getTitle());
        return responseModel;
    }

    public PostBooksModel.Isbn postBooks(PostBooksModel books) {
        Call<PostBooksModel.Isbn> postBooks = services.postBooks(books);
        return perform(postBooks, false, true, "postBooks -> BookStoreServices");
    }
}
