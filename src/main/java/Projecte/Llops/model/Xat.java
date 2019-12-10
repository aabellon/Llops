package Projecte.Llops.model;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.sql.Date;
@Entity
@Table(name = "Xat")
public class Xat {
private int id=0;
private String sender;
private Partida partida;
private String content ;
private Date date;
public Xat() {
	super();
}
public Xat(int id, String sender, Partida partida, String content, Date date) {
	super();
	this.id = id;
	this.sender = sender;
	this.partida = partida;
	this.content = content;
	this.date = date;
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
public Partida getPartida() {
	return partida;
}
public void setPartida(Partida partida) {
	this.partida = partida;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}

}
