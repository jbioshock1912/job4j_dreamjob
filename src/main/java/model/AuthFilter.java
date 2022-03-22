package model;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //nope
    }

    @Override
    public void doFilter(ServletRequest servletReq, ServletResponse servletResp, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletReq;
        HttpServletResponse resp = (HttpServletResponse) servletResp;
        String url = req.getRequestURI();
        if (url.endsWith("auth.do")) {
            chain.doFilter(servletReq, servletResp);
            return;
        }
        if (req.getSession().getAttribute("user") == null) {
            resp.sendRedirect(req.getContextPath() + "/login");
            return;
        }
        chain.doFilter(servletReq, servletResp);
    }

    @Override
    public void destroy() {
        //nope
    }
}
