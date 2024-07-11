<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="cats" scope="request" type="java.util.ArrayList<net.swanndolia.jakarta.entity.Cat>"/>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Cats</title>
    <%@include file="WEB-INF/import/bootstrap.html" %>
</head>
<body>
<%@include file="WEB-INF/header.html" %>
<main>
    <section>
     <c:if test="${cats.size() != 0}">
        <table class="table-bordered bg-dark">
            <c:forEach items="${cats}" var="cat">
                <tr class="text-white">
                    <td>${cat.name}</td>
                    <td>${cat.race}</td>
                    <td>${cat.favoriteFood}</td>
                    <td>${cat.birthDate}</td>
                </tr>
            </c:forEach>
            </c:if>
            <c:if test="${cats.size() == 0}">
                <p>vous n'avez aucun chat dans votre liste</p>
            </c:if>
        </table>
    </section>
    <section>
        <form action="add" method="post">
            <label class="form-label">Name:
                <input type="text" name="name">
            </label>
            <label class="form-label">race:
                <input type="text" name="race">
            </label>
            <label class="form-label">Favorite Food:
                <input type="text" name="favoriteFood">
            </label>
            <label class="form-label">Birthdate:
                <input type="datetime-local" name="birthdate">
            </label>
            <button>Submit</button>
        </form>
    </section>
</main>
<%@include file="WEB-INF/footer.html" %>
</body>
</html>
