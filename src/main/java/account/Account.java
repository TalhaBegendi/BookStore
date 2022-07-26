package account;

import models.account.AccountCredentials;
import models.account.AccountModel;
import models.account.GenerateTokenModel;
import retrofit2.Call;
import utils.Caller;
import utils.Printer;
import utils.ServiceGenerator;

public class Account extends Caller {

    AccountServices services = new ServiceGenerator().generate(AccountServices.class);
    Printer log = new Printer(Account.class);

    public AccountModel addAccount (AccountCredentials accountCredentials)
    {
        Call<AccountModel> createAccount = services.createAccount(accountCredentials);
        return perform(createAccount, true, true, "createAccount -> AccountServices");
    }

    public GenerateTokenModel generateToken (AccountCredentials accountCredentials)
    {
        Call<GenerateTokenModel> createGenerateToken = services.generateToken(accountCredentials);
        return perform(createGenerateToken, true, true, "createGenerateToken -> AccountServices");
    }

    public void getUser(String uuid, String token){
        Call<Object> getUser = services.getAccount(uuid, token);
        perform(getUser, true, true, "getUser");
    }
}
