package servlet;

import model.Candidate;
import store.PsqlStore;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CandidateDeleteServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        var id = Integer.parseInt(request.getParameter("id"));
        Candidate candidate = new Candidate();
        candidate.setId(id);
        PsqlStore.instOf().deleteCandidate(candidate);
        response.sendRedirect(request.getContextPath() + "/candidates.do");
    }
}
