package Projecte.Llops.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.sql.Date;
@Entity
@Table(name = "Xat")
public class Xat {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id=0;
	
	@Column(name = "sender")

private String sender;
<<<<<<< HEAD
	@Column(name = "partidaX")
	
private Partida partidaX;
=======
//	@Column(name = "partida")

//private Partida partida;
>>>>>>> 37f406776c63ec79b16232b17248a3cbb7143e83
	@Column(name = "content")

private String content ;
	@Column(name = "date")

private Date date;
public Xat() {
	super();
}
public Xat(int id, String sender, Partida partida, String content, Date date) {
	super();
	this.id = id;
	this.sender = sender;
<<<<<<< HEAD
	this.partidaX = partida;
=======
	//this.partida = partida;
>>>>>>> 37f406776c63ec79b16232b17248a3cbb7143e83
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
<<<<<<< HEAD
public Partida getPartida() {
	return partidaX;
}
public void setPartida(Partida partida) {
	this.partidaX = partida;
}
=======
/*public Partida getPartida() {
	return partida;
}
public void setPartida(Partida partida) {
	this.partida = partida;
}*/
>>>>>>> 37f406776c63ec79b16232b17248a3cbb7143e83
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
