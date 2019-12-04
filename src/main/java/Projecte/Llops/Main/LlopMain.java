package Projecte.Llops.Main;

import Projecte.Llops.DAO.MenssageDao;
import Projecte.Llops.DAO.UserDao;
import Projecte.Llops.model.Menssage;
import Projecte.Llops.model.User;

public class LlopMain {

	public static void main(String[] args) {
		
		UserDao user2 = new UserDao();
		
		User user1 = new User("Hola","Hola","Hola");
		
		user2.saveOrUpdate(user1);
		MenssageDao mensa = new MenssageDao();
		
		Menssage mensa1 = new Menssage();
		
		//mensa.saveOrUpdate(mensa1);
		/////////////////////////////////
		

	}

}
