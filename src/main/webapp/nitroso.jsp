<%-- 
    Document   : nitroso
    Created on : 20-nov-2018, 23:19:06
    Author     : daserna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>GEI - Predicci&oacute;n y Simulaci&oac&oacute;n</title>

        <link href="${pageContext.servletContext.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <h4>Emisiones de N2O</h4>
    <form name="formulario" method="post" action="${pageContext.servletContext.contextPath}/NitrosoServlet">
        <div class="row" id="n2o">
            <div class="col-md-4">
                <div class="panel panel-info">
                    <div class="panel-heading">
                        <h4 class="panel-title">Datos a ingresar</h4>
                    </div>
                    <div class="panel-body">
                        <label class="col-2 col-form-label">N&uacute;mero de cabezas</label>
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
                        <label>Fracci&oacute;n de la excreci&oacute;n total anual: %</label>
                        <input name="txtSmN" class="form-control" type="text" value="${sessionScope.txtSmN}" readonly="true"> 
                    </div>
                    <div class="panel-body">
                        <label>Factor de emisi&oacute;n de N2O: Kg</label>
                        <input name="txtFeN" class="form-control" type="text" value="${sessionScope.txtFeN}" readonly="true">
                    </div>
                    <div class="panel-body">
                        <label>Fracción de la ingestión anual de N: Kg</label>
                        <input class="form-control" type="text" value="${sessionScope.txtnRetencion}" readonly="true">
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="panel panel-warning">
                    <div class="panel-heading">
                        <h3 class="panel-title">C&aacute;lculos</h3>
                    </div>
                    <div class="panel-body">
                        <label class="form-label">Excreci&oacute;n anual media de N: Kg</label>
                        <input name="txtNex" class="form-control" type="text" value="${sessionScope.txtNex}" readonly="true"> 
                    </div>
                    <div class="panel-body">
                        <label class="form-label">Ingesti&oacute;n anual de N: Kg</label>
                        <input class="form-control" type="text" value="${sessionScope.txtIngestion}" readonly="true"> 
                    </div>
                </div>
            </div>
            <div class="col-md-12">
                <div class="panel panel-success">
                    <div class="panel-heading">
                        <h3 class="panel-title">Emisiones de N2O</h3>
                    </div>
                    <div class="panel-body"> <label>${sessionScope.resultadoN}</label> Kg de N2O/año</div>
                </div>
            </div>
            <div class="col-md-12">
                <button name="btnaccion" value="nitroso" type="submit" 
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
