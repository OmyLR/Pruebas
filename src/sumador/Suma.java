package sumador;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Suma
 */
//@WebServlet("/servlets/suma")
public class Suma extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Suma() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Estoy en sumador");
		getServletContext().getRequestDispatcher("/servlets/util").forward(request, response);
		// TODO Auto-generated method stub
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		int resultado = 0;
		try {
			resultado = Integer.parseInt(a)+Integer.parseInt(b);
			PrintWriter pr = response.getWriter();
			pr.append("Served at: ").append("La suma de los valores "+a+" y "+b+" es: "+resultado);
		}catch(NumberFormatException e) {
			PrintWriter out = response.getWriter();
			out.print("Uno de los valores introducidos no es un número");
			System.out.println(e);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		//System.out.println("Parámetros Contexto desde Suma: "+getServletContext().getInitParameter("Pais"));
		//System.out.println("Se ha iniciado el servlet correctamente");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		//System.out.println(config.getInitParameter("name"));
	}
	
	
	

}
