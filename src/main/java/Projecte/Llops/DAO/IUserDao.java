package Projecte.Llops.DAO;

import java.util.List;

import Projecte.Llops.model.User;

//En la interficie siemplemente extendemos IGenericDao y despejamos los genéricos
public interface IUserDao extends IGenericDao<User,Integer>{

	void saveOrUpdate(User m);

	User get(Integer id);

	List<User> list();

	void delete(Integer id);

	void registre(User user, String pw, String Path);

}
