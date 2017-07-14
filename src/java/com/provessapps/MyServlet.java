package com.provessapps;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class MyServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String n1=request.getParameter("number1");
            String n2=request.getParameter("number2");
            String op=request.getParameter("operation");
            if(n1!=null && n2!=null){
                int i1=Integer.parseInt(n1);
                int i2=Integer.parseInt(n2);
                out.println("Hello");
                if(op.equals("ADD"))
                        out.print("The result is: "+(i1+i2));
                if(op.equals("SUB"))
                        out.print("The result is: "+(i1-i2));
                if(op.equals("MUL"))
                        out.print("The result is: "+(i1*i2));
                if(op.equals("DIV"))
                        out.print("The result is: "+(i1/i2));
                if(op.equals("MOD"))
                        out.print("The result is: "+(i1%i2));
            }
            else{
                out.print("Enter both the numbers!");
            }
        } finally {
            out.close();
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
