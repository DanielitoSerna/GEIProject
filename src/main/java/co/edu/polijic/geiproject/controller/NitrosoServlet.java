/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.polijic.geiproject.controller;

import co.edu.polijic.geiproject.dao.impl.OxidoNitrosoDAOImpl;
import co.edu.polijic.geiproject.entities.OxidoNitroso;
import java.io.IOException;
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
public class NitrosoServlet extends HttpServlet {

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
        
        String boton = request.getParameter("btnaccion");
        String path = "nitroso.jsp";
        Double rpta;
        OxidoNitrosoDAOImpl oxidoNitrosoDAOImpl = new OxidoNitrosoDAOImpl();
        OxidoNitroso oxidoNitroso = new OxidoNitroso();
        
        switch(boton) {
            case "nitroso":
                String poblacion = request.getParameter("txtPoblacion");
                Double pob = Double.parseDouble(poblacion);
                String nex = request.getParameter("txtNex");
                Double nexDoubl = Double.parseDouble(nex);
                String sm = request.getParameter("txtSmN");
                Double smDouble = Double.parseDouble(sm);
                String fme = request.getParameter("txtFeN");
                Double fmeDouble = Double.parseDouble(fme);
                rpta = pob * nexDoubl * smDouble * fmeDouble;
                session.setAttribute("resultadoN", rpta);
                oxidoNitroso.setPoblación(pob);
                oxidoNitroso.setResultado(rpta);
                oxidoNitrosoDAOImpl.guardar(oxidoNitroso);
                break;
            case "index":
                path = "index.jsp";
                break;
            case "historial":
                session.setAttribute("listado", oxidoNitrosoDAOImpl.listar());
                path = "nitrosoHistorial.jsp";
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
