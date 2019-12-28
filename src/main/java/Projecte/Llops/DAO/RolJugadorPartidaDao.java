package Projecte.Llops.DAO;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.query.Query;

import Projecte.Llops.model.*;

//El modulo no necesita nada que no lo trate el genérico así que lo podemos dejar vacío
public class RolJugadorPartidaDao extends GenericDao<RolJugadorPartida,Integer> implements IRolJugadorPartidaDao {
	Scanner Scaner = new Scanner (System.in);

	public  Rol DescobrirRol() {
	Rol rol = null;
	Session session = sessionFactory.getCurrentSession();
	int i =0;
	String cosa=null;
	 Query query = session.createQuery("SELECT user FROM RolJugadorPartida");
	 List<RolJugadorPartida> Users = query.list();
	 for (RolJugadorPartida usuarios : Users) {
		 System.out.println("Usuario"+usuarios.getUser().getAlias());
		 System.out.println("Deseas escoger este usuario?(utilice solo si o no porfavor)");
			cosa=Scaner.nextLine();
			if(cosa=="Si"||cosa=="si") {
				usuarios.getRol().getNom();
				break;
			}
			else if(cosa=="No"||cosa=="no"){
				
			}
			else {
				 System.out.println("Solo si o no profavor");

			}
	 }
		return rol;
	}
}
