package hafta3Odev2;

public class Student extends User {

	private int studentId;
	private String course;
	

	public Student(int id,String fisrtName,String lastName,String email,int studentId, String course) {
		super( id, fisrtName, lastName, email);
		this.studentId = studentId;
		this.course = course;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	

}
