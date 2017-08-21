package Student;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/DeleteStudent")
public class DeleteStudent extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess = request.getSession();
		String studentId = request.getParameter("studentId");
		HashMap<Integer, Student> studentMap = (HashMap<Integer, Student>) sess.getAttribute(studentId);
		HashMap<Integer, Student> studentMap2 = StudentDao.delStudent(studentMap, studentId);
		
		request.setAttribute("studentMap", studentMap2);
		
		System.out.println("Deleted student" + studentId);
		
		request.setAttribute("studentMap", studentMap);
		request.setAttribute("listAction", "no");
				
		getServletContext().getRequestDispatcher("/StudentList").forward(request, response);

		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
