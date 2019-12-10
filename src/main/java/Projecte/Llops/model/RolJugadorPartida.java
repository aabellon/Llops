package Projecte.Llops.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
<<<<<<< HEAD
=======
import javax.persistence.OneToMany;
>>>>>>> b373a2a97b7ccde5d39312dd2acd1e79a65bdeea
import javax.persistence.Table;

import Projecte.Llops.model.User;

@Entity
@Table(name = "RolJugadorPartida")
public class RolJugadorPartida {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
<<<<<<< HEAD
	
	@ManyToOne()
	@JoinColumn(name="user")
	private User user;
	
	@ManyToOne()
	@JoinColumn(name="rol")
	private Rol rol;
	
=======
	@Column(name = "user")
	private User user;
	@Column(name = "rol")
	private Rol rol;
	@OneToMany
	@JoinColumn(name="partida")
>>>>>>> b373a2a97b7ccde5d39312dd2acd1e79a65bdeea
	private Partida partida;

	public RolJugadorPartida() {
		super();
	}

	public RolJugadorPartida(int id, User user, Rol rol, Partida partida) {
		super();
		this.id = id;
		this.user = user;
		this.rol = rol;
		this.partida = partida;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Partida getPartida() {
		return partida;
	}

	public void setPartida(Partida partida) {
		this.partida = partida;
	}
}

