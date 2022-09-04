package model;

public class JavaBeans {
	private String idcon;
	private String nome;
	private String ra;
	private String email;
	
	
	public JavaBeans() {
		super();
		
	}
	
	public JavaBeans(String idcon, String nome, String ra, String email) {
		super();
		this.idcon = idcon;
		this.nome = nome;
		this.ra = ra;
		this.email = email;
		
	}

	public String getIdcon() {
		return idcon;
	}
	public void setIdcon(String idcon) {
		this.idcon = idcon;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
	

