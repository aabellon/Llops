package Projecte.Llops.DAO;

import java.util.List;

import Projecte.Llops.model.Mort;
import Projecte.Llops.model.RolJugadorPartida;

//En la interficie siemplemente extendemos IGenericDao y despejamos los genéricos
public interface IRolJugadorPartidaDao extends IGenericDao<RolJugadorPartida,Integer>{

	void saveOrUpdate(RolJugadorPartida m);

	RolJugadorPartida get(Integer id);

	List<RolJugadorPartida> list();

	void delete(Integer id);

}
