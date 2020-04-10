package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import model.Client;
import model.Persoana;
import model.Serviciu;

public class FrameAdministrator {

	private JFrame frame;
	private JButton btnSrv = new JButton("Vizualizare servicii cu tarife");
	private JButton btnAdd = new JButton("Adaugare Angajat");
	private JButton btnEdit = new JButton("Editeaza angajat");
	private JButton btnDel = new JButton("Sterge Angajat");
	private JButton btnContact = new JButton("Vizualizare Informatii de Contact");

	private JTextField textId = new JTextField();

	private JLabel lblName = new JLabel("Adaugati o parola pentru angajat:");
	private JTable table;
	private JButton btnActualizareListaAngajati = new JButton("Actualizare lista angajati");
	private JPanel panel2= new JPanel();
	private JTextField textPassw  = new JTextField();
	private JTextField textNamee = new JTextField();

	public FrameAdministrator() {
		frame=new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1306, 689);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(173, 255, 47));
		panel.setBounds(0, 0, 755, 603);
	
		panel.setLayout(null);
		
		btnContact.setForeground(new Color(0, 100, 0));
		btnContact.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnContact.setBounds(126, 557, 372, 47);
		panel.add(btnContact);
		
		btnActualizareListaAngajati.setForeground(new Color(0, 100, 0));
		btnActualizareListaAngajati.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnActualizareListaAngajati.setBounds(338, 478, 240, 47);
		
		panel.add(btnActualizareListaAngajati);
		
		
		panel2.setBounds(605, 52, 687, 506);
		
		panel.add(panel2);

		lblName.setForeground(new Color(255, 204, 0));
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblName.setBounds(37, 360, 274, 25);
		
		panel.add(lblName);
		
		textPassw.setColumns(10);
		textPassw.setBounds(37, 395, 260, 40);
		panel.add(textPassw);
		
		JLabel lblPassw = new JLabel("Introduceti numele angajatului: ");
		lblPassw.setForeground(new Color(255, 204, 0));
		lblPassw.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblPassw.setBounds(37, 258, 260, 25);
		panel.add(lblPassw);
		
		textNamee.setColumns(10);
		textNamee.setBounds(37, 293, 260, 40);
		panel.add(textNamee);
		
		JLabel lbltable = new JLabel("Lista Angajati");
		lbltable.setForeground(new Color(153, 0, 51));
		lbltable.setBackground(Color.WHITE);
		lbltable.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lbltable.setBounds(790, 10, 254, 34);
		panel.add(lbltable);
		
		
		textId.setBounds(37, 195, 260, 40);
		panel.add(textId);
		textId.setColumns(10);
		
		JLabel lblId = new JLabel("Introduceti ID-ul angajatului:");
		lblId.setForeground(new Color(255, 204, 0));
		lblId.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblId.setBounds(37, 160, 240, 25);
		panel.add(lblId);
		
		
		btnSrv.setForeground(new Color(0, 100, 0));
		btnSrv.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnSrv.setBounds(37, 478, 260, 47);
		panel.add(btnSrv);
		
		
		btnAdd.setForeground(new Color(0, 100, 0));
		btnAdd.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnAdd.setBounds(338, 193, 188, 40);
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
	
	
	public JPanel createTableAngajati(String[] header, ArrayList<Persoana> clients)
	{
	
		String[] columns = header;
	
     
        Object[][] data = new Object[clients.size()][header.length];
      
        for(int i=0; i<clients.size(); i++)
        {
        		//data[i][j] = dat[i*4+j];
        		data[i][0] = clients.get(i).getId();
        		data[i][1] = clients.get(i).getUsername();
        		data[i][2] = clients.get(i).getPassword();        		
        }
		
        
        table = new JTable(data, columns);
        table.setBackground(Color.PINK);
		table.setForeground(new Color(204, 0, 51));
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setFillsViewportHeight(true);
		table.setSurrendersFocusOnKeystroke(true);
		table.setBounds(658, 60, 809, 562);
		JScrollPane scroll = new JScrollPane(table);
		panel2.removeAll();
		panel2.setLayout(new BorderLayout());
		panel2.add(scroll); 
		panel2.setPreferredSize(new Dimension(700,300));
		panel2.setVisible(true);
		panel2.revalidate();
		
		
		return panel2;
	}
	
	public JPanel createTableServicii(String[] header, ArrayList<Serviciu> serv)
	{
		
	
		String[] columns = header;
	    
	  
	    Object[][] data = new Object[serv.size()][header.length];
	  
	    for(int i=0; i<serv.size(); i++)
	    {
	    	for(int j=0; j<header.length; j++)
	    	{
	    		
	    		//data[i][j] = dat[i*4+j];
	    		data[i][0] = ( serv.get(i)).getDenumire();
	        	data[i][1] = ( serv.get(i)).getDescriere();
	        	data[i][2] = ( serv.get(i)).getTarif();
	        	data[i][3] = ( serv.get(i)).getDurata();
	    		
	    	}
	    
	    }
	    
	    //create table with data
	    
	    table = new JTable(data, columns);
	    table.setBackground(Color.PINK);
		table.setForeground(new Color(204, 0, 51));
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setFillsViewportHeight(true);
		table.setSurrendersFocusOnKeystroke(true);
		table.setBounds(20, 127, 1105, 517);
		JScrollPane scroll = new JScrollPane(table);
		panel2.removeAll();
		panel2.setLayout(new BorderLayout());
		panel2.add(scroll); 
		panel2.setPreferredSize(new Dimension(700,300));
		panel2.setVisible(true);
		panel2.revalidate();
		return panel2;
	}

	
	
	public JButton getBtnContact() {
		return btnContact;
	}


	public void setBtnContact(JButton btnContact) {
		this.btnContact = btnContact;
	}


	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
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


	
	public int getTextId() {
		return Integer.parseInt(textId.getText());
	}


	public void setTextId(JTextField textId) {
		this.textId = textId;
	}


	public JLabel getLblName() {
		return lblName;
	}


	public void setLblName(JLabel lblName) {
		this.lblName = lblName;
	}


	public JTable getTable() {
		return table;
	}


	public void setTable(JTable table) {
		this.table = table;
	}


	public JButton getBtnActualizareListaAngajati() {
		return btnActualizareListaAngajati;
	}


	public void setBtnActualizareListaAngajati(JButton btnActualizareListaAngajati) {
		this.btnActualizareListaAngajati = btnActualizareListaAngajati;
	}


	public JPanel getPanel2() {
		return panel2;
	}


	public void setPanel2(JPanel panel2) {
		this.panel2 = panel2;
	}


	public String getTextPassw() {
		return textPassw.getText();
	}


	public void setTextPassw(JTextField textPassw) {
		this.textPassw = textPassw;
	}


	public String getTextNamee() {
		return textNamee.getText();
	}


	public void setTextNamee(JTextField textNamee) {
		this.textNamee = textNamee;
	}


	
	public void addListenerButonSrv(ActionListener btnS1) {
		btnSrv.addActionListener(btnS1);
	}
	
	public void addListenerbtnDel(ActionListener btnInfo1) {
		btnDel.addActionListener(btnInfo1);
	}
	
	public void addListenerbtnAdd(ActionListener btnS1) {
		btnAdd.addActionListener(btnS1);
	}
	
	public void addListenerbtnEdit(ActionListener btnS1) {
		btnEdit.addActionListener(btnS1);
	}
	
	public void addListenerbtnActualizareListaAngajati(ActionListener btnS1) {
		btnActualizareListaAngajati.addActionListener(btnS1);
	}

	

	public void addListenerbtnContact(ActionListener btnS1) {
		btnContact.addActionListener(btnS1);
	}
	
}
