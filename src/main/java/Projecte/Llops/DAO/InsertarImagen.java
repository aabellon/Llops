package Projecte.Llops.DAO;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException; 
public class InsertarImagen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InsertarImagen frame = new InsertarImagen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InsertarImagen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JLabel lblJlabel = new JLabel("Jlabel");
		JButton btnCargarImagen = new JButton("Cargar Imagen");

		btnCargarImagen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resultado;
				File fichero;


				CargarFoto ventana = new CargarFoto();

				FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG","jpg","png");

				ventana.fileChooser.setFileFilter(filtro);

				resultado= ventana.fileChooser.showOpenDialog(null);


				if (JFileChooser.APPROVE_OPTION == resultado){


				        fichero = ventana.fileChooser.getSelectedFile();

				        try{

				               ImageIcon icon = new ImageIcon(fichero.toString());

				Icon icono = new ImageIcon(icon.getImage().getScaledInstance(lblJlabel.getWidth(), lblJlabel.getHeight(), Image.SCALE_DEFAULT));

				lblJlabel.setText(null);
				               
				lblJlabel.setIcon( icono );
				String foto = null;
				File archivofoto = new File(foto);
				FileInputStream convertir_imagen = new FileInputStream (archivofoto); 
				

				        }catch(Exception ex){

				           
				JOptionPane.showMessageDialog(null, "Error abriendo la imagen "+ ex);
				                 
				        }
				    
				 }
			}
		});
		contentPane.add(btnCargarImagen, BorderLayout.SOUTH);
		

		contentPane.add(lblJlabel, BorderLayout.CENTER);
	}

}
