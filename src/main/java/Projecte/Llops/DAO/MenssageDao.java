package Projecte.Llops.DAO;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import Projecte.Llops.model.Menssage;
import Projecte.Llops.model.User;

//El modulo no necesita nada que no lo trate el genérico así que lo podemos dejar vacío
public class MenssageDao extends GenericDao<Menssage,Integer> implements IMenssageDao {

	@Override
	public void enviaMissatge(User u1, User u2, String type, String content) {
		
		MenssageDao mensa = new MenssageDao();
		Menssage mensa1 = new Menssage(u1,u2,type,content);
		mensa.saveOrUpdate(mensa1);
	}

	@Override
	public List<Menssage> Listar() {
		// TODO Auto-generated method stub
		List<Menssage> mess;
		Session session = sessionFactory.getCurrentSession();
		try {

			session.beginTransaction();
			mess = this.list();
			session.getTransaction().commit();
			return mess;
		} catch (HibernateException e) {
			e.printStackTrace();
			if (session != null && session.getTransaction() != null) {
				System.out.println("\n.......Transaction Is Being Rolled Back.......");
				session.getTransaction().rollback();
			}
			e.printStackTrace();
			return null;

		}
		
	}

	@Override
	public Set<Menssage> getMissatge(int idUser) {
		List<Menssage> messaux = this.Listar();
		Set<Menssage> mess = new HashSet();
		for (Menssage m : messaux) {
			if(((Menssage) messaux).getSender().getId()== idUser || ((Menssage) messaux).getReceiver().getId() == idUser) {
				mess.add(m);
			}
		}
		
		return mess;
		
	}
	
	

}