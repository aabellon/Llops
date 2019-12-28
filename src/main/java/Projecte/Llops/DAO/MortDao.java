package Projecte.Llops.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import Projecte.Llops.model.*;

//El modulo no necesita nada que no lo trate el genérico así que lo podemos dejar vacío
public class MortDao extends GenericDao<Mort,Integer> implements IMortDao {
	public ArrayList getMorts () {
		Session session = sessionFactory.getCurrentSession();

		 Query query = session.createQuery("SELECT * FROM mort");
		 List<Mort> Muertos = query.list();
		ArrayList<Mort> muertos = new ArrayList<Mort>();
		 for (Mort usuarios : Muertos) {
		 muertos.add(usuarios);
		 }
		return muertos;
	
	}
}
