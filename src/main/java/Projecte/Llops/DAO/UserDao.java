package Projecte.Llops.DAO;

import java.util.Scanner;

import Projecte.Llops.model.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//El modulo no necesita nada que no lo trate el gen�rico as� que lo podemos dejar vac�o
public class UserDao extends GenericDao<User,Integer> implements IUserDao {
	 Scanner Scaner = new Scanner (System.in);
	


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
			System.out.println("Contrase�a:");
			pw=Scaner.nextLine();
		}
		if(pw==null) {
			System.out.println("___________Registro de usuario Fallido porfavor escriba una Contrase�a_______________");

		}
	//	else {
		//	System.out.println("Ruta de la imagen:");
			//InsertarImagen ventana = new InsertarImagen();
			
			File archivofoto = new File(Path); 
		//	try {
		//		FileInputStream convertir_imagen = new FileInputStream (archivofoto);
				//Aqui es donse se tiene que temrinar de hacer la imagen e inserla al sql el texto ya se convierte en un strign asi que solo teneis que insertalo en la base datos
		//	} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
		//		e.printStackTrace();
		//	} 
		//}
		user.setAlias(usuario);
		user.setPassword(pw);
		
		System.out.println("___________Registro con exito_______________");

	}
}