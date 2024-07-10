package net.swanndolia.jakarta;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "jspServlet", value = "/jsp")
public class jspServlet extends HttpServlet {

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        getServletContext().getRequestDispatcher("/jsp.jsp").forward(request,response);
    }

    public void destroy() {
    }
}