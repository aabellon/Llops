package Projecte.Llops.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "Partida")
public class Partida {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id =0;
	@Column(name = "user")
	private String user;
	@Column(name = "torn")
	private int torn=0;
	@Lob
	@Column(name = "xat")
	private Xat xat;
	
	public Partida(int id, String user, int torn, Xat xat) {
		super();
		this.id = id;
		this.user = user;
		this.torn = torn;
		this.xat = xat;
	}
	
	public Partida() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	public int getTorn() {
		return torn;
	}
	public void setTorn(int torn) {
		this.torn = torn;
	}
	public Xat getXat() {
		return xat;
	}
	public void setXat(Xat xat) {
		this.xat = xat;
	}
}
