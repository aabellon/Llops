package Projecte.Llops.DAO;

import java.util.List;

import Projecte.Llops.model.Menssage;

//En la interficie siemplemente extendemos IGenericDao y despejamos los genéricos
public interface IMenssageDao extends IGenericDao<Menssage,Integer>{

	void saveOrUpdate(Menssage m);

	Menssage get(Integer id);

	List<Menssage> list();

	void delete(Integer id);

}
