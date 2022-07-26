package account;

import bookStore.BookStoreApi;
import models.account.AccountCredentials;
import models.account.AccountModel;
import models.account.GenerateTokenModel;
import models.books.Books;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface AccountServices {

    String BASE_URL = AccountApi.BASE_URL;

    @POST(BASE_URL + AccountApi.USER_SUFFIX)
    Call<AccountModel> createAccount(@Body AccountCredentials account);

    @POST(BASE_URL + AccountApi.GENERATE_TOKEN_SUFFIX)
    Call<GenerateTokenModel> generateToken(@Body AccountCredentials account);

    @GET(BASE_URL + BookStoreApi.BOOK_SUFFIX)
    Call<Books> getBooks();

}
