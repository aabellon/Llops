package Projecte.Llops.DAO;

import java.util.List;

import Projecte.Llops.model.Mort;
import Projecte.Llops.model.Vot;

//En la interficie siemplemente extendemos IGenericDao y despejamos los genéricos
public interface IVotDao extends IGenericDao<Vot,Integer>{

	void saveOrUpdate(Vot m);

	Vot get(Integer id);

	List<Vot> list();

	void delete(Integer id);

}
