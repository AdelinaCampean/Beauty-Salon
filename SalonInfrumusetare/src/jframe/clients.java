package jframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class clients extends JFrame {

	private JFrame frame;

	public clients() {

		frame=new JFrame("Lista de servicii");
		frame.setResizable(false);
		frame.setBounds(100, 100, 1176, 768);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Contact");
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 127, 1105, 517);
		panel.add(panel_1);
		
	
		
		JLabel srvTarife = new JLabel("Servicii Oferite ");
		srvTarife.setForeground(new Color(255, 204, 0));
		srvTarife.setFont(new Font("Times New Roman", Font.BOLD, 27));
		srvTarife.setBounds(466, 55, 340, 39);
		panel.add(srvTarife);
		
		
		JLabel ph1 = new JLabel();
		ph1.setIcon(new ImageIcon("C:\\Users\\ade_c\\Desktop\\Facultate\\AN 3\\SEM 2\\PS\\logo.png"));
		ph1.setBounds(20, 10, 406, 103);
		panel.add(ph1);
		
		frame.getContentPane().add(panel);
		
		JButton btncont = new JButton("CONTACT");
		btncont.setForeground(new Color(153, 0, 153));
		btncont.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btncont.setBounds(952, 671, 175, 39);
		panel.add(btncont);
		
		JLabel lblbk = new JLabel();
		lblbk.setIcon(new ImageIcon("C:\\Users\\ade_c\\Desktop\\Facultate\\AN 3\\SEM 2\\PS\\fundal2.jpg"));
		lblbk.setBounds(0, 0, 1172, 730);
		panel.add(lblbk);
		frame.setVisible(true);
		
		
		
	}
}
