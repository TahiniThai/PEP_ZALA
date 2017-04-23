package sample.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import sample.model.*;

/**
 * Created by Tahini Thai on 4/22/2017.
 */
@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    private String errorPage = "error.jsp";
    private String successPage = "success.jsp";
    private String usernameParameter = "txtUsername";
    private String passwordParameter = "txtPassword";

    public LoginServlet() {
        super();

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter(usernameParameter);
        String password = request.getParameter(passwordParameter);
        RequestDispatcher rd = null;
        Authenticator au = new Authenticator();
        String result = au.authenticator(username, password);
        if ("success".equals(result)) {
            rd = request.getRequestDispatcher(successPage);
            User user = new User(username, password);
            request.setAttribute("user", username);
        } else {
            rd = request.getRequestDispatcher(errorPage);
        }
        rd.forward(request, response);
    }
}
