<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Перечень событий</title>
    <link rel="icon" type="image/png" href="images/favicon.ico"/>
  <!--  <spring:url value="css/cssTable.css" var="mainCss" /> -->
    <!--  <link href="${mainCss}" rel="stylesheet"  type="text/css"/> -->
</head>
<body>
<table class="simple-little-table">
    <tr>
        <td>ID</td>
        <td>Вх.№</td>
        <td>Дата полета</td>
        <td>№ рейса</td>
        <td>Взлет</td>
        <td>Посадка</td>
        <td>Борт</td>
        <td>Event</td>
        <td>КВС</td>
        <td>ВП</td>
        <td>PF</td>
        <td>АЭ</td>
        <td>КД</td>
        <td>Индекс</td>
        <td>Закрыт</td>
    </tr>
    <c:forEach items="${allEvents}" var="events">
        <tr>
            <td><c:out value="${events.id}"/></td>
            <td><c:out value="${events.incomingNumber}"/></td>
            <td><c:out value="${events.dateOfFlight}"/></td>
            <td><c:out value="${events.flightNumber}"/></td>
            <td><c:out value="${events.departure}"/></td>
            <td><c:out value="${events.arrival}"/></td>
            <td><c:out value="${events.aircraftTailNumber}"/></td>
            <td><c:out value="${events.airfaseEvent1}"/></td>
            <td><c:out value="${events.aviaSquadron}"/></td>
            <td><c:out value="${events.basedRisk}"/></td>
            <td><c:out value="${events.correctiveActionDeadline}"/></td>
            <td><c:out value="${events.acceptance}"/></td>
            <td><c:out value="${events.finalRisk}"/></td>
            <td><c:out value="${events.closure}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
