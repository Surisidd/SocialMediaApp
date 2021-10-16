package socialmedia;

public class User {
	String name;
	String gender;
	String status;

	public User(String name, String gender, String status) {
		super();
		this.name = name;
		this.gender = gender;
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
