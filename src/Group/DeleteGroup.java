package Group;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/DeleteGroup")
public class DeleteGroup extends HttpServlet {
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess = request.getSession();
		System.out.println("preparing to group deletion");
		HashMap<Integer, Group> groupMap = (HashMap<Integer, Group>) sess.getAttribute("groupMap");
		Integer delGroupId = Integer.parseInt(request.getParameter("groupId"));
		System.out.println("Group id: " + delGroupId);
		GroupDao.delGroup(groupMap, delGroupId); 
		sess.setAttribute("groupMap", groupMap);
		getServletContext().getRequestDispatcher("/GroupList").forward(request, response);
		
			
		}
	}
