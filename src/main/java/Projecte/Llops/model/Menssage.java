package Projecte.Llops.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Menssage")

public class Menssage {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	int id;
	
	@Column(name = "sender")
	String sender;
	
	@Column(name = "receiver")
	String receiver;
	
	@Column(name = "type")
	String type;
	
	@Column(name = "content")
	String content;
	
	@Column(name = "date")
	Date date;
	
	@ManyToOne
	@JoinColumn(name="usering")
	private User usering;

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

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menssage other = (Menssage) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public Menssage(int id, String sender, String receiver, String type, String content, Date date) {
		super();
		this.id = id;
		this.sender = sender;
		this.receiver = receiver;
		this.type = type;
		this.content = content;
		this.date = date;
	}
	
	public Menssage() {

	}
	
	

}
