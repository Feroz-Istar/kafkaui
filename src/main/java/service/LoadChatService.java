package service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoadChatService
 */
public class LoadChatService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoadChatService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String current_user_id = request.getParameter("current_user_id");
		String reciever_user_id = request.getParameter("reciever_user_id");
		System.out.println(current_user_id+" - "+reciever_user_id);
		StringBuffer sb = new StringBuffer();
		sb.append(getChatLeft());
		sb.append(getChatRight());
		response.getWriter().println(sb.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	
	public String getChatLeft() {
		String leftdiv="<div class='chat-left w-100 ml-2 mr-2'> <div class='chat-bg-left m-2 p-2'> <div class='d-flex'> <div class='dot_green align-self-center mr-1 mt-1'></div> <div>online 10.20 am today</div> </div> <div class='card card-inverse card-warning mb-3 text-center ml-2 mr-2'> <div class='card-block'> <blockquote class='card-blockquote'> <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p> <footer> Someone famous in <cite title='Source Title'>Source Title</cite> </footer> </blockquote> </div> </div> </div> </div>";
		return leftdiv;
		
	}
	
	public String getChatRight() {
		String rightdiv="<div class='chat-right w-100 ml-2 mr-2'> <div class='chat-bg-right m-2 p-2'> <div class='d-flex flex-row-reverse'> <div class='align-items-end flex-column'>online 10.20 am today</div> <div class='dot_green align-self-center mr-1 mt-1 '></div> </div> <div class='card card-inverse card-primary mb-3 text-center ml-2 mr-2'> <div class='card-block'> <blockquote class='card-blockquote'> <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p> <footer> Someone famous in <cite title='Source Title'>Source Title</cite> </footer> </blockquote> </div> </div> </div>";
		return rightdiv;
		
	}
}
