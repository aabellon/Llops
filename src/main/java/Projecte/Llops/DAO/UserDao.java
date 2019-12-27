package Projecte.Llops.DAO;

import java.util.List;
import java.util.Scanner;

import Projecte.Llops.model.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import Projecte.Llops.model.Partida;
import Projecte.Llops.model.User;
//El modulo no necesita nada que no lo trate el genérico así que lo podemos dejar vacío
public class UserDao extends GenericDao<User,Integer> implements IUserDao {
	 Scanner Scaner = new Scanner (System.in);
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


	@Override
	public void registre(User user, String pw, String Path) {
		// TODO Auto-generated method stub
		String usuario = null;
		System.out.println("___________Registro de usuario_______________");
		System.out.println("Nombre de usuario:");
		usuario=Scaner.nextLine();
		if(usuario==null) {
			System.out.println("___________Registro de usuario Fallido porfavor escriba un usuario_______________");
		}
		else {
			System.out.println("Contraseña:");
			pw=Scaner.nextLine();
		}
		if(pw==null) {
			System.out.println("___________Registro de usuario Fallido porfavor escriba una Contraseña_______________");

		}
		//else {
		//	System.out.println("Ruta de la imagen:");
			
		//	File archivofoto = new File(Path); 
			//try {
		//		FileInputStream convertir_imagen = new FileInputStream (archivofoto);
			//} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
		//		e.printStackTrace();
		//	} 
	//	}
		user.setAlias(usuario);
		user.setPassword(pw);
		Session session = sessionFactory.getCurrentSession();

 		try {
			session.beginTransaction();
			session.saveOrUpdate(user);

 			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			if (session != null && session.getTransaction() != null) {
				System.out.println("\n.......Transaction Is Being Rolled Back.......");
				session.getTransaction().rollback();
			}
			e.printStackTrace();
 		}

	}
	public boolean login (String user, String pw) {
		Session session = sessionFactory.getCurrentSession();
		int i =0;
		Boolean correct=false;
		 Query query = session.createQuery("SELECT * FROM User");
		 List<User> Users = query.list();
		 for (User usuarios : Users) {
			 if(user != Users.get(i).getAlias() && pw != Users.get(i).getPassword()) {
				 correct=false;
			 }
			 else {
				 correct=true;
				 break;
			 }
		 }
		 if(correct== true) {
			 System.out.println("Login correcto");
		 }
		return correct;
		
	}
	}
	
