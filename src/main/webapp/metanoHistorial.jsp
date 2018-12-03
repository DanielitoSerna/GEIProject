<%-- 
    Document   : metanoHistorial
    Created on : 24-nov-2018, 23:57:59
    Author     : daserna
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>GEI - Predicci&oacute;n y Simulaci&oac&oacute;n</title>

        <link href="${pageContext.servletContext.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <h4>Historial de emisiones de CH4</h4>
    <form name="formulario" method="post" action="${pageContext.servletContext.contextPath}/OperacionServlet">
        <div class="row marketing">
            <div class="col-lg-6">
                <c:choose>
                    <c:when test="${! empty sessionScope.listado}">
                        <table class="table table-condensed">
                            <thead>
                                <tr>
                                    <th scope="col">Poblac&oacute;n total</th>
                                    <th scope="col">Resultado</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${sessionScope.listado}" var="listado">
                                    <tr>
                                        <td><c:out value="${listado.getPoblacion()}"/></td>
                                        <td><c:out value="${listado.getResultado()}"/></td>
                                    </tr>
                                </c:forEach>

                            </tbody>
                        </table>
                    </c:when>
                    <c:otherwise>
                        SIN DATOS
                    </c:otherwise>
                </c:choose>
            </div>
            <button name="select" value="1" type="submit" 
                        id="btnaccion"
                        class="btn btn-primary btn-md">
                    Regresar</button>
        </div>
    </form>
</html>
