package Projecte.Llops.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "Vot")
public class Vot {
private int id =0;
private String sender;
@Type(type="numeric_boolean") 
@Column(name="Receiver")
private boolean receiver ;
private Partida partida;
private int torn=0;
public Vot() {
	super();
}
public Vot(int id, String sender, boolean receiver, Partida partida, int torn) {
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
public String getSender() {
	return sender;
}
public void setSender(String sender) {
	this.sender = sender;
}
public boolean isReceiver() {
	return receiver;
}
public void setReceiver(boolean receiver) {
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
