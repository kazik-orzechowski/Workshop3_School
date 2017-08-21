package Group;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/AddGroup")
public class AddGroup extends HttpServlet {
       
   

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/addGroup.jsp").forward(request, response);
		
	

	
//		HashMap<Integer, Group> groupMap = (HashMap<Integer, Group>) sess.getAttribute("groupMap");
//		ArrayList<Group> groupList = new ArrayList<Group>();
//
//		Set<Integer> mySet = groupMap.keySet();
//		for (Integer key : mySet) { // iteracja po elementach hashMapy
//			groupList.add(groupMap.get(key));
//		}
//
//		request.setAttribute("myAttrMap", groupMap);
//		request.setAttribute("myAttribute", groupList);
//
//		getServletContext().getRequestDispatcher("/groupMain.jsp").forward(request, response);
	}

}
