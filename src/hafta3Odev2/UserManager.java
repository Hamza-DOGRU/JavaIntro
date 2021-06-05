package hafta3Odev2;

public class UserManager {
	
    public void add(User user) {
    	System.out.println("Kullanýcý sisteme eklendi: "+user.getFirstName());
    }
	public void delete(User user) {
		System.out.println("Kullanýcý sistemden silindi: "+user.getFirstName());
	}
	public void update() {}

}
