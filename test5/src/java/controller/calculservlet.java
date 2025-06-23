/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.calculatrice;

/**
 *
 * @author FLASH2030
 */
@WebServlet(name = "calculservlet", urlPatterns = {"/calculservlet"})
public class calculservlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       int a=Integer.parseInt(request.getParameter("a"));
              int b=Integer.parseInt(request.getParameter("b"));
              calculatrice calculatrice= new calculatrice();
              int resultat=calculatrice.additionner(a,b);
              response.setContentType("text html");
              PrintWriter out=response.getWriter();
              out.println("<h1>resultat de laddition:"+resultat+"<h1>");
              
    }}