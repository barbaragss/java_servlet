package br.com.java.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/curso")
public class Servlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter(); //objeto que irá trazer caracteres
		out.println("<html>");
		out.println("<body>");
		out.println("Meu primeiro servlet!");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("O servlet foi chamado");
	}
}
