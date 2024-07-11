package net.swanndolia.jakarta;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import net.swanndolia.jakarta.entity.Cat;

@WebServlet(name = "cat-servlet", value = "/cats")
public class CatServlet extends HttpServlet {
    List<Cat> cats = new ArrayList<>();

    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("cats", cats);
        request.getRequestDispatcher("/cats.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cat cat = new Cat(request.getParameter("name"), request.getParameter("race"), request.getParameter("favoriteFood"), LocalDate.now());
        cats.add(cat);
        request.setAttribute("cats", cats);
        request.getRequestDispatcher("/cats.jsp").forward(request, response);
    }

    public void destroy() {
    }
}
