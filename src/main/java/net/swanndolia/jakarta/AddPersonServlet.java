package net.swanndolia.jakarta;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.swanndolia.jakarta.entity.Person;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "add-person-servlet", value = "/person/add")
public class AddPersonServlet extends HttpServlet {

    List<Person> persons = new ArrayList<Person>();

    public void init() throws ServletException {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Person person = new Person(request.getParameter("firstname"), request.getParameter("lastname"), Integer.parseInt(request.getParameter("age")));
        persons.add(person);
        request.setAttribute("persons", persons);
        request.getRequestDispatcher("/persons.jsp").forward(request, response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("persons", persons);
        request.getRequestDispatcher("/persons.jsp").forward(request, response);
    }
}
