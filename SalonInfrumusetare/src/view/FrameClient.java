package view;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.Client;
import model.Persistenta;
import model.Serviciu;

public class FrameClient {
	
	private JFrame frame; //panel
	private JTable table;
	private JButton btncont = new JButton("CONTACT");
	private JPanel panel_1 = new JPanel();
	
	public FrameClient()//String[] header,ArrayList<Serviciu> serv)
	{
		
		frame=new JFrame("Lista de servicii");
		frame.setResizable(false);
		frame.setBounds(100, 100, 1176, 768);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setTitle("Contact");
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
	
		panel_1.setBounds(20, 127, 1105, 517);
		panel_1.setVisible(false);
		panel.add(panel_1);
		

        /*String[] columns = header;
      
        String[] dat = serv.toString().split(">");
        for(String a:dat)
        {
        	System.out.println(a);
        }
       System.out.println("size"+serv.size());
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
		panel_1.add(new JScrollPane(table)); 
		
		*/
		
	
		
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
		
		//JButton btncont = new JButton("CONTACT");
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
		

	public JPanel createTable(String[] header, ArrayList<Serviciu> serv)
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
		panel_1.removeAll();
		panel_1.setLayout(new BorderLayout());
		panel_1.add(scroll); 
		panel_1.setPreferredSize(new Dimension(700,300));
		panel_1.setVisible(true);
		panel_1.revalidate();
		return panel_1;
	}
	public JPanel getPanel_1() {
		return panel_1;
	}


	public void setPanel_1(JPanel panel_1) {
		this.panel_1 = panel_1;
	}


	public JFrame getFrame() {
		return frame;
	}



	public void setFrame(JFrame frame) {
		this.frame = frame;
	}



	public JTable getTable() {
		return table;
	}
	


	public void setTable(JTable s) {
		this.table = s;
	}



	public JButton getBtncont() {
		return btncont;
	}



	public void setBtncont(JButton btncont) {
		this.btncont = btncont;
	}
	
	

	public void addListenerButon1(ActionListener btncontact1) {
		btncont.addActionListener(btncontact1);
	}

	
}
