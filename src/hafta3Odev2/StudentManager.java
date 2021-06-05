package hafta3Odev2;

public class StudentManager {
    public void add(Student student) {
    	System.out.println("Öğrenci sisteme eklendi: "+student.getFirstName());
    }
	public void delete(Student student) {
		System.out.println("Öğrenci sistemden silindi: "+student.getFirstName());

       }
	}
