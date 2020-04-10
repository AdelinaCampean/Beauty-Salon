package model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Persoana implements Serializable {

	private String rol;
	private String username;
	private String password;
	
	private int id;

	public Persoana(String rol, String username, String password, int id) {
		super();
		this.rol = rol;
		this.username = username;
		this.password = password;
		this.id = id;
	}
	
	public Persoana(String username, String password, int id) {
		super();
		this.username = username;
		this.password = password;
		this.id = id;
	}
	
	public Persoana()
	{
		
	}
	
	
	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	/*public void createUser(int id)
	{
		
		if(id > 0 && id <= 10)
		{
			Persoana p = new Administrator("usrname", "passw",id, null);
		}
		else 
		{
			Persoana p = new Angajat("usrname", "passw",id, null);
		}
		
	}*/
	
	
}
