/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/traducao")
public class TraducaoController extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String palavra = request.getParameter("palavra").toLowerCase();
        
        if(palavra == null) {
            request.getRequestDispatcher("falha.jsp").forward(request, response);
            return;
        }
        
        Tradutor tradutor = new Tradutor();
        String caminhoArquivo = getServletContext().getRealPath("/") + "palavras.json";
        tradutor.lerArquivoJson(caminhoArquivo);
        
        String traducao = tradutor.traduzir(palavra);
        
        if(traducao.equals("Tradução não encontrada")) {
            request.getRequestDispatcher("falha.jsp").forward(request, response);
            return;
        }
        
        request.setAttribute("traducao", traducao);
        request.getRequestDispatcher("resposta.jsp").forward(request, response);
    }
}
