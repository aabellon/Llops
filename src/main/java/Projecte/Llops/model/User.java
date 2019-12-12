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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alias == null) ? 0 : alias.hashCode());
		result = prime * result + ((dataRegistre == null) ? 0 : dataRegistre.hashCode());
		result = prime * result + ((menssage == null) ? 0 : menssage.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((pathAvatar == null) ? 0 : pathAvatar.hashCode());
		result = prime * result + ((percentatgeVict == null) ? 0 : percentatgeVict.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
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
		User other = (User) obj;
		if (alias == null) {
			if (other.alias != null)
				return false;
		} else if (!alias.equals(other.alias))
			return false;
		if (dataRegistre == null) {
			if (other.dataRegistre != null)
				return false;
		} else if (!dataRegistre.equals(other.dataRegistre))
			return false;
		if (menssage == null) {
			if (other.menssage != null)
				return false;
		} else if (!menssage.equals(other.menssage))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (pathAvatar == null) {
			if (other.pathAvatar != null)
				return false;
		} else if (!pathAvatar.equals(other.pathAvatar))
			return false;
		if (percentatgeVict == null) {
			if (other.percentatgeVict != null)
				return false;
		} else if (!percentatgeVict.equals(other.percentatgeVict))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

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

	public Set<Menssage> getMessage() {
		return menssage;
	}

	public void setMessage(Set<Menssage> message) {
		this.menssage = message;
	}

	
	public User(String userName, String password, String alias) {
		super();
		this.userName = userName;
		this.password = password;
		this.alias = alias;
	}

	public User(String userName, String password, String alias, Date dataRegistre, String pathAvatar,
			String percentatgeVict, Set<Menssage> message) {
		super();
		this.userName = userName;
		this.password = password;
		this.alias = alias;
		this.dataRegistre = dataRegistre;
		this.pathAvatar = pathAvatar;
		this.percentatgeVict = percentatgeVict;
		this.menssage = message;
	}
	
	public User() {
		
	}

}
