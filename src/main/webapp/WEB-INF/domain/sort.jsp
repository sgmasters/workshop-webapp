<%@ page import="by.itacademy.operation.sort.OrderKey" %>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<fmt:setBundle basename="staticBundle"/>
<h3><fmt:message key="jsp.list.table.tr.td.Sort_tasks"/></h3>
<form name="Sort" action="/tasks" method="POST">
    <table>
        <tr>
            <td><fmt:message key="jsp.sort.form.table.tr.td.choose"/>:</td>
        </tr>
        <c:set var="orderKeyValues" value="<%=OrderKey.values()%>"/>
        <c:forEach var="key" items="${orderKeyValues}">
            <tr>
                <td><input type="radio" name="orderKey" value="${key.value}"><fmt:message key="${key.name()}"/></td>
            </tr>
        </c:forEach>
        <tr>
            <td>
                <fmt:message key="jsp.sort.form.table.tr.td.sort" var="sort_button_value"/>
                <input type="submit" value="${sort_button_value}" name="sort.button"/>
            </td>
        </tr>
    </table>
</form>