package Student;

import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Group.Group;


@WebServlet("/StudentDao")
public class StudentDao extends HttpServlet {
	
	
	static public HashMap<Integer, Student> addStudent(HttpServletRequest request) {
		HttpSession sess = request.getSession();
		HashMap<Integer, Student> studentMap = (HashMap<Integer, Student>) sess.getAttribute("studentMap");
		

		String name= request.getParameter("name");
		String surname= request.getParameter("surname");
		String mail= request.getParameter("mail");
		int age= Integer.parseInt(request.getParameter("age"));
		int groupId= Integer.parseInt(request.getParameter("groupId"));
		
		
		int lastStudentNumber = 0;
		if (studentMap == null) {

		} else {
			Set<Integer> mySet = studentMap.keySet();
			for (Integer key : mySet) { // iteracja po elementach hashMapy by znaleźć ostatni numer grupy
				if (key > lastStudentNumber) {
					lastStudentNumber = key;
			}
		}
			lastStudentNumber++;
			Student newStudent = new Student (lastStudentNumber, name, surname, mail, age, groupId);
			studentMap.put(lastStudentNumber, newStudent);
			sess.setAttribute("studentMap", studentMap);
			System.out.println("Student added");
		}
		return studentMap;
		
	}

	static public HashMap<Integer, Student> delStudent(HashMap<Integer,Student> studentMap, String studentId) {
		System.out.println("Delete student " + studentId);
		studentMap.remove(studentId);
		System.out.println("Student deleted");
		return studentMap;
	}

	
	static public HashMap<Integer, Student> editStudent(HttpServletRequest request) {
		HttpSession sess = request.getSession();
		HashMap<Integer, Student> studentMap = (HashMap<Integer, Student>) sess.getAttribute("studentMap");
		
		int studentId = Integer.parseInt(request.getParameter("studentId"));
		String name= request.getParameter("name");
		String surname= request.getParameter("surname");
		String mail= request.getParameter("mail");
		int age= Integer.parseInt(request.getParameter("age"));
		int groupId= Integer.parseInt(request.getParameter("groupId"));
		
		Student editedStudent = new Student (studentId, name, surname, mail, age, groupId);
		studentMap.put(studentId, editedStudent);
		sess.setAttribute("studentMap", studentMap);
		System.out.println("Student edited");

		return studentMap;

	}

	static public void showStudent(String groupMap, String groupId) {
		System.out.println("Show group" + groupId);
		
		// TODO Auto-generated method stub
	}


	static public void initializeStudentList(HttpServletRequest request) {
		Student s1 = new Student(1, "Felicjan", "Nieszczegolny", "fn@nf.com", 22, 1);
		Student s2 = new Student(2, "Marcjanna", "Wiotka", "mw@wiotka.com", 26, 2);
		Student s3 = new Student(3, "Grzegoslaw", "Watpliwy", "gw@www.com", 28, 1);

		
		HashMap<Integer, Student> studentMap = new HashMap<Integer, Student>();
		studentMap.put(s1.getStudentId(), s1);
		studentMap.put(s2.getStudentId(), s2);
		studentMap.put(s3.getStudentId(), s3);

		HttpSession sess = request.getSession();
		sess.setAttribute("studentMap", studentMap);
		System.out.println("StudentMap initialized" + studentMap);
		
		
	}

	
//	static public void listGroup(HttpServletRequest request) {
//
//		HttpSession sess = request.getSession();
//		sess.setAttribute("groupMap", groupMap);
//
//		
//	}

	
}
