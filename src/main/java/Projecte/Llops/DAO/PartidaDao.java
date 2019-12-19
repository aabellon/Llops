package Projecte.Llops.DAO;

import Projecte.Llops.model.*;

//El modulo no necesita nada que no lo trate el gen�rico as� que lo podemos dejar vac�o
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
