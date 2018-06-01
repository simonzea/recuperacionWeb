package model;

public class User {
	private String userName;
	private String password;
	private String nebourhood;
	private int children;
	private int budget;
	private String sport;
	
	public User(String Name, String Password, String nebourhood, int children,int budget,String sport) {
		this.userName = Name;
		this.password = Password;
		this.nebourhood = nebourhood;
		this.children = children;
		this.budget = budget;
		this.sport = sport;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String getNebourhood() {
		return this.nebourhood;
	}
	public String getSport() {
		return this.sport;
	}
	public int getChildren() {
		return this.children;
	}
	public int getBudget() {
		return this.budget;
	}
}
