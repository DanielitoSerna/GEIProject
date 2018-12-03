<%-- 
    Document   : index
    Created on : 18/10/2017, 06:13:08 PM
    Author     : sala312
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>GEI - Predicci&oacute;n y Simulaci&oac&oacute;n</title>

        <link href="${pageContext.servletContext.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    </head>

    <h4>Emisiones de CH4 Y N2O</h4>
    <form name="formulario" method="post" action="${pageContext.servletContext.contextPath}/OperacionServlet">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <select class="form-control" id="sel1" name="select" onchange="this.form.submit()">
                        <option value=""></option>
                        <option value="1">Calcular CH4</option>
                        <option value="2">Calcular N2O</option>
                    </select>
                </div>
            </div>
            <br>
            
            <div>
                <img src="${pageContext.servletContext.contextPath}/images/vaca2.jpg" class="pull-left img-responsive">
                <img src="${pageContext.servletContext.contextPath}/images/vaca.jpg" class="pull-right img-responsive">
            </div>
        </div>
    </form>

</html>