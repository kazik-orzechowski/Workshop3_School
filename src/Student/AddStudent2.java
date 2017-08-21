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


@WebServlet("/AddStudent2")
public class AddStudent2 extends HttpServlet {
       
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess = request.getSession();
				
		HashMap<Integer,Student> studentMap = StudentDao.addStudent(request);
		
		request.setAttribute("studentMap", studentMap);
		request.setAttribute("listAction", "no");
				
		getServletContext().getRequestDispatcher("/StudentList").forward(request, response);

	}
	
}
