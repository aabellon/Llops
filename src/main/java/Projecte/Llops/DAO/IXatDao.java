package Projecte.Llops.DAO;

import java.util.List;


import Projecte.Llops.model.Xat;

//En la interficie siemplemente extendemos IGenericDao y despejamos los genéricos
public interface IXatDao extends IGenericDao<Xat,Integer>{

	void saveOrUpdate(Xat m);

	Xat get(Integer id);

	List<Xat> list();

	void delete(Integer id);

}
