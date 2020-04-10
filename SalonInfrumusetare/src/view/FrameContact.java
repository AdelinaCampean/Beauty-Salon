package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameContact {

	private JFrame frame;
	
	public FrameContact() {
	
		frame=new JFrame("Contact");
	frame.setResizable(false);
	frame.setBounds(100, 100, 963, 623);
	
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	frame.setTitle("Contact");
	
	JPanel panel = new JPanel();
	frame.getContentPane().add(panel, BorderLayout.CENTER);
	panel.setLayout(null);
	
	JLabel lblinf = new JLabel("Salonul nostru este situat la adresa urmatoare:");
	lblinf.setFont(new Font("Times New Roman", Font.BOLD, 18));
	lblinf.setBounds(389, 381, 394, 45);
	panel.add(lblinf);
	
	JLabel lbladr = new JLabel("str. Mihai Eminescu nr.9A, 400033, Cluj-Napoca, Romania\r\n");
	lbladr.setForeground(new Color(0, 0, 0));
	lbladr.setFont(new Font("Times New Roman", Font.ITALIC, 17));
	lbladr.setBounds(389, 444, 448, 45);
	panel.add(lbladr);
	
	JLabel lblprogr = new JLabel("Programari:");
	lblprogr.setFont(new Font("Times New Roman", Font.BOLD, 18));
	lblprogr.setBounds(149, 301, 149, 28);
	panel.add(lblprogr);
	
	JLabel lblNewLabel_3 = new JLabel("+40741560181");
	lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
	lblNewLabel_3.setBounds(149, 339, 149, 28);
	panel.add(lblNewLabel_3);
	
	JLabel lblpr = new JLabel("Program:");
	lblpr.setFont(new Font("Times New Roman", Font.BOLD, 18));
	lblpr.setBounds(149, 407, 128, 28);
	panel.add(lblpr);
	

	JLabel lblprog = new JLabel("<html>Luni – Vineri: 10:00 – 20:00\r\n <br/>Sambata: 10:00 – 11:00\r\n<br/>Duminica: inchis<html>");
	lblprog.setFont(new Font("Times New Roman", Font.PLAIN, 17));
	lblprog.setBounds(149, 445, 213, 82);
	panel.add(lblprog);
	
	JLabel lblfundal = new JLabel("Salonul nostru este situat la adresa urmatoare:");
	lblfundal.setIcon(new ImageIcon("C:\\Users\\ade_c\\Desktop\\Facultate\\AN 3\\SEM 2\\PS\\roses1.jpg"));
	lblfundal.setBounds(0, 0, 959, 595);
	panel.add(lblfundal);
	
	
	frame.setVisible(true);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	
}

