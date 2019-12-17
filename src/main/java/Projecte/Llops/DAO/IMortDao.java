package Projecte.Llops.DAO;

import java.util.List;

import Projecte.Llops.model.Mort;

//En la interficie siemplemente extendemos IGenericDao y despejamos los genéricos
public interface IMortDao extends IGenericDao<Mort,Integer>{

	void saveOrUpdate(Mort m);

	Mort get(Integer id);

	List<Mort> list();

	void delete(Integer id);

}
