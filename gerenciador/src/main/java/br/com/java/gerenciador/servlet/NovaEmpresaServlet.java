package br.com.java.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cdatrando nova empresa");
		String nomeEmpresa = request.getParameter("nome"); //o método getParameter sempre retorna uma string
		PrintWriter out = response.getWriter();
		out.println("<html> <body>Empresa " + nomeEmpresa + " cadastrada com sucesso</body> </html>");
		System.out.println("sucesso");
	}

	
}
