package jframe;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class GUI extends JFrame {

	

	private JFrame frame=new JFrame("Salon de Cosmetica");
	private JTextField usr = new JTextField();
	private JButton btnlogin = new JButton("LOGIN");
	private JButton btNclient = new JButton("Vizualizare Servicii Oferite");

	private JFrame frame2=new JFrame("Clients");
	private JTable table = new JTable();
	private JButton contact = new JButton("Informatii de Contact");
	
	private JFrame frame3=new JFrame("Angajat");
	private JTextField textCC;
	private JTextField textProg;
	
	private JFrame frame4=new JFrame("Administrator");
	private JTextField textnumeA = new JTextField();
	private JTextField textPass = new JTextField();
	private JPasswordField passwordField;

	
	/**
	 * Create the frame.
	 */
	public GUI() {
		
		/*frame2.setResizable(false);
		frame2.setBounds(100, 100, 1024, 680);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setTitle("Services");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 228, 181));
		panel_1.setForeground(new Color(240, 128, 128));
		//getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel srvTarife = new JLabel("Lista de preturi");
		srvTarife.setForeground(new Color(255, 105, 180));
		srvTarife.setFont(new Font("Times New Roman", Font.BOLD, 24));
		srvTarife.setBounds(345, 30, 340, 39);
		panel_1.add(srvTarife);
		contact.setForeground(new Color(139, 0, 0));
		contact.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		
	
		contact.setBounds(766, 572, 230, 39);
		panel_1.add(contact);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(993, 79, 22, 462);
		panel_1.add(scrollPane);
		
		
		table.setBackground(new Color(253, 245, 230));
		table.setForeground(new Color(240, 128, 128));
		table.setBounds(29, 79, 964, 462);
		panel_1.add(table);
		
		
		frame2.getContentPane().add(panel_1);
*/		
		/*frame4.setResizable(false);
		frame4.setBounds(100, 100, 775, 598);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(173, 255, 47));
		panel.setBounds(0, 0, 755, 603);
		//getContentPane().add(panel);
		panel.setLayout(null);
		
		textnumeA = new JTextField();
		textnumeA.setBounds(37, 224, 260, 40);
		panel.add(textnumeA);
		textnumeA.setColumns(10);
		
		textPass = new JTextField();
		textPass.setColumns(10);
		textPass.setBounds(37, 349, 260, 40);
		panel.add(textPass);
		
		JLabel lblAng = new JLabel("Introduceti numele angajatului: ");
		lblAng.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblAng.setBounds(37, 189, 240, 25);
		panel.add(lblAng);
		
		JLabel lbl = new JLabel("Adaugati o parola pentru angajat:");
		lbl.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl.setBounds(37, 314, 240, 25);
		panel.add(lbl);
		
		JButton btnSrv = new JButton("Vizualizare servicii cu tarife");
		btnSrv.setForeground(new Color(0, 51, 0));
		btnSrv.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnSrv.setBounds(188, 463, 324, 47);
		panel.add(btnSrv);
		
		JButton btnAdd = new JButton("Adaugare Angajat");
		btnAdd.setForeground(new Color(0, 100, 0));
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnAdd.setBounds(413, 98, 271, 40);
		panel.add(btnAdd);
		
		JButton btnEdit = new JButton("Editeaza angajat");
		btnEdit.setForeground(new Color(0, 100, 0));
		btnEdit.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnEdit.setBounds(413, 189, 271, 40);
		panel.add(btnEdit);
		
		JButton btnDel = new JButton("Sterge Angajat");
		btnDel.setForeground(new Color(0, 100, 0));
		btnDel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnDel.setBounds(413, 284, 271, 40);
		panel.add(btnDel);
		
		JButton btnInfo = new JButton("Vizualizeaza Informatii");
		btnInfo.setForeground(new Color(0, 100, 0));
		btnInfo.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnInfo.setBounds(413, 379, 271, 40);
		panel.add(btnInfo);
	
		
		JLabel ph2 = new JLabel();
		ph2.setIcon(new ImageIcon("C:\\Users\\ade_c\\Desktop\\Facultate\\AN 3\\SEM 2\\PS\\logo6.jpg"));
		ph2.setBounds(37, 13, 260, 125);
		panel.add(ph2);
		
		frame4.getContentPane().add(panel);
		
		*/
		//panel 3 
				/*
		frame3.setResizable(false);
		frame3.setBounds(100, 100, 1024, 680);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(new Color(255, 255, 102));
		//getContentPane().add(panel, BorderLayout.CENTER);
		panel3.setLayout(null);
		
		setTitle("Angajat");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 222, 173));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnVizC = new JButton("Vizualizare Lista Clienti");
		btnVizC.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnVizC.setBounds(406, 247, 325, 37);
		panel.add(btnVizC);
		
		JButton btnFilC = new JButton("Filtrare Clienti");
		btnFilC.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnFilC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFilC.setBounds(406, 322, 325, 37);
		panel.add(btnFilC);
		
		JButton btnCaut = new JButton("Cautare Client");
		btnCaut.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnCaut.setBounds(406, 60, 325, 37);
		panel.add(btnCaut);
		
		textCC = new JTextField();
		textCC.setBounds(37, 62, 276, 37);
		panel.add(textCC);
		textCC.setColumns(10);
		
		textProg = new JTextField();
		textProg.setColumns(10);
		textProg.setBounds(37, 146, 276, 37);
		panel.add(textProg);
		
		JButton btnProg = new JButton("Realizeaza Programare");
		btnProg.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnProg.setBounds(406, 144, 325, 37);
		panel.add(btnProg);
		
		JButton btnVizS = new JButton("Vizualizare Statistici");
		btnVizS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVizS.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnVizS.setBounds(406, 394, 325, 37);
		panel.add(btnVizS);
		
		JButton btnSlv = new JButton("Salvare Rapoarte");
		btnSlv.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnSlv.setBounds(406, 478, 325, 37);
		panel.add(btnSlv);
		
		JLabel lblCl = new JLabel("Introduceti numele clientului: ");
		lblCl.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblCl.setBounds(37, 35, 276, 26);
		panel.add(lblCl);
		
		JLabel lblProg = new JLabel("Introduceti denumirea programarii: ");
		lblProg.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblProg.setBounds(37, 121, 276, 26);
		panel.add(lblProg);
		
	
		JLabel ph2 = new JLabel();
		ph2.setIcon(new ImageIcon("C:\\Users\\ade_c\\Desktop\\Facultate\\AN 3\\SEM 2\\PS\\bb.jpg"));
		ph2.setBounds(10, 410, 352, 158);
		panel.add(ph2);
		
		JLabel ph = new JLabel();
		ph.setIcon(new ImageIcon("C:\\Users\\ade_c\\Desktop\\Facultate\\AN 3\\SEM 2\\PS\\skin.jpg"));
		ph.setBounds(10, 227, 200, 158);
		panel.add(ph);
		
		JLabel ph1 = new JLabel();
		ph1.setIcon(new ImageIcon("C:\\Users\\ade_c\\Desktop\\Facultate\\AN 3\\SEM 2\\PS\\sketch2.jpg"));
		ph1.setBounds(197, 247, 199, 143);
		panel.add(ph1);
		*/
		
		
		//al doilea frame
		/*frame2.setResizable(false);
		frame2.setBounds(100, 100, 1024, 680);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setTitle("Services");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 228, 181));
		panel_1.setForeground(new Color(240, 128, 128));
		//getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel srvTarife = new JLabel("Lista de preturi");
		srvTarife.setForeground(new Color(255, 105, 180));
		srvTarife.setFont(new Font("Times New Roman", Font.BOLD, 24));
		srvTarife.setBounds(345, 30, 340, 39);
		panel_1.add(srvTarife);
		contact.setForeground(new Color(139, 0, 0));
		contact.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		
	
		contact.setBounds(766, 572, 230, 39);
		panel_1.add(contact);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(993, 79, 22, 462);
		panel_1.add(scrollPane);
		
		
		table.setBackground(new Color(253, 245, 230));
		table.setForeground(new Color(240, 128, 128));
		table.setBounds(29, 79, 964, 462);
		panel_1.add(table);
		
		
		frame2.getContentPane().add(panel_1);
		
		*/
		//primul frame
		
		frame.setResizable(false);
		frame.setBounds(100, 100, 1266, 682);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 102));
		//getContentPane().add(panel, BorderLayout.CENTER);
		
	//	panel.imageUpdate("C:\\Users\\ade_c\\Desktop\\Facultate\\AN 3\\SEM 2\\PS\\fundal.jpg", 1, 100, 100, 1266, 731);
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
		ph1.setIcon(new ImageIcon("C:\\Users\\ade_c\\Desktop\\Facultate\\AN 3\\SEM 2\\PS\\logo.jpg"));
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
		
		JButton btnContact = new JButton("CONTACT");
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
		
		/*JLabel lblf = new JLabel("New label");
		lblf.setIcon(new ImageIcon("C:\\Users\\ade_c\\Desktop\\Facultate\\AN 3\\SEM 2\\PS\\lightsss.jpg"));
		lblf.setBounds(0, 0, 1262, 656);
		panel.add(lblf);*/
		
		passwordField = new JPasswordField();
		passwordField.setBackground(Color.PINK);
		passwordField.setBounds(866, 10, 215, 25);
		panel.add(passwordField);

		
		frame.setVisible(true);
		
		
		
		
	}
}
