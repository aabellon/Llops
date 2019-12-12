package Projecte.Llops.DAO;

import java.util.List;

import Projecte.Llops.model.Mort;
import Projecte.Llops.model.Rol;

//En la interficie siemplemente extendemos IGenericDao y despejamos los genéricos
public interface IRolDao extends IGenericDao<Rol,Integer>{

	void saveOrUpdate(Rol m);

	Rol get(Integer id);

	List<Rol> list();

	void delete(Integer id);

}
