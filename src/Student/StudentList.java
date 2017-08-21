package Student;

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


@WebServlet("/StudentList")
public class StudentList extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sess = request.getSession();
		
				
		HashMap<Integer, Student> studentMap = (HashMap<Integer, Student>) sess.getAttribute("studentMap");
		ArrayList<Student> studentList = new ArrayList<Student>();

		Set<Integer> mySet = studentMap.keySet();
		for (Integer key : mySet) { // iteracja po elementach hashMapy
			studentList.add(studentMap.get(key));
		}
		
		String currentStudent = request.getParameter("studentId");
		request.setAttribute("myAttrMap", studentMap);
		request.setAttribute("myAttribute", studentList);
//		request.setAttribute("currentStudentId", studentId);

		getServletContext().getRequestDispatcher("/StudentList.jsp").forward(request, response);

		
	}

	

}
