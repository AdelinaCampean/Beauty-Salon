package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FramePrincipal {

	private JFrame frame;
	private JTextField usr = new JTextField();
	private JTextField passwordField = new JTextField();
	
	private JButton btnlogin = new JButton("LOGIN");
	private JButton btNclient = new JButton("Vizualizare Servicii Oferite");
	private JButton btnContact = new JButton("CONTACT");
	
	public FramePrincipal() {
		
		frame=new JFrame("Salon de Cosmetica");
		frame.setResizable(false);
		frame.setBounds(100, 100, 1266, 682);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 102));
		panel.setLayout(null);
		
		JLabel username = new JLabel("USERNAME:");
		username.setForeground(Color.RED);
		username.setFont(new Font("Times New Roman", Font.BOLD, 14));
		username.setBounds(431, 9, 94, 24);
		panel.add(username);
		
		usr.setBackground(Color.PINK);
		usr.setBounds(521, 10, 215, 25);
		panel.add(usr);
		usr.setColumns(10);
		
		JLabel passw = new JLabel("PASSWORD:");
		passw.setForeground(Color.RED);
		passw.setFont(new Font("Times New Roman", Font.BOLD, 14));
		passw.setBounds(765, 11, 94, 20);
		panel.add(passw);
		
		
		passwordField = new JPasswordField();
		passwordField.setBackground(Color.PINK);
		passwordField.setBounds(855, 10, 215, 25);
		panel.add(passwordField);

		
		
		btnlogin.setForeground(Color.RED);
		btnlogin.setBackground(Color.PINK);
		btnlogin.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnlogin.setBounds(1108, 9, 124, 24);
		panel.add(btnlogin);
		
		
		btNclient.setBackground(Color.PINK);
		btNclient.setForeground(Color.BLUE);
		btNclient.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btNclient.setBounds(587, 80, 260, 38);
		panel.add(btNclient);
		
		
		JLabel ph1 = new JLabel();
		ph1.setIcon(new ImageIcon("C:\\Users\\ade_c\\Desktop\\Facultate\\AN 3\\SEM 2\\PS\\logo.png"));
		ph1.setBounds(10, 10, 411, 122);
		panel.add(ph1);
		
		JLabel ph2 = new JLabel();
		ph2.setIcon(new ImageIcon("C:\\Users\\ade_c\\Desktop\\Facultate\\AN 3\\SEM 2\\PS\\prod.jpg"));
		ph2.setBounds(531, 227, 208, 240);
		panel.add(ph2);
		
		JLabel ph3 = new JLabel();
		ph3.setIcon(new ImageIcon("C:\\Users\\ade_c\\Desktop\\Facultate\\AN 3\\SEM 2\\PS\\title2.jpg"));
		ph3.setBounds(1004, 188, 222, 279);
		panel.add(ph3);

		JLabel ph4 = new JLabel();
		ph4.setIcon(new ImageIcon("C:\\Users\\ade_c\\Desktop\\Facultate\\AN 3\\SEM 2\\PS\\prod2.jpg"));
		ph4.setBounds(780, 404, 171, 214);
		panel.add(ph4);
		
		JLabel ph5 = new JLabel();
		ph5.setIcon(new ImageIcon("C:\\Users\\ade_c\\Desktop\\Facultate\\AN 3\\SEM 2\\PS\\tratamente.jpg"));
		ph5.setBounds(10, 313, 452, 262);
		panel.add(ph5);
		
		frame.getContentPane().add(panel);
		
		
		btnContact.setBackground(Color.PINK);
		btnContact.setForeground(Color.BLUE);
		btnContact.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnContact.setBounds(968, 80, 264, 38);
		panel.add(btnContact);
		
		JLabel lblinfo = new JLabel("Salonul dispune de tratamente faciale, epilare clasica,\r\nepilare definitiva si multe alte servicii!");
		lblinfo.setForeground(Color.BLACK);
		lblinfo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblinfo.setBounds(20, 145, 853, 75);
		panel.add(lblinfo);
		
		JLabel lblf = new JLabel("New label");
		lblf.setIcon(new ImageIcon("C:\\Users\\ade_c\\Desktop\\Facultate\\AN 3\\SEM 2\\PS\\lightsss.jpg"));
		lblf.setBounds(0, 0, 1262, 656);
		panel.add(lblf);

		
		frame.setVisible(true);
	}
	
	public void addListenerButon1(ActionListener btNclient1) {
		// TODO Auto-generated method stub
		btNclient.addActionListener(btNclient1);
	}
	
	public void addListenerButon2(ActionListener btnLogin) {
		// TODO Auto-generated method stub
		btnlogin.addActionListener(btnLogin);
	}

	public void addListenerButon3(ActionListener btnContact1) {
		btnContact.addActionListener(btnContact1);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public String getUsr() {
		return usr.getText();
	}

	public void setUsr(JTextField usr) {
		this.usr = usr;
	}

	

	public String getPasswordField() {
		return passwordField.getText();
	}

	public void setPasswordField(JTextField passwordField) {
		this.passwordField = passwordField;
	}

	public JButton getBtnlogin() {
		return btnlogin;
	}

	public void setBtnlogin(JButton btnlogin) {
		this.btnlogin = btnlogin;
	}

	public JButton getBtNclient() {
		return btNclient;
	}

	public void setBtNclient(JButton btNclient) {
		this.btNclient = btNclient;
	}

	public JButton getBtnContact() {
		return btnContact;
	}

	public void setBtnContact(JButton btnContact) {
		this.btnContact = btnContact;
	}

	
	
	
	
	
}
