package jframe;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class View {

	
	private JFrame frame=new JFrame("Salon de Cosmetica");
	private JTextField usr = new JTextField();
	private JTextField passt = new JTextField();
	private JButton btnlogin = new JButton("LOGIN");
	private JButton btNclient = new JButton("Go as a client");
	private JCheckBox admCheckBox = new JCheckBox("Administrator");
	
	private JFrame frame2=new JFrame("Clients");
	private JTable table = new JTable();
	private JButton contact = new JButton("Contact");
	
	private JFrame frame3=new JFrame("Angajati");
	private JTextField textCC= new JTextField();
	private JTextField textProg= new JTextField();
	private JButton btnVizC = new JButton("Vizualizare Lista Clienti");
	private JButton btnCaut = new JButton("Cautare Client");
	private JButton btnProg = new JButton("Realizeaza Programare");
	private JButton btnFilC = new JButton("Filtrare Clienti");
	private JButton btnVizS = new JButton("Vizualizare Statistici");
	private JButton btnSlv = new JButton("Salvare Rapoarte");
	
	private JFrame frame4=new JFrame("Administrator");
	private JButton btnSrv = new JButton("Vizualizare servicii cu tarife");
	private JButton btnAdd = new JButton("Adaugare Angajat");
	private JButton btnEdit = new JButton("Editeaza angajat");
	private JButton btnDel = new JButton("Sterge Angajat");
	private JButton btnInfo = new JButton("Vizualizeaza Informatii");
	private JTextField textnumeA = new JTextField();
	private JTextField textPass = new JTextField();
	
	public View() {
		

		frame.setResizable(false);
		frame.setBounds(100, 100, 1024, 680);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 102));
		//getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel username = new JLabel("USERNAME:");
		username.setForeground(Color.RED);
		username.setFont(new Font("Times New Roman", Font.BOLD, 15));
		username.setBounds(585, 74, 109, 38);
		panel.add(username);
		
		usr.setBackground(Color.PINK);
		usr.setBounds(704, 74, 291, 41);
		panel.add(usr);
		usr.setColumns(10);
		
		JLabel passw = new JLabel("PASSWORD:");
		passw.setForeground(Color.RED);
		passw.setFont(new Font("Times New Roman", Font.BOLD, 15));
		passw.setBounds(585, 150, 109, 32);
		panel.add(passw);
		
		
		passt.setBackground(Color.PINK);
		passt.setColumns(10);
		passt.setBounds(704, 147, 291, 41);
		panel.add(passt);
		
		
		btnlogin.setForeground(Color.RED);
		btnlogin.setBackground(Color.MAGENTA);
		btnlogin.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnlogin.setBounds(663, 260, 217, 41);
		panel.add(btnlogin);
		
		
		//btNclient.setBackground(Color.BLUE);
		btNclient.setForeground(Color.BLUE);
		btNclient.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btNclient.setBounds(735, 568, 260, 38);
		panel.add(btNclient);
		
		JLabel ph1 = new JLabel();
		ph1.setIcon(new ImageIcon("C:\\Users\\ade_c\\Desktop\\Facultate\\AN 3\\SEM 2\\PS\\salonb.jpg"));
		ph1.setBounds(173, 138, 235, 250);
		panel.add(ph1);
		
		JLabel ph2 = new JLabel();
		ph2.setIcon(new ImageIcon("C:\\Users\\ade_c\\Desktop\\Facultate\\AN 3\\SEM 2\\PS\\prod.jpg"));
		ph2.setBounds(173, 380, 222, 262);
		panel.add(ph2);
		
		JLabel ph3 = new JLabel();
		ph3.setIcon(new ImageIcon("C:\\Users\\ade_c\\Desktop\\Facultate\\AN 3\\SEM 2\\PS\\aparat.jpg"));
		ph3.setBounds(0, 0, 171, 262);
		panel.add(ph3);

		JLabel ph4 = new JLabel();
		ph4.setIcon(new ImageIcon("C:\\Users\\ade_c\\Desktop\\Facultate\\AN 3\\SEM 2\\PS\\prod2.jpg"));
		ph4.setBounds(0, 260, 171, 262);
		panel.add(ph4);
		
		
		admCheckBox.setForeground(new Color(0, 0, 0));
		admCheckBox.setFont(new Font("Times New Roman", Font.BOLD, 12));
		admCheckBox.setBounds(886, 207, 109, 32);
		panel.add(admCheckBox);
		
		
		frame.getContentPane().add(panel);
		frame.setVisible(true);
	}
	
	public void frameClients()
	{
		frame2.setResizable(false);
		frame2.setBounds(100, 100, 1024, 680);
		
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setTitle("Services");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 228, 181));
		panel_1.setForeground(new Color(240, 128, 128));
		
		panel_1.setLayout(null);
		
		JLabel srvTarife = new JLabel("Lista de preturi");
		srvTarife.setForeground(new Color(255, 105, 180));
		srvTarife.setFont(new Font("Times New Roman", Font.BOLD, 24));
		srvTarife.setBounds(345, 30, 340, 39);
		panel_1.add(srvTarife);
		
	
		contact.setBounds(849, 583, 185, 39);
		panel_1.add(contact);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(993, 79, 22, 462);
		panel_1.add(scrollPane);
		
		
		table.setBackground(new Color(253, 245, 230));
		table.setForeground(new Color(240, 128, 128));
		table.setBounds(29, 79, 964, 462);
		panel_1.add(table);
		
		frame2.getContentPane().add(panel_1);
		frame2.setVisible(true);
	}

	public void frameAng()
	{
		frame3.setResizable(false);
		frame3.setBounds(100, 100, 1024, 680);
	
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 222, 173));
		
		panel.setLayout(null);
		
		
		btnVizC.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnVizC.setBounds(406, 247, 325, 37);
		panel.add(btnVizC);
		
		
		btnFilC.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnFilC.setBounds(406, 322, 325, 37);
		panel.add(btnFilC);
		
		
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
		
		
		btnProg.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnProg.setBounds(406, 144, 325, 37);
		panel.add(btnProg);
		

		btnVizS.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnVizS.setBounds(406, 394, 325, 37);
		panel.add(btnVizS);
		
		
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
		
		frame3.getContentPane().add(panel);
		frame3.setVisible(true);
	}
	
	public void frameAdm() {
		frame4.setResizable(false);
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
		
		
		btnSrv.setForeground(new Color(0, 51, 0));
		btnSrv.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnSrv.setBounds(188, 463, 324, 47);
		panel.add(btnSrv);
		
		
		btnAdd.setForeground(new Color(0, 100, 0));
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnAdd.setBounds(413, 98, 271, 40);
		panel.add(btnAdd);
		
		
		btnEdit.setForeground(new Color(0, 100, 0));
		btnEdit.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnEdit.setBounds(413, 189, 271, 40);
		panel.add(btnEdit);
		
		
		btnDel.setForeground(new Color(0, 100, 0));
		btnDel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnDel.setBounds(413, 284, 271, 40);
		panel.add(btnDel);
		
		
		btnInfo.setForeground(new Color(0, 100, 0));
		btnInfo.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnInfo.setBounds(413, 379, 271, 40);
		panel.add(btnInfo);
	
		
		JLabel ph2 = new JLabel();
		ph2.setIcon(new ImageIcon("C:\\Users\\ade_c\\Desktop\\Facultate\\AN 3\\SEM 2\\PS\\logo6.jpg"));
		ph2.setBounds(37, 13, 260, 125);
		panel.add(ph2);
		
		frame4.getContentPane().add(panel);
		frame4.setVisible(true);
	}
	
	public JFrame getFrame() {
		return frame;
	}


	public void setFrame(JFrame frame) {
		this.frame = frame;
	}


	public JTextField getUsr() {
		return usr;
	}


	public void setUsr(JTextField usr) {
		this.usr = usr;
	}


	public JTextField getPasst() {
		return passt;
	}


	public void setPasst(JTextField passt) {
		this.passt = passt;
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
	
	public JFrame getFrame2() {
		return frame2;
	}

	public void setFrame2(JFrame frame2) {
		this.frame2 = frame2;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JButton getContact() {
		return contact;
	}

	public void setContact(JButton contact) {
		this.contact = contact;
	}
	
	public JCheckBox getAdmCheckBox() {
		return admCheckBox;
	}

	public void setAdmCheckBox(boolean a) {
		this.admCheckBox.setEnabled(a);
	}

	
	
	public JFrame getFrame3() {
		return frame3;
	}

	public void setFrame3(JFrame frame3) {
		this.frame3 = frame3;
	}

	public JTextField getTextCC() {
		return textCC;
	}

	public void setTextCC(JTextField textCC) {
		this.textCC = textCC;
	}

	public JTextField getTextProg() {
		return textProg;
	}

	public void setTextProg(JTextField textProg) {
		this.textProg = textProg;
	}

	public JButton getBtnVizC() {
		return btnVizC;
	}

	public void setBtnVizC(JButton btnVizC) {
		this.btnVizC = btnVizC;
	}

	public JButton getBtnCaut() {
		return btnCaut;
	}

	public void setBtnCaut(JButton btnCaut) {
		this.btnCaut = btnCaut;
	}

	public JButton getBtnProg() {
		return btnProg;
	}

	public void setBtnProg(JButton btnProg) {
		this.btnProg = btnProg;
	}

	public JButton getBtnFilC() {
		return btnFilC;
	}

	public void setBtnFilC(JButton btnFilC) {
		this.btnFilC = btnFilC;
	}

	public JButton getBtnVizS() {
		return btnVizS;
	}

	public void setBtnVizS(JButton btnVizS) {
		this.btnVizS = btnVizS;
	}

	public JButton getBtnSlv() {
		return btnSlv;
	}

	public void setBtnSlv(JButton btnSlv) {
		this.btnSlv = btnSlv;
	}

	public JFrame getFrame4() {
		return frame4;
	}

	public void setFrame4(JFrame frame4) {
		this.frame4 = frame4;
	}

	public JButton getBtnSrv() {
		return btnSrv;
	}

	public void setBtnSrv(JButton btnSrv) {
		this.btnSrv = btnSrv;
	}

	public JButton getBtnAdd() {
		return btnAdd;
	}

	public void setBtnAdd(JButton btnAdd) {
		this.btnAdd = btnAdd;
	}

	public JButton getBtnEdit() {
		return btnEdit;
	}

	public void setBtnEdit(JButton btnEdit) {
		this.btnEdit = btnEdit;
	}

	public JButton getBtnDel() {
		return btnDel;
	}

	public void setBtnDel(JButton btnDel) {
		this.btnDel = btnDel;
	}

	public JButton getBtnInfo() {
		return btnInfo;
	}

	public void setBtnInfo(JButton btnInfo) {
		this.btnInfo = btnInfo;
	}

	public JTextField getTextnumeA() {
		return textnumeA;
	}

	public void setTextnumeA(JTextField textnumeA) {
		this.textnumeA = textnumeA;
	}

	public JTextField getTextPass() {
		return textPass;
	}

	public void setTextPass(JTextField textPass) {
		this.textPass = textPass;
	}

	public void setAdmCheckBox(JCheckBox admCheckBox) {
		this.admCheckBox = admCheckBox;
	}

	public void addListenerButon1(ActionListener btNclient1) {
		// TODO Auto-generated method stub
		btNclient.addActionListener(btNclient1);
	}
	
	public void addListenerButon2(ActionListener btnLogin) {
		// TODO Auto-generated method stub
		btnlogin.addActionListener(btnLogin);
	}
	
	
	public void addActionListener(ActionListener l) {
		btNclient.addActionListener(l);
	}

	public void addActionListener3(ActionListener l){  
          
        admCheckBox.setEnabled(true);;
	}
}


	