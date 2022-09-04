package controller;

import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAO;
import model.JavaBeans;

@WebServlet(urlPatterns = { "/Controller", "/main", "/insert"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();
	JavaBeans contato = new JavaBeans();

	public Controller() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * response.getWriter().append("Served at: ").append(request.getContextPath());
		 */
		String action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/main")) {
			contatos(request, response);
		} else if (action.equals("/insert")) {
			novoContato(request, response);
		} else {
			response.sendRedirect("index.html");
		}
	
	}
	// listar usuarios
	protected void contatos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("sistema.jsp");
		// Criando um objeto que irá recaber os dados javaBeans
		// ArrayList<JavaBeans> lista = dao.listarContatos();

	}

	// novo usuario
	protected void novoContato(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// teste 
		//System.out.println(request.getParameter("nome"));
		//System.out.println(request.getParameter("ra"));
		//System.out.println(request.getParameter("email"));
	

		// javaBeans setar as variáveis JabaBenas
		contato.setNome(request.getParameter("nome"));
		contato.setRa(request.getParameter("ra"));
		contato.setEmail(request.getParameter("email"));
		// invorcar o método inserirContato passando o objeto contato
		dao.inserirContato(contato);
		// redirecionar para o docummento agenda.jsp
		response.sendRedirect("main");
	}

}
