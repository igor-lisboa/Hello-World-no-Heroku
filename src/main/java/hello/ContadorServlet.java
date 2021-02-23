/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author @igor-lisboa
 */
@WebServlet("/contador")
public class ContadorServlet extends HttpServlet {
    /**
     *
     */
    private static final long serialVersionUID = 7162058227116065776L;

    private int contador = 0; // variavel de instância

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        contador++; // a cada requisição a mesma variável é incrementada

        // recebe o writer
        PrintWriter out = response.getWriter();

        // escreve o texto
        out.println("<html>");
        out.println("<body>");
        out.println("Contador agora é: " + contador);
        out.println("</body>");
        out.println("</html>");
    }
}