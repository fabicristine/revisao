package ucdb.br.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ucdb.br.util.Calculadora;

@WebServlet(urlPatterns= "/calcServlet")
public class CalculadoraServlet extends HttpServlet{
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		String n1= req.getParameter("n1");
		String n2= req.getParameter("n2");
		String op= req.getParameter("op");
	
		int num1= Integer.parseInt(n1);
		int num2= Integer.parseInt(n2);
		int operacao= Integer.parseInt(op);
		
		Calculadora calc= new Calculadora();
		
		
		int res= calc.calcular(num1,num2,operacao);
		
		PrintWriter pw= resp.getWriter();
		pw.print("O resultado é: "+res);
		
		//PrintWriter pw= resp.getWriter();
		//pw.print("Você digitou n1: "+n1 + " n2: "+n2);
		
	}
	
}
