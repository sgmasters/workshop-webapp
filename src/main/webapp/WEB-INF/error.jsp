<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setBundle basename="staticBundle"/>
<table>
    <tr>
        <td>
            <fmt:message key="jsp.error.table.tr.td.smth_wrong"/>
        </td>
    </tr>
    <tr>
        <td>
            <a href=${backUrl}><fmt:message key="jsp.error.table.tr.td.go_back"/></a>
        </td>
    </tr>
</table>