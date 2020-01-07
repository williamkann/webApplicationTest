/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webApp.controller;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import webApp.beans.Calculator;

/**
 *
 * @author willi
 */
public class Controller extends HttpServlet {

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

        if(request.getParameter("action") == null)
            request.getRequestDispatcher("/WEB-INF/helloWorld.jsp").forward(request, response);
        else
        {

            
            
            //Data entered by the user
            Calculator c = new Calculator();
            c.setNumber1(Double.parseDouble(request.getParameter("Number1")));
            c.setNumber2(Double.parseDouble(request.getParameter("Number2")));
            c.setSymbole(request.getParameter("Symbole"));
            
            //if (dba.checkCredentials(userInput))
            if (c.getSymbole().equals("*")) 
            {
               
                
                request.setAttribute("result", c.multiplication(c.getNumber1(), c.getNumber2()));
                request.getRequestDispatcher("/WEB-INF/welcomePage.jsp").forward(request, response);
            }
            else if(c.getSymbole().equals("/"))
            {
                request.setAttribute("result", c.division(c.getNumber1(), c.getNumber2()));
                request.getRequestDispatcher("/WEB-INF/welcomePage.jsp").forward(request, response);
            }
            else if(c.getSymbole().equals("+"))
            {
                request.setAttribute("result", c.addition(c.getNumber1(), c.getNumber2()));
                request.getRequestDispatcher("/WEB-INF/welcomePage.jsp").forward(request, response);
            }
            else if(c.getSymbole().equals("-"))
            {
                request.setAttribute("result", c.substraction(c.getNumber1(), c.getNumber2()));
                request.getRequestDispatcher("/WEB-INF/welcomePage.jsp").forward(request, response);
            }
            else {
                request.setAttribute("errKey", "INVALID FIELDS");
                request.getRequestDispatcher("/WEB-INF/helloWorld.jsp").forward(request, response);
            }
            
        }


        
        
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
