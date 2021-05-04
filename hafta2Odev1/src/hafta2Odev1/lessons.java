package hafta2Odev1;

public class lessons {
	private int id;
	private int courseId;
	private String lessonName;
	private String lessonTime;
	
	public lessons(int id,int courseId, String lessonName, String lessonTime) {
		super();
		this.id = id;
		this.courseId=courseId;
		this.lessonName = lessonName;
		this.lessonTime = lessonTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getcourseId() {
		return courseId;
	}

	public void setcourse(int courseId) {
		this.courseId = courseId;
	}

	public String getLessonName() {
		return lessonName;
	}

	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}

	public String getLessonTime() {
		return lessonTime;
	}

	public void setLessonTime(String lessonTime) {
		this.lessonTime = lessonTime;
	}
	

}
