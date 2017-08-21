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

@WebServlet("/GroupAction")
public class GroupAction extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession sess = request.getSession();

		GroupDao.initializeGroupMap(request);
		
		getServletContext().getRequestDispatcher("/GroupList").forward(request, response);

		
		
//		if (request.getParameter("action") != null && request.getParameter("action").equals("add")) {
//			System.out.println("jestem w GroupAction");
//			getServletContext().getRequestDispatcher("/addGroup.jsp").forward(request, response);
//		}

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
//
//		
//
			}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		HttpSession sess = request.getSession();
		
//		if (request.getParameter("action").equals("add2")) {
//			System.out.println("jestem w add2");
//			String newGroupName = request.getParameter("groupName");
//			GroupDao.addGroup(request, newGroupName);
//			GroupDao.listGroup(request);
//		}
//		if (request.getParameter("action").equals("delete")) {
//			GroupDao.delGroup(request, request.getParameter("groupMap"), request.getParameter("groupId"));
//		}
//		if (request.getParameter("action").equals("show")) {
//			GroupDao.showGroup(request.getParameter("groupMap"), request.getParameter("groupId"));
//		}
//	
//		if (request.getParameter("action").equals("edit")) {
//			GroupDao.editGroup(request.getParameter("groupMap"), request.getParameter("groupId"));
//		}

	}

}
