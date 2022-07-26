package models.account;

public class AccountCredentials {
    String userName;
    String password;

    public AccountCredentials(String userName, String password)
    {
        setUserName(userName);
        setPassword(password);
    }

    public AccountCredentials() {}

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
