package Projecte.Llops.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Vot")
public class Vot {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id = 0;

	
	@ManyToOne()
	@JoinColumn(name="sender")
	private User sender;
	
	@ManyToOne
	@JoinColumn(name="receiver")
	private User receiver;
	@ManyToOne
	@JoinColumn(name="partida")
	private Partida partida;

	
	@Column(name = "torn")
	private int torn = 0;

	public Vot() {
		super();
	}

	public Vot(int id, User sender, User receiver, Partida partida, int torn) {
		super();
		this.id = id;
		this.sender = sender;
		this.receiver = receiver;
		this.partida = partida;
		this.torn = torn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public User isReceiver() {
		return receiver;
	}

	public void setReceiver(User receiver) {
		this.receiver = receiver;
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
