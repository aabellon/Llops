package Projecte.Llops.DAO;

import java.util.List;

import Projecte.Llops.model.Partida;

//En la interficie siemplemente extendemos IGenericDao y despejamos los genéricos
public interface IPartidaDao extends IGenericDao<Partida,Integer>{
	
	void saveOrUpdate(Partida m);

	Partida get(Integer id);

	List<Partida> list();

	void delete(Integer id);

}
