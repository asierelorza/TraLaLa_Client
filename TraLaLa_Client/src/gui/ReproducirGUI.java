package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Init_Reg_Controller;
import controller.Rep_List_Controller;

public class ReproducirGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public ReproducirGUI(Init_Reg_Controller irc, Rep_List_Controller rlc) {
		
		setTitle("TraLaLa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		JOptionPane.showMessageDialog(null, "No desarrollado en la ventana, ver directamente en el main del cliente");
	}

}
