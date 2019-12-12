package Projecte.Llops.model;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

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
	@OneToMany(mappedBy="partida", cascade=CascadeType.ALL)
	private Set<Vot> votspartida = new HashSet<Vot>();
	@OneToMany(mappedBy="partida", cascade=CascadeType.ALL)
	private Set<RolJugadorPartida> Rolpartida = new HashSet<RolJugadorPartida>();
<<<<<<< HEAD
	
	@ManyToMany(cascade = {CascadeType.REFRESH})
	@JoinTable(name="Partida",joinColumns= {@JoinColumn(name="user")},inverseJoinColumns= {@JoinColumn(name="id")})
	private Set<User> Jugadores  = new HashSet();
=======
	@OneToMany(mappedBy="partida", cascade=CascadeType.ALL)
	private Set<Mort> morts = new HashSet<Mort>();
	@OneToMany(mappedBy="partida", cascade=CascadeType.ALL)
	private Set<Xat> xats = new HashSet<Xat>();
>>>>>>> faf8d46a6e9d0931183b1cba6521032a3c7c06c1
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
