package Projecte.Llops.DAO;

import java.util.List;
import java.util.Set;

import Projecte.Llops.model.Menssage;
import Projecte.Llops.model.User;

//En la interficie siemplemente extendemos IGenericDao y despejamos los genéricos
public interface IMenssageDao extends IGenericDao<Menssage,Integer>{

	void saveOrUpdate(Menssage m);

	Menssage get(Integer id);

	List<Menssage> list();

	void delete(Integer id);
	
	List<Menssage> Listar();
	
	void enviaMissatge(User u1,User u2,String type,String content);

	Set<Menssage> getMissatge(int idUser);
}
