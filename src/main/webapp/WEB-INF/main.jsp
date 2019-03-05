<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="backUrl" value="${pageContext.request.requestURL}"/>
<fmt:setBundle basename="data"/>
<body>
<table valign="top">
    <tr>
        <td valign="top"><c:import url="${page}"/></td>
        <td valign="top" align="right"></td>
    <tr>
        <br/>
    </tr>
</table>
</body>
</html>