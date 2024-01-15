package com;

public class Database {

	private String url="jdbc:oracle:thin:@localhost:1521:xe";
	private String usuario="joel";
	private String password = "admin";
	public String driver="oracle.jdbc.OracleDriver";
	
	
	public Database() {
		super();
		this.driver=driver;
		this.url = url;
		this.usuario = usuario;
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	@Override
	public String toString() {
		return "Database [url=" + url + ", usuario=" + usuario + ", password=" + password + ", driver=" + driver + "]";
	}
	
}
