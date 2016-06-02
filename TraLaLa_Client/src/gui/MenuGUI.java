package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Init_Reg_Controller;
import controller.Rep_List_Controller;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MenuGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	

	/**
	 * Create the frame.
	 */
	public MenuGUI(Init_Reg_Controller regCont, Rep_List_Controller repCont) {
		
		setTitle("TraLaLa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 13, 408, 227);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblbienvenidoATralala = new JLabel("\u00A1Bienvenido a TraLaLa!");
		lblbienvenidoATralala.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblbienvenidoATralala.setBounds(125, 0, 179, 16);
		panel.add(lblbienvenidoATralala);
		
		JLabel lblEscojaUnaOpcin = new JLabel("Escoja una opci\u00F3n:");
		lblEscojaUnaOpcin.setBounds(149, 34, 120, 16);
		panel.add(lblEscojaUnaOpcin);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(136, 82, 144, 25);
		panel.add(btnRegistrarse);
		
		btnRegistrarse.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				RegistrarseGUI fReg = new RegistrarseGUI(regCont, repCont);
				fReg.setVisible(true);
				
			}
		});
		
		JButton btnReproducirCancion = new JButton("Reproducir canci\u00F3n");
		btnReproducirCancion.setBounds(136, 131, 145, 25);
		panel.add(btnReproducirCancion);
		
		btnReproducirCancion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ReproducirGUI fRep = new ReproducirGUI(regCont, repCont);
				fRep.setVisible(true);
				
			}
		});
	}
}
