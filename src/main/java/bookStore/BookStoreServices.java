package bookStore;

import models.books.Books;
import retrofit2.Call;
import retrofit2.http.*;

public interface BookStoreServices {

    String BASE_URL = BookStoreApi.BASE_URL;

    @POST(BASE_URL + BookStoreApi.BOOK_SUFFIX)
    Call<Books> postBook(@Body Books book);

    @PUT(BASE_URL + BookStoreApi.BOOK_SUFFIX )
    Call<Books> putBook(@Body Books book);

    @GET(BASE_URL + BookStoreApi.BOOK_SUFFIX)
    Call<Books> getBook();

}
