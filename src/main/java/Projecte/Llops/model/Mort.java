package Projecte.Llops.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import Projecte.Llops.model.User;

@Entity
@Table(name = "Mort")
public class Mort {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "user")
	private User user;
	@Column(name = "partida")
	private Partida partida;
	@Column(name = "torn")
	private int torn;

	public Mort() {
		super();
	}

	public Mort(int id, User user, Partida partida, int torn) {
		super();
		this.id = id;
		this.user = user;
		this.partida = partida;
		this.torn = torn;
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

	public Partida getPartida() {
		return partida;
	}

	public void setPartida(Partida partida) {
		this.partida = partida;
	}

	public int getTorn() {
		return torn;
	}

	public void setTorn(int torn) {
		this.torn = torn;
	}

}
