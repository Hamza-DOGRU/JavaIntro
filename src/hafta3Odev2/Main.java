package hafta3Odev2;

public class Main {

	public static void main(String[] args) {
		
		User user=new User(1,"Hamza","Doğru","hamzadogru5481@gmail.com");
		Student student=new Student(2,"Bahar","Güngören","asdasdasdasd",123,"Java");
		
		
		StudentManager studentManager= new StudentManager();
		studentManager.add(student);

		UserManager userManager=new UserManager();
		userManager.add(user);

	}

}
