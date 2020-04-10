package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.AncestorListener;

import org.jfree.chart.ChartPanel;

import model.Client;
import model.Serviciu;

public class FrameAngajat {
	
	private JFrame frame;//= new JFrame("Angajati");
	private JTextField textNumeClient= new JTextField();
	private JTextField textProg= new JTextField();
	private JTextField textvrst = new JTextField();
	private JButton btnCaut = new JButton("Cautare Client");
	private JButton btnProg = new JButton("Realizeaza Programare");
	private JButton btnFilC = new JButton("Filtrare Clienti");
	private JButton btnVizS = new JButton("Vizualizare Statistici");
	private JButton btnSlv = new JButton("Salvare Rapoarte");
	
	private JButton btnAdaugareClient = new JButton("Adaugare Client");
	private JButton btnEditareClient = new JButton("Editare Client");
	private JButton btnStergereClient = new JButton("Stergere Client");
	private JButton btnAdaugareServiciu = new JButton("Adaugare Serviciu");
	private JButton btnEditareServiciu = new JButton("Editare Serviciu");
	private JButton btnStergereServiciu = new JButton("Stergere Serviciu");
	private JButton btnVizualizareListaServicii = new JButton("Vizualizare lista servicii\r\n");
	private JButton btnActualizareClienti = new JButton("Actualizare Clienti\r\n");
	private JButton btnDelProg = new JButton("Stergere Programare");

	
	private JTextField textdenumire= new JTextField();
	private JTextField textdescriere= new JTextField();
	private JTextField textpret= new JTextField();
	private JTextField textdurata= new JTextField();
	
	private JTable table;
	private JPanel panel2= new JPanel();
	
	
	private JComboBox comboBox = new JComboBox(new String[]
			{
				"VARSTA", "SERVICII PROGRAMATE"
			});
	
	public FrameAngajat() {

		frame = new JFrame("Angajati");
		frame.setResizable(true);
		frame.setBounds(100, 100, 1516, 666);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 222, 173));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		frame.setLocationByPlatform(true);
		
		panel2.setBounds(738, 36, 772, 454);
		panel.add(panel2);
		
		
		btnActualizareClienti.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnActualizareClienti.setBounds(257, 447, 208, 37);
		panel.add(btnActualizareClienti);
		
		
		comboBox.setBounds(10, 496, 226, 37);
		panel.add(comboBox);		
		
		
		btnVizualizareListaServicii.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnVizualizareListaServicii.setBounds(507, 494, 208, 37);
		panel.add(btnVizualizareListaServicii);
		
		btnStergereServiciu.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnStergereServiciu.setBounds(507, 447, 208, 37);
		panel.add(btnStergereServiciu);
		
		btnDelProg.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnDelProg.setBounds(257, 494, 208, 37);
		panel.add(btnDelProg);
		
		btnEditareServiciu.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnEditareServiciu.setBounds(507, 400, 208, 37);
		panel.add(btnEditareServiciu);
		
	
		btnAdaugareServiciu.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnAdaugareServiciu.setBounds(507, 353, 208, 37);
		panel.add(btnAdaugareServiciu);
		
		
		btnStergereClient.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnStergereClient.setBounds(257, 353, 208, 37);
		panel.add(btnStergereClient);
		
		
		btnEditareClient.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnEditareClient.setBounds(10, 400, 208, 37);
		panel.add(btnEditareClient);
		
		
		textdurata.setColumns(10);
		textdurata.setBounds(439, 296, 276, 37);
		panel.add(textdurata);
		
		JLabel lblIntroducetiDurataServiciului = new JLabel("Introduceti durata serviciului:");
		lblIntroducetiDurataServiciului.setForeground(new Color(255, 204, 0));
		lblIntroducetiDurataServiciului.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblIntroducetiDurataServiciului.setBounds(452, 271, 276, 26);
		panel.add(lblIntroducetiDurataServiciului);
		
		
		JLabel lblIntroducetiPretulServiciului = new JLabel("Introduceti pretul serviciului:");
		lblIntroducetiPretulServiciului.setForeground(new Color(255, 204, 0));
		lblIntroducetiPretulServiciului.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblIntroducetiPretulServiciului.setBounds(452, 181, 276, 26);
		panel.add(lblIntroducetiPretulServiciului);
		
		JLabel lblIntroducetiDescriereaServiciului = new JLabel("Introduceti descrierea serviciului:");
		lblIntroducetiDescriereaServiciului.setForeground(new Color(255, 204, 0));
		lblIntroducetiDescriereaServiciului.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblIntroducetiDescriereaServiciului.setBounds(452, 111, 276, 26);
		panel.add(lblIntroducetiDescriereaServiciului);
		
		JLabel lblIntroducetiDenumireaServiciului = new JLabel("Introduceti denumirea serviciului:");
		lblIntroducetiDenumireaServiciului.setForeground(new Color(255, 204, 0));
		lblIntroducetiDenumireaServiciului.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblIntroducetiDenumireaServiciului.setBounds(452, 26, 276, 26);
		panel.add(lblIntroducetiDenumireaServiciului);
		
		textpret.setColumns(10);
		textpret.setBounds(439, 213, 276, 37);
		panel.add(textpret);
		
		textdenumire.setColumns(10);
		textdenumire.setBounds(439, 48, 276, 37);
		panel.add(textdenumire);
		
		textdescriere.setColumns(10);
		textdescriere.setBounds(439, 134, 276, 37);
		panel.add(textdescriere);
		
		
		btnAdaugareClient.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnAdaugareClient.setBounds(10, 353, 208, 37);
		panel.add(btnAdaugareClient);
		
		
		textvrst.setColumns(10);
		textvrst.setBounds(10, 224, 276, 37);
		panel.add(textvrst);
		
		JLabel lblvarsta = new JLabel("Introduceti varsta clientului: ");
		lblvarsta.setForeground(new Color(255, 204, 0));
		lblvarsta.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblvarsta.setBounds(20, 193, 276, 26);
		panel.add(lblvarsta);
		
		JLabel lblVizClienti = new JLabel("Lista clientilor cu programari ");
		lblVizClienti.setForeground(new Color(153, 0, 0));
		lblVizClienti.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblVizClienti.setBounds(950, 0, 307, 37);
		panel.add(lblVizClienti);
		
		
		
		btnFilC.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnFilC.setBounds(10, 447, 208, 37);
		panel.add(btnFilC);
		
		
		
		btnCaut.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnCaut.setBounds(257, 400, 208, 37);
		panel.add(btnCaut);
		
		
		textNumeClient.setBounds(10, 146, 276, 37);
		panel.add(textNumeClient);
		//textNumeClient.setColumns(10);
		
		textProg.setColumns(10);
		textProg.setBounds(10, 296, 276, 37);
		panel.add(textProg);
		

		btnVizS.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnVizS.setBounds(821, 500, 208, 37);
		panel.add(btnVizS);
		
		
		
		btnSlv.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnSlv.setBounds(1201, 500, 208, 37);
		panel.add(btnSlv);
		
		
		JLabel lblCl = new JLabel("Introduceti numele clientului: ");
		lblCl.setForeground(new Color(255, 204, 0));
		lblCl.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblCl.setBounds(20, 123, 276, 26);
		panel.add(lblCl);
		
		JLabel lblProg = new JLabel("Introduceti denumirea programarii: ");
		lblProg.setForeground(new Color(255, 204, 0));
		lblProg.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblProg.setBounds(20, 271, 276, 26);
		panel.add(lblProg);
		

		JLabel ph2 = new JLabel();
		ph2.setIcon(new ImageIcon("C:\\Users\\ade_c\\Desktop\\Facultate\\AN 3\\SEM 2\\PS\\bb.jpg"));
		ph2.setBounds(10, 6, 336, 119);
		panel.add(ph2);
		
		JLabel ph3 = new JLabel();
		ph3.setIcon(new ImageIcon("C:\\Users\\ade_c\\Desktop\\Facultate\\AN 3\\SEM 2\\PS\\fundal2.jpg"));
		ph3.setBounds(0, 0, 1600, 1080);
		panel.add(ph3);
		
		
		frame.setVisible(true);
	}

	
	public JPanel createTable(String[] header, ArrayList<Client> clients)
	{
		
		String[] columns = header;
	
     
        Object[][] data = new Object[clients.size()][header.length];
      
        for(int i=0; i<clients.size(); i++)
        {
        		//data[i][j] = dat[i*4+j];
        		data[i][0] = clients.get(i).getNume();
        		data[i][1] = clients.get(i).getVarsta();
        		data[i][2] = clients.get(i).getProgramare();        		
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


	public JComboBox getComboBox() {
		return comboBox;
	}


	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}


	public JButton getBtnDelProg() {
		return btnDelProg;
	}


	public void setBtnDelProg(JButton btnDelProg) {
		this.btnDelProg = btnDelProg;
	}


	public JTable getTable() {
		return table;
	}


	public void setTable(JTable table) {
		this.table = table;
	}


	public JPanel getPanel2() {
		return panel2;
	}


	public void setPanel2(JPanel panel2) {
		this.panel2 = panel2;
	}


	public String getTextProg() {
		return textProg.getText();
	}


	public JFrame getFrame() {
		return frame;
	}


	public void setFrame(JFrame frame) {
		this.frame = frame;
	}


	public String gettextNumeClient() {
		return textNumeClient.getText();
	}


	public void settextNumeClient(JTextField textCC) {
		this.textNumeClient = textCC;
	}


	public String getProg() {
		return textProg.getText();
	}


	public void setTextProg(JTextField textProg) {
		this.textProg = textProg;
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


	public int getVrst() {
		return Integer.parseInt(textvrst.getText());

	}
	


	public void setVrst(JTextField vrst) {
		this.textvrst = vrst;
	}


	public JButton getBtnAdaugareClient() {
		return btnAdaugareClient;
	}


	public void setBtnAdaugareClient(JButton btnAdaugareClient) {
		this.btnAdaugareClient = btnAdaugareClient;
	}


	public JButton getBtnEditareClient() {
		return btnEditareClient;
	}


	public void setBtnEditareClient(JButton btnEditareClient) {
		this.btnEditareClient = btnEditareClient;
	}


	public JButton getBtnStergereClient() {
		return btnStergereClient;
	}


	public void setBtnStergereClient(JButton btnStergereClient) {
		this.btnStergereClient = btnStergereClient;
	}


	public JButton getBtnAdaugareServiciu() {
		return btnAdaugareServiciu;
	}


	public void setBtnAdaugareServiciu(JButton btnAdaugareServiciu) {
		this.btnAdaugareServiciu = btnAdaugareServiciu;
	}


	public JButton getBtnEditareServiciu() {
		return btnEditareServiciu;
	}


	public void setBtnEditareServiciu(JButton btnEditareServiciu) {
		this.btnEditareServiciu = btnEditareServiciu;
	}


	public JButton getBtnStergereServiciu() {
		return btnStergereServiciu;
	}


	public void setBtnStergereServiciu(JButton btnStergereServiciu) {
		this.btnStergereServiciu = btnStergereServiciu;
	}


	public JButton getBtnVizualizareListaServicii() {
		return btnVizualizareListaServicii;
	}


	public void setBtnVizualizareListaServicii(JButton btnVizualizareListaServicii) {
		this.btnVizualizareListaServicii = btnVizualizareListaServicii;
	}


	public JButton getBtnActualizareClienti() {
		return btnActualizareClienti;
	}


	public void setBtnActualizareClienti(JButton btnActualizareClienti) {
		this.btnActualizareClienti = btnActualizareClienti;
	}


	public String getTextdenumire() {
		return textdenumire.getText();
	}


	public void setTextdenumire(JTextField textdenumire) {
		this.textdenumire = textdenumire;
	}


	public String getTextdescriere() {
		return textdescriere.getText();
	}


	public void setTextdescriere(JTextField textdescriere) {
		this.textdescriere = textdescriere;
	}


	public float getTextpret() {
		return Integer.parseInt(textpret.getText());
	}


	public void setTextpret(JTextField textpret) {
		this.textpret = textpret;
	}


	public int getTextdurata() {
		return Integer.parseInt(textdurata.getText());
	}


	public void setTextdurata(JTextField textdurata) {
		this.textdurata = textdurata;
	}

	public String getTextNumeClient() {
		return textNumeClient.getText();
	}


	public void setTextNumeClient(JTextField textNumeClient) {
		this.textNumeClient = textNumeClient;
	}





	public void addActionListenerbtnCaut(ActionListener l) {
		btnCaut.addActionListener(l);
	}
	
	
	public void addActionListenerbtnProg(ActionListener l) {
		btnProg.addActionListener(l);
	}
	
	public void addActionListenerbtnFil(ActionListener l) {
		btnFilC.addActionListener(l);
	}
	
	public void addActionListenerbtnViz(ActionListener l) {
		btnVizS.addActionListener(l);
	}
	
	public void addActionListenerbtnSlv(ActionListener l) {
		btnSlv.addActionListener(l);
	}
	
	public void addActionListenerbtnAdaugareClient(ActionListener l) {
		btnAdaugareClient.addActionListener(l);
	}
	
	
	public void addActionListenerbtnEditareClient(ActionListener l) {
		btnEditareClient.addActionListener(l);
	}
	
	public void addActionListenerbtnStergereClient(ActionListener l) {
		btnStergereClient.addActionListener(l);
	}


	public void addActionListenerbtnAdaugareServiciu(ActionListener l) {
		btnAdaugareServiciu.addActionListener(l);
	}
	
	public void addActionListenerbtnEditareServiciu(ActionListener l) {
		btnEditareServiciu.addActionListener(l);
	}
	
	public void addActionListenerbtnStergereServiciu(ActionListener l) {
		btnStergereServiciu.addActionListener(l);
	}
	
	public void addActionListenerbtnVizualizareListaServicii(ActionListener l) {
		btnVizualizareListaServicii.addActionListener(l);
	}
	
	public void addActionListenerbtnActualizareClienti(ActionListener l) {
		btnActualizareClienti.addActionListener(l);
	}
	
	
	public void addActionListenerbtnDelProg(ActionListener l) {
		btnDelProg.addActionListener(l);
	}

	
	
}
