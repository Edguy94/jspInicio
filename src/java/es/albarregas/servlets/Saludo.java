/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.albarregas.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kikeli
 */
public class Saludo extends HttpServlet{

    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link href='css/estilos.css' rel='stylesheet' type='text/css'/>");
            out.println("<title>Servlet SaludoAnotacion</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> hola mundo</h1>");
           out.write("<em><a href='/20160927_Inicial/index.html'>volver</a></em>");
            out.println("</body>");
            out.println("</html>");
    }
        //Hey guys, i'm back coding :D
    
    
}
