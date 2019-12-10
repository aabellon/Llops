package Projecte.Llops.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "RolJugadorPartida")
public class RolJugadorPartida {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@ManyToOne()
	@JoinColumn(name="user")
	private User user;
	
	@ManyToOne()
	@JoinColumn(name="rol")
	private Rol rol;

	@OneToMany
	@JoinColumn(name="partida")
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

