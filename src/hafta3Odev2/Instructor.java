package hafta3Odev2;

public class Instructor extends User{
	
	private int instructorId;
	private String certificate;
	
	public Instructor(int id,String fisrtName,String lastName,String email,int instructorId, String certificate) {
		super(id,fisrtName,lastName,email);
		this.instructorId = instructorId;
		this.certificate = certificate;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

}
