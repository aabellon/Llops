package ProjectoLobos.CTL;
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
}
