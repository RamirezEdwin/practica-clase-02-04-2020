package com.sack.controladordedatos;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sack.model.Producto;

/**
 * Servlet implementation class servletControler
 */
public class servletControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
			
		
		
		String acction = request.getParameter("btn");
		
		EntityManager em;
	    
	    EntityManagerFactory emf;
	    
	    emf = Persistence.createEntityManagerFactory("HIBERNATE-4");
	    
	    em = emf.createEntityManager();
	    
	    Producto pr = new Producto();
		
		try {
			
			
			String id = request.getParameter("Id");
			String nombrepr = request.getParameter("Nproducto");
			String preciopr = request.getParameter("Pproducto");
			String cantidadpr = request.getParameter("Cproducto");
			String totalpr = request.getParameter("Tproducto");
			
			
		    pr.setId(Integer.parseInt(id));
		    pr.setNombreProductos(nombrepr);
		    pr.setPrecioProducto(Double.parseDouble(preciopr));
		    pr.setCantidadProducto(Integer.parseInt(cantidadpr));
		    pr.setTotalProducto(Double.parseDouble(totalpr));
		    
		    
		    
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	    
		if(acction.equals("AGREGAR"))
		{
			
			
		    
		    em.getTransaction().begin();
		    
		    em.persist(pr);
		    
		    em.flush();
		    em.getTransaction().commit();
		    
		  
			

		}else if(acction.equals("MODIFICAR"))
		{
			
			//pr.getid();
			em.getTransaction().begin();
			em.merge(pr);
			em.flush();
			em.getTransaction().commit();
			
			
			
			
		}else if(acction.equals("ELIMINAR"))
		{
			
			pr = em.getReference(Producto.class, pr.getId());
			//pr.getId();
			em.getTransaction().begin();
			em.remove(pr);
			em.flush();
			em.getTransaction().commit();
			
			
			
		}
			
		  response.sendRedirect("index.jsp");
		
	}

}
