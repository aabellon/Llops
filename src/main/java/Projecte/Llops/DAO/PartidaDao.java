package Projecte.Llops.DAO;

import Projecte.Llops.model.*;

//El modulo no necesita nada que no lo trate el genérico así que lo podemos dejar vacío
public class PartidaDao extends GenericDao<Partida,Integer> implements IPartidaDao {

	public void unirse(Partida p, User user) {
		UserDao uDAO = new UserDao();
		User user1 = user;
		if(p.getTorn()==0) {
			uDAO.afegirPartida(user1, p);
		}
	}
	public void inici(Partida p, User user) {
		p.setTorn(p.getTorn()+1);
		
	}
}
