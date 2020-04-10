package jframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class admin extends JFrame {

	private JFrame frame=new JFrame("Administrator");
	private JButton btnSrv = new JButton("Vizualizare servicii cu tarife");
	private JButton btnAdd = new JButton("Adaugare Aqswswngajat");
	private JButton btnEdit = new JButton("Editeaza angajat");
	private JButton btnDel = new JButton("Sterge Angajat");
	private JTextField textnumeA = new JTextField();
	private JTextField textId;
	private JTextField textPass = new JTextField();
	private JTextField textNamee = new JTextField();
	private final JLabel lblName = new JLabel("Adaugati o parola pentru angajat:");
	private JTextField textPassw  = new JTextField();
	private final JPanel panel_1 = new JPanel();
	private final JButton btnActualizareListaAngajati = new JButton("Actualizare lista angajati");
	
	public admin() {

		frame.setResizable(false);
		frame.setBounds(100, 100, 1306, 689);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(173, 255, 47));
		panel.setBounds(0, 0, 755, 603);
	
		panel.setLayout(null);
		
		JButton btnContact = new JButton("Vizualizare Informatii de Contact");
		btnContact.setForeground(new Color(0, 51, 0));
		btnContact.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnContact.setBounds(126, 557, 372, 47);
		panel.add(btnContact);
		btnActualizareListaAngajati.setForeground(new Color(0, 51, 0));
		btnActualizareListaAngajati.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnActualizareListaAngajati.setBounds(338, 478, 240, 47);
		
		panel.add(btnActualizareListaAngajati);
		panel_1.setBounds(605, 52, 687, 506);
		
		panel.add(panel_1);
		
		
		lblName.setForeground(new Color(255, 204, 0));
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblName.setBounds(37, 360, 274, 25);
		
		panel.add(lblName);
		
		textPassw = new JTextField();
		textPassw.setColumns(10);
		textPassw.setBounds(37, 395, 260, 40);
		panel.add(textPassw);
		
		JLabel lblPassw = new JLabel("Introduceti numele angajatului: ");
		lblPassw.setForeground(new Color(255, 204, 0));
		lblPassw.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblPassw.setBounds(37, 258, 260, 25);
		panel.add(lblPassw);
		
		textNamee = new JTextField();
		textNamee.setColumns(10);
		textNamee.setBounds(37, 293, 260, 40);
		panel.add(textNamee);
		
		JLabel lbltable = new JLabel("Lista Angajati");
		lbltable.setForeground(new Color(153, 0, 51));
		lbltable.setBackground(Color.WHITE);
		lbltable.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lbltable.setBounds(863, 8, 254, 34);
		panel.add(lbltable);
		
		textId = new JTextField();
		textId.setBounds(37, 195, 260, 40);
		panel.add(textId);
		textId.setColumns(10);
		
		JLabel lblId = new JLabel("Introduceti ID-ul angajatului:");
		lblId.setForeground(new Color(255, 204, 0));
		lblId.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblId.setBounds(37, 160, 240, 25);
		panel.add(lblId);
		
		
		btnSrv.setForeground(new Color(0, 51, 0));
		btnSrv.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnSrv.setBounds(37, 478, 260, 47);
		panel.add(btnSrv);
		
		
		btnAdd.setForeground(new Color(51, 102, 0));
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnAdd.setBounds(351, 193, 188, 40);
		panel.add(btnAdd);
		
		
		btnEdit.setForeground(new Color(0, 100, 0));
		btnEdit.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnEdit.setBounds(338, 291, 188, 40);
		panel.add(btnEdit);
		
		
		
		btnDel.setForeground(new Color(0, 100, 0));
		btnDel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnDel.setBounds(338, 393, 188, 40);
		panel.add(btnDel);
	
		
		JLabel ph2 = new JLabel();
		ph2.setIcon(new ImageIcon("C:\\Users\\ade_c\\Desktop\\Facultate\\AN 3\\SEM 2\\PS\\logo1.jpg"));
		ph2.setBounds(37, 26, 260, 112);
		panel.add(ph2);
		
		JLabel ph3 = new JLabel();
		ph3.setIcon(new ImageIcon("C:\\Users\\ade_c\\Desktop\\Facultate\\AN 3\\SEM 2\\PS\\fundal2.jpg"));
		ph3.setBounds(0, 0, 1302, 661);
		panel.add(ph3);
		
		frame.getContentPane().add(panel);
		frame.setVisible(true);
	}
}
