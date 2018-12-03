/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.polijic.geiproject.controller;

import java.io.IOException;
import java.text.DecimalFormat;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author daserna
 */
public class OperacionServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = null;
        HttpSession session = request.getSession();
        
        String select = request.getParameter("select");
        
        String path = "index.jsp";
        
        // METANO
        double eb = 73;
        double rpta;
        double fcm = 1.8;
        double bo = 2.2;
        double sm = 1;
        double fe;
        
        //NITROSO
        double nIngestion;
        double feN= 2;
        double smN = 1;
        double nRetencion = 0.2;
        double nex;
        switch(select) {
            case "1":
                rpta = eb * (1 / 18.45) * (1-(60.0/100.0)) * (1-(8.0/100.0));
                fe = rpta * 365 * bo * 0.67 * fcm * sm;
                
                double feDecimal = (double)Math.round(fe * 100d) / 100d;
                double rptaDecimal = (double)Math.round(rpta * 100d) / 100d;
                session.setAttribute("txtSV", rptaDecimal);
                session.setAttribute("txtFcm", fcm);
                session.setAttribute("txtBo", bo);
                session.setAttribute("txtSm", sm);
                session.setAttribute("txtFe", feDecimal);
                session.setAttribute("resultado", "");
                path = "metano.jsp";
                break;
            case "2":
                nIngestion = (eb / 18.45) * ((20.0/100.0)/6.25);
                
                nex = nIngestion * (1 -nRetencion);
                
                double nIngestionDecimal = (double)Math.round(nIngestion * 100d) / 100d;
                double nexDecimal = (double)Math.round(nex * 100d) / 100d;
                session.setAttribute("txtIngestion", nIngestionDecimal);
                session.setAttribute("txtFeN", feN);
                session.setAttribute("txtSmN", smN);
                session.setAttribute("txtnRetencion", nRetencion);
                session.setAttribute("txtNex", nexDecimal);
                session.setAttribute("resultado", "");
                path = "nitroso.jsp";
                break;
            default:
                break;
        }
        rd = request.getRequestDispatcher(path);
        rd.forward(request, response);
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
/**
 * Handles the HTTP <code>GET</code> method.
 *
 * @param request servlet request
 * @param response servlet response
 * @throws ServletException if a servlet-specific error occurs
 * @throws IOException if an I/O error occurs
 */
@Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
        public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
