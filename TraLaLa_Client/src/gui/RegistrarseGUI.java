package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Init_Reg_Controller;
import controller.Rep_List_Controller;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class RegistrarseGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	private String nombreUsu;
	private String nombreUsuPayPal;
	private String contraPayPal;
	private String numTarjCred;
	private boolean ventajoso;
			
	/**
	 * Create the frame.
	 */
	public RegistrarseGUI(Init_Reg_Controller irc, Rep_List_Controller rlc) {
				
		setTitle("TraLaLa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 13, 408, 227);
		contentPane.add(panel);
		panel.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblRegistrarUsuario = new JLabel("Registrar Usuario");
		lblRegistrarUsuario.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRegistrarUsuario.setBounds(129, 13, 152, 20);
		panel.add(lblRegistrarUsuario);
		
		JLabel lblNombreUsuario = new JLabel("Nombre Usuario:");
		lblNombreUsuario.setBounds(12, 51, 112, 16);
		panel.add(lblNombreUsuario);
		
		textField = new JTextField();
		textField.setBounds(129, 48, 116, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblUsuarioPaypal = new JLabel("Usuario PayPal:");
		lblUsuarioPaypal.setBounds(12, 80, 94, 16);
		panel.add(lblUsuarioPaypal);
		
		textField_1 = new JTextField();
		textField_1.setBounds(129, 77, 116, 22);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblContraseaPaypal = new JLabel("Contrase\u00F1a PayPal:");
		lblContraseaPaypal.setBounds(12, 109, 112, 16);
		panel.add(lblContraseaPaypal);
		
		textField_2 = new JTextField();
		textField_2.setBounds(129, 106, 116, 22);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNumeroTarjetaCredito = new JLabel("Numero Tarjeta Credito:");
		lblNumeroTarjetaCredito.setBounds(12, 133, 152, 16);
		panel.add(lblNumeroTarjetaCredito);
		
		textField_3 = new JTextField();
		textField_3.setBounds(165, 133, 116, 22);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblpagoVentajoso = new JLabel("\u00BFPago Ventajoso?");
		lblpagoVentajoso.setBounds(12, 162, 112, 16);
		panel.add(lblpagoVentajoso);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Si/No");
		chckbxNewCheckBox.setBounds(129, 158, 113, 25);
		panel.add(chckbxNewCheckBox);
				
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(271, 189, 97, 25);
		panel.add(btnRegistrarse);
		
		btnRegistrarse.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				nombreUsu = textField.getText();
				nombreUsuPayPal = textField_1.getText();
				contraPayPal = textField_2.getText();
				numTarjCred = textField_3.getText();
				ventajoso = chckbxNewCheckBox.isSelected();
				
				boolean exito = irc.registrarUsuario(nombreUsu, nombreUsuPayPal, contraPayPal, numTarjCred, ventajoso);
				
				if(exito){
					JOptionPane.showMessageDialog(null, "Usuario registrado correctamente!");
				}
				else{
					JOptionPane.showMessageDialog(null, "El usuario no se ha podido registrar");
				}
				
				setVisible(false);
				
				MenuGUI mgui = new MenuGUI(irc, rlc);
				mgui.setVisible(true);
				
				
			}
		});
	}
}
