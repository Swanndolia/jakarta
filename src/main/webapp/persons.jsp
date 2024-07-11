<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="persons" scope="request" type="java.util.ArrayList<net.swanndolia.jakarta.entity.Person>"/>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Persons</title>
    <%@include file="WEB-INF/import/bootstrap.html" %>
</head>
<body>
<%@include file="WEB-INF/header.html" %>
<main>
    <section>
        <table class="table-bordered bg-dark">
            <c:forEach items="${persons}" var="person">
                <tr class="text-white">
                    <td>${person.firstname}</td>
                    <td>${person.lastname}</td>
                    <td>${person.age}</td>
                </tr>
            </c:forEach>
        </table>
    </section>
    <section>
        <form action="add" method="post">
            <label class="form-label">Firstname:
                <input type="text" name="firstname">
            </label>
            <label class="form-label">LastName:
                <input type="text" name="lastname">
            </label>
            <label class="form-label">Age:
                <input type="number" name="age">
            </label>
            <button>Submit</button>
        </form>
    </section>
</main>
<%@include file="WEB-INF/footer.html" %>
</body>
</html>
