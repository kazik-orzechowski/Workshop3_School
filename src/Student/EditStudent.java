package Student;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/EditStudent")
public class EditStudent extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sess = request.getSession();
	
//		Integer studentId = (Integer) sess.getAttribute("studentId");
//
//		HashMap<Integer, Student> studentMap = (HashMap<Integer, Student>) sess.getAttribute("studentMap");
//		Student currentStudent = studentMap.get(studentId);
//		System.out.println("" + studentId + " " + currentStudent);
//		request.setAttribute("curStudent", currentStudent);
//		request.setAttribute("listAction", "edit");
		getServletContext().getRequestDispatcher("/StudentList").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
