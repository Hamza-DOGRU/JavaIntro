package hafta2Odev1;

public class Courses {
	private int id;
	private String name;
	private String instructor;
	
	public Courses(int id, String name, String instructor) {
		super();
		this.id = id;
		this.name = name;
		this.instructor = instructor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	

}
