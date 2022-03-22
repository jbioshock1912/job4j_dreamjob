package servlet;

import model.User;
import store.PsqlStore;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("auth/reg.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        User user = PsqlStore.instOf().findUserByMailPass(email, password);
        if (user != null) {
            resp.sendRedirect(req.getContextPath() + "/login");
        } else {
            PsqlStore.instOf().saveUser(new User(req.getParameter("email"), req.getParameter("password")));
            //resp.sendRedirect(req.getContextPath() + "/reg");
            //req.getRequestDispatcher("auth/reg.jsp").forward(req, resp);
            resp.sendRedirect(req.getContextPath() + "/login");
        }
    }
}