package bookStore;

import models.books.Books;
import models.books.PostBooksModel;
import retrofit2.Call;
import retrofit2.http.*;

public interface BookStoreServices {

    String BASE_URL = BookStoreApi.BASE_URL;

    @POST(BASE_URL + BookStoreApi.BOOK_SUFFIX)
    Call<PostBooksModel.Isbn> postBooks(@Body PostBooksModel postBooksModel);

    @PUT(BASE_URL + BookStoreApi.BOOK_SUFFIX )
    Call<Books> putBook(@Body Books book);

    @GET(BASE_URL + BookStoreApi.BOOK_SUFFIX)
    Call<Books> getBooks();

}
