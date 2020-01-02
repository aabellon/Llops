package Projecte.Llops.DAO;

import java.util.List;

import Projecte.Llops.model.Mort;
import Projecte.Llops.model.Partida;
import Projecte.Llops.model.User;
import Projecte.Llops.model.Vot;

//En la interficie siemplemente extendemos IGenericDao y despejamos los genéricos
public interface IVotDao extends IGenericDao<Vot,Integer>{

	void saveOrUpdate(Vot m);

	Vot get(Integer id);

	List<Vot> list();

	void delete(Integer id);

	List<Vot> Listar();

	void vota(User u1, User u2, Partida p);

}
