package Projecte.Llops.DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import Projecte.Llops.model.*;

//El modulo no necesita nada que no lo trate el genérico así que lo podemos dejar vacío
public class VotDao extends GenericDao<Vot,Integer> implements IVotDao {
	
	@Override
	public List<Vot> Listar() {
		// TODO Auto-generated method stub
		List<Vot> votss;
		Session session = sessionFactory.getCurrentSession();
		try {

			session.beginTransaction();
			votss = this.list();
			session.getTransaction().commit();
			return votss;
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
	public void vota(User u1, User u2, Partida p) {
		
		List<Vot> votssaux = this.Listar();
		Vot vot1 = new Vot(u1,u2,p,p.getTorn());
		
		if(p.getTorn()%2!=0) {
			votssaux.add(vot1);
		}
	}
	
}
