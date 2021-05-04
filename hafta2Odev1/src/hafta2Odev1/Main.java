package hafta2Odev1;

public class Main {

	public static void main(String[] args) {
		CoursesManager coursesManager=new CoursesManager();
		Courses course1=new Courses(1, "Yazýlýmcý geliþtirme kampý C#/Angular","Engin Demiroð" );
		Courses course2=new Courses(2, "Yazýlýmcý geliþtirme kampý Java/React","Engin Demiroð" );
		
		Courses[] courses= {course1,course2};
		for (Courses course : courses) {
			System.out.println(course.getName());
			
		}
		coursesManager.add(new Courses(3, "Programlamaya Giriþ", "Engin Demiroð"));
		
		
		LessonManager lessonManager=new LessonManager();
		lessons lesson1=new lessons(1,2, "Java Temelleri 1", "1.Gün 21 Nisan 2021");
		lessons lesson2=new lessons(2,2, "Java Temelleri 2", "1.Gün 24 Nisan 2021");
		lessons lesson3=new lessons(3,1, "C# Temelleri 1", "1.Gün 9 Ocak 2021");
		
		lessons[] lessons= {lesson1,lesson2,lesson3};
		for (lessons lesson : lessons) {
			System.out.println(lesson.getLessonName());
		}
		lessonManager.add(new lessons(4,1,"C# Temelleri 2","2. Gün 12 Ocak 2021"));
		
		

	}

}
