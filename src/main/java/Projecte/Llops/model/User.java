package Projecte.Llops.model;

import java.util.Date;
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
@Table(name="User")
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	@Column(name="userName")
	String userName;
	
	@Column(name="password")
	String password;
	
	@Column(name="alias")
	String alias;
	
	@Column(name="dataRegistre")
	Date dataRegistre;
	
	@Column(name="pathAvatar")
	String pathAvatar;
	
	@Column(name="percentatgeVict")
	String percentatgeVict;
	
	@OneToMany(mappedBy="sender", cascade=CascadeType.ALL)
	private Set<Menssage> menssageSender = new HashSet<Menssage>();
	
	@OneToMany(mappedBy="receiver", cascade=CascadeType.ALL)
	private Set<Menssage> menssageReceiver = new HashSet<Menssage>();

	@OneToMany(mappedBy="sender", cascade=CascadeType.ALL)
	private Set<Vot> votsSender = new HashSet<Vot>();
	
	@OneToMany(mappedBy="receiver", cascade=CascadeType.ALL)
	private Set<Vot> votsReceiver = new HashSet<Vot>();
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL)
	private Set<User> users = new HashSet<User>();
	


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Date getDataRegistre() {
		return dataRegistre;
	}

	public void setDataRegistre(Date dataRegistre) {
		this.dataRegistre = dataRegistre;
	}

	public String getPathAvatar() {
		return pathAvatar;
	}

	public void setPathAvatar(String pathAvatar) {
		this.pathAvatar = pathAvatar;
	}

	public String getPercentatgeVict() {
		return percentatgeVict;
	}

	public void setPercentatgeVict(String percentatgeVict) {
		this.percentatgeVict = percentatgeVict;
	}



	


	public User(String userName, String password, String alias) {
		super();
		this.userName = userName;
		this.password = password;
		this.alias = alias;
	}


	
	public User(int id, String userName, String password, String alias, Date dataRegistre, String pathAvatar,
			String percentatgeVict) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.alias = alias;
		this.dataRegistre = dataRegistre;
		this.pathAvatar = pathAvatar;
		this.percentatgeVict = percentatgeVict;
	}

	public User() {
		
	}

}
