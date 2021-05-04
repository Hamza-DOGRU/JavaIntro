package hafta2Odev1;

public class LessonManager {
	public void add(lessons lessons) {
		System.out.println("Kurs Sisteme Eklendi:"+lessons.getLessonName());
	}
	public void delete(lessons lessons) {
		System.out.println("Kurs Sistemden silindi:"+lessons.getLessonName());
		
	}

}
