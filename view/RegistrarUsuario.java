package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import database.Users;
import model.User;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class RegistrarUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textUserName;
	private JTextField textUserChild;
	private JTextField textUserBudget;
	private JTextField textUserSport;
	private JPasswordField textPassword;
	private JComboBox<String> comboBoxBarrio;

	/**
	 * Create the frame.
	 */
	public RegistrarUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 400, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de usuario");
		lblNombreDeUsuario.setBounds(58, 37, 100, 14);
		contentPane.add(lblNombreDeUsuario);
		
		textUserName = new JTextField();
		textUserName.setBounds(200, 34, 172, 20);
		contentPane.add(textUserName);
		textUserName.setColumns(10);
		
		JLabel lblNumeroDeHijos = new JLabel("Numero de hijos");
		lblNumeroDeHijos.setBounds(58, 180, 100, 14);
		contentPane.add(lblNumeroDeHijos);
		
		textUserChild = new JTextField();
		textUserChild.setBounds(200, 180, 172, 20);
		contentPane.add(textUserChild);
		textUserChild.setColumns(10);
		
		JLabel lblInteresaELdeporte = new JLabel("Le interesa el deporte");
		lblInteresaELdeporte.setBounds(58, 220, 150, 14);
		contentPane.add(lblInteresaELdeporte);
		
		textUserSport = new JTextField();
		textUserSport.setBounds(200, 220, 172, 20);
		contentPane.add(textUserSport);
		textUserSport.setColumns(10);
		
		JLabel lbPresupuesto = new JLabel("presupuesto");
		lbPresupuesto.setBounds(58, 260, 100, 14);
		contentPane.add(lbPresupuesto);
		
		textUserBudget = new JTextField();
		textUserBudget.setBounds(200, 260, 172, 20);
		contentPane.add(textUserBudget);
		textUserBudget.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setBounds(58, 82, 100, 14);
		contentPane.add(lblContrasea);
		
		textPassword = new JPasswordField();
		textPassword.setBounds(200, 79, 172, 20);
		contentPane.add(textPassword);
		
		JLabel lblBarrio = new JLabel("Barrio");
		lblBarrio.setBounds(58, 132, 100, 14);
		contentPane.add(lblBarrio);
		
		comboBoxBarrio = new JComboBox<String>();
		comboBoxBarrio.setModel(new DefaultComboBoxModel<String>(new String[] {"Popular", "Santa Cruz", "Manrique", "Aranjuez", "Castilla", "Doce de Octubre", "Robledo", "Villa Hermosa", "Buenos Aires", "La Candelaria", "Laureles", "La america", "San Javier", "El poblado", "Guayabal", "Belen"}));
		comboBoxBarrio.setBounds(200, 129, 172, 20);
		contentPane.add(comboBoxBarrio);
		
		JButton btnBackToLogin = new JButton("Regresar a iniciar Sesion");
		btnBackToLogin.setBounds(58, 300, 163, 23);
		contentPane.add(btnBackToLogin);
		
		JButton btnRegister = new JButton("Registrar");
		
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BotonRegistrar(e);
			}
		});
				
		btnRegister.setBounds(283, 300, 89, 23);
		contentPane.add(btnRegister);
		this.setLocationRelativeTo(null);
	}
	
	
	private void BotonRegistrar(java.awt.event.ActionEvent evt){
		if(!textUserName.getText().isEmpty()  &&  !String.valueOf(textPassword.getPassword()).isEmpty() ) {
			User usuario = new User(textUserName.getText(), String.valueOf(textPassword.getPassword()), comboBoxBarrio.getSelectedItem().toString(),Integer.parseInt(textUserChild.getText()),Integer.parseInt(textUserBudget.getText()),textUserSport.getText());
			Users.addUser(usuario);
			this.setVisible(false);
			Users.login(usuario);
		}else {
			System.out.print("Campos vacios");
		}
	}
}
