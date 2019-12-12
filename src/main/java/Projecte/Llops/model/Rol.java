package Projecte.Llops.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Rol")
public class Rol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "nom")
	private String nom;
	@Column(name = "freq")
	private int freq;
	@Column(name = "pathImg")
	private String pathImg;
	@Column(name = "descripcio")
	private String descripcio;
	
	@OneToMany(mappedBy="rol", cascade=CascadeType.ALL)
	private Set<RolJugadorPartida> rolJugs = new HashSet<RolJugadorPartida>();
	
	public Rol() {
		super();
	}

	public Rol(String nom, int freq, String pathImg, String descripcio) {
		super();
		this.nom = nom;
		this.freq = freq;
		this.pathImg = pathImg;
		this.descripcio = descripcio;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getFreq() {
		return freq;
	}

	public void setFreq(int freq) {
		this.freq = freq;
	}

	public String getPathImg() {
		return pathImg;
	}

	public void setPathImg(String pathImg) {
		this.pathImg = pathImg;
	}

	public String getDescripcio() {
		return descripcio;
	}

	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}

}