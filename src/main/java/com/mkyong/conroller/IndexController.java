package com.mkyong.conroller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mkyong.client.JerseyClientGet;
import com.mkyong.client.JerseyClientPost;
import com.sun.jersey.spi.dispatch.RequestDispatcher;

/**
 * Servlet implementation class IndexController
 */
public class IndexController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Get");
		JerseyClientGet jclient=new JerseyClientGet();
		request.setAttribute("Output", jclient.getWebService(null));
		
		javax.servlet.RequestDispatcher requestDispatcher =
			    request.getRequestDispatcher("/output.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Post");
		JerseyClientPost jPost = new JerseyClientPost();
		request.setAttribute("Output", jPost.postWebService(null));
		javax.servlet.RequestDispatcher requestDispatcher =
			    request.getRequestDispatcher("/output.jsp");
		requestDispatcher.forward(request, response);
	}

}
