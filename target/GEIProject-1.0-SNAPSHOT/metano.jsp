<%-- 
    Document   : metano
    Created on : 20-nov-2018, 23:18:56
    Author     : daserna
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>GEI - Predicci&oacute;n y Simulaci&oac&oacute;n</title>

        <link href="${pageContext.servletContext.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <h4>Emisiones de CH4</h4>
    <form name="formulario" method="post" action="${pageContext.servletContext.contextPath}/MetanoServlet">
        <div class="row" id="ch4">
            <div class="col-md-4">
                <div class="panel panel-info">
                    <div class="panel-heading">
                        <h4 class="panel-title">Datos a ingresar</h4>
                    </div>
                    <div class="panel-body">
                        <label class="col-2 col-form-label">Poblaci&oacute;n</label>
                        <input name="txtPoblacion" class="form-control" type="number" value="${sessionScope.txtPoblacion}">
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="panel panel-warning">
                    <div class="panel-heading">
                        <h3 class="panel-title">Par&aacute;metros del modelo</h3>
                    </div>
                    <div class="panel-body">
                        <label>Capacidad m&aacute;xima de producci&oacute;n de CH4: m3/kg</label>
                        <input class="form-control" type="text" value="${sessionScope.txtBo}" disabled="true"> 
                    </div>
                    <div class="panel-body">
                        <label>Factores de conversi&oacute;n del CH4: %</label>
                        <input class="form-control" type="text" value="${sessionScope.txtFcm}" disabled="true">
                    </div>
                    <div class="panel-body">
                        <label>Fracci&oacute;n del esti&eacute;rcol: %</label>
                        <input class="form-control" type="text" value="${sessionScope.txtSm}" disabled="true">
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="panel panel-warning">
                    <div class="panel-heading">
                        <h3 class="panel-title">C&aacute;lculos</h3>
                    </div>
                    <div class="panel-body">
                        <label class="form-label">Factor de emisi&oacute;n: Kg</label>
                        <input name="txtFe" class="form-control" type="text" value="${sessionScope.txtFe}" readonly="true"> 
                    </div>
                    <div class="panel-body">
                        <label class="form-label">Excreci&oacute;n de s&oacute;lidos vol&aacute;tiles: kg-dm/día</label>
                        <input class="form-control" type="text" value="${sessionScope.txtSV}" disabled="true"> 
                    </div>
                </div>
            </div>
            <div class="col-md-12">
                <div class="panel panel-success">
                    <div class="panel-heading">
                        <h3 class="panel-title">Emisiones de CH4</h3>
                    </div>
                    <div class="panel-body"> <label>${sessionScope.resultado}</label> Gg/año</div>
                </div>
            </div>
            <div class="col-md-10">
                <button name="btnaccion" value="metano" type="submit" 
                        id="btnaccion"
                        class="btn btn-primary btn-md">
                    Calcular</button>
                <button name="btnaccion" value="index" type="submit" 
                        id="btnaccion"
                        class="btn btn-primary btn-md">
                    Regresar</button>
                <button name="btnaccion" value="historial" type="submit" 
                        id="btnaccion"
                        class="btn btn-primary btn-md">
                    Historial</button>
            </div>
        </div>
    </form>
</html>
