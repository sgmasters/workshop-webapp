<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<h2>Tasks</h2>
<table>
    <tr style="text-transform: uppercase">
        <td>
            <b><fmt:message key="name"/></b>
        </td>
        <td>
            <b><fmt:message key="runTime"/></b>
        </td>
        <td>
            <b><fmt:message key="price"/></b>
        </td>
        <td>
            <b><fmt:message key="complexity"/></b>
        </td>
        <td>
            <b><fmt:message key="materialCosts"/></b>
        </td>
        <td>
            <b><fmt:message key="id"/></b>
        </td>
    </tr>
    <c:forEach var="task" items="${tasks}">
        <tr>
            <td>
                    ${task.name}
            </td>
            <td>
                    ${task.runTime}
            </td>
            <td>
                    ${task.price}
            </td>
            <td>
                    ${task.complexity}
            </td>
            <td>
                    ${task.materialCosts}
            </td>
            <td>
                    ${task.id}
            </td>
        </tr>
    </c:forEach>
</table>