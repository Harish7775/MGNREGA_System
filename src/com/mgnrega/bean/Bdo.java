package com.mgnrega.bean;

public class Bdo {
	 private int id;
	 private String username;
	 private String password;
	 
	 public Bdo() {
		// TODO Auto-generated constructor stub
	}

	public Bdo(int r, String e, String p) {
		super();
		this.id = r;
		this.username = e;
		this.password = p;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Bdo [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
	 
	 

}
