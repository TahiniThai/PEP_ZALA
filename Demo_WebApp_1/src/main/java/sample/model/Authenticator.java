package sample.model;

/**
 * Created by Tahini Thai on 4/22/2017.
 */
public class Authenticator {
    public String authenticator(String username, String password) {
        if ("admin".equalsIgnoreCase(username) && "admin".equalsIgnoreCase(password))
            return "success";
        return "failure";
    }
}
