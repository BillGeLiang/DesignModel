package abstractFactoryPattern.entity;

public class Login {
	int id;
	int state;
	String userName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "Login [id=" + id + ", state=" + state + ", userName="
				+ userName + "]";
	}
	
	
	
}
