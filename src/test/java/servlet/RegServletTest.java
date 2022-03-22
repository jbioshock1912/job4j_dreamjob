package servlet;


import model.User;
import org.junit.Test;
import org.junit.runner.RunWith;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;


public class RegServletTest {


    @Test
    public void doGet() {

    }

    @Test
    public void doPost() throws IOException, ServletException {
        RegServlet regServlet = new RegServlet();

        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        regServlet.doPost(request, response);
        User user = new User();
        String email = user.getEmail();
    }
}
