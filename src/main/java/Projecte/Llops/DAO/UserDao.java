package Projecte.Llops.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import Projecte.Llops.model.Partida;
import Projecte.Llops.model.User;

//El modulo no necesita nada que no lo trate el genérico así que lo podemos dejar vacío
public class UserDao extends GenericDao<User,Integer> implements IUserDao {
	public boolean afegirPartida(User u, Partida part) {
		
		Session session = sessionFactory.getCurrentSession();
		
		try {
			session.beginTransaction();
			session.saveOrUpdate(u);
			session.saveOrUpdate(part);
			
			session.getTransaction().commit();
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			if (session != null && session.getTransaction() != null) {
				System.out.println("\n.......Transaction Is Being Rolled Back.......");
				session.getTransaction().rollback();
			}
			e.printStackTrace();
			return false;

		}
	
		
	}

}
