package net.swanndolia.jakarta;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import net.swanndolia.jakarta.entity.Person;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "person-servlet", value = "/persons")
public class PersonServlet extends HttpServlet {
    List<Person> persons = new ArrayList<>();

    public void init() {
        persons.add(new Person("Toto", "Tata"));
        persons.add(new Person("Tata", "toto"));
        persons.add(new Person("Tota", "Tato"));
        persons.add(new Person("Tato", "tota"));
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("persons", persons);
        request.getRequestDispatcher("/persons.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Person person = new Person(request.getParameter("firstname"), request.getParameter("lastname"), Integer.parseInt(request.getParameter("age")));
        persons.add(person);
        request.setAttribute("persons", persons);
        request.getRequestDispatcher("/persons.jsp").forward(request, response);
    }

    public void destroy() {
    }
}
