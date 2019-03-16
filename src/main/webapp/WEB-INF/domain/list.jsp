<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setBundle basename="staticBundle"/>
<h2><fmt:message key="jsp.list.table.h2.tasks"/></h2>
<table>
    <tr>
        <c:import url="/WEB-INF/domain/sort.jsp"/>
        </br>
    </tr>
    <tr style="text-transform: uppercase">
        <td>
            <b><fmt:message key="jsp.list.table.tr.td.name"/></b>
        </td>
        <td>
            <b><fmt:message key="jsp.list.table.tr.td.runTime"/></b>
        </td>
        <td>
            <b><fmt:message key="jsp.list.table.tr.td.price"/></b>
        </td>
        <td>
            <b><fmt:message key="jsp.list.table.tr.td.complexity"/></b>
        </td>
        <td>
            <b><fmt:message key="jsp.list.table.tr.td.materialCosts"/></b>
        </td>
        <td>
            <b><fmt:message key="jsp.list.table.tr.td.id"/></b>
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