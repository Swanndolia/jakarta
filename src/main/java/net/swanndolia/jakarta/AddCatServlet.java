package net.swanndolia.jakarta;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.swanndolia.jakarta.entity.Cat;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "add-cat-servlet", value = "/cat/add")
public class AddCatServlet extends HttpServlet {

    List<Cat> cats = new ArrayList<Cat>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cat cat = new Cat(request.getParameter("name"), request.getParameter("race"), request.getParameter("favoriteFood"), LocalDate.now());
        cats.add(cat);
        request.setAttribute("cats", cats);
        request.getRequestDispatcher("/cats.jsp").forward(request, response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/cats.jsp").forward(request, response);
    }
}
