package sample.model;

/**
 * Created by Tahini Thai on 4/22/2017.
 */
public class User {
    private String username;
    private String password;

    public User(String username, String passwword) {
        this.username = username;
        this.password = passwword;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}