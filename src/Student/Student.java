package Student;

public class Student {
	
	private int studentId;
	private String name;
	private String surname;
	private String mail;
	private int age;
	private int groupId;
	
	
	public Student(int studentId, String name, String surname, String mail, int age, int groupId) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.surname = surname;
		this.mail = mail;
		this.age = age;
		this.groupId = groupId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getGroupId() {
		return groupId;
	}


	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}


	public int getStudentId() {
		return studentId;
	}

}
