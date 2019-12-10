package Projecte.Llops.Controller;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.sql.Date;
@Entity
@Table(name = "xat")
public class Xat {
private int id=0;
private String sender;
private Partida partida;
private String content ;
private Date date;
}
