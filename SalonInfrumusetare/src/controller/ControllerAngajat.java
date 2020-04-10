package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.jfree.ui.RefineryUtilities;

import model.BuilderStatistica;
import model.Client;
import model.Persistenta;
import model.PersistentaClienti;
import model.PersistentaFactory;
import model.PersistentaServicii;

import model.Serviciu;
import model.Statistici;
import view.FrameAngajat;
import view.FrameClient;
import view.FrameStatistic;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;


import java.beans.XMLEncoder;
import java.beans.XMLDecoder;



public class ControllerAngajat {

	private PersistentaFactory pfact = new PersistentaFactory();
	private Persistenta pserv = pfact.createP("serviciu.ser");
	private Persistenta pcl = pfact.createP("clienti.ser");
	
	public FrameAngajat myA;
	public FrameClient myC;



	public ControllerAngajat() {
		super();
		myA = new FrameAngajat() ;
		
		myA.addActionListenerbtnCaut(new btnSearch());
		myA.addActionListenerbtnFil(new btnFill());
		myA.addActionListenerbtnProg(new btnProg());
		myA.addActionListenerbtnSlv(new btnSalvareRapoarte());
		myA.addActionListenerbtnActualizareClienti(new btnActualizareClienti());
		myA.addActionListenerbtnAdaugareClient(new btnAdaugareClient());
		myA.addActionListenerbtnAdaugareServiciu(new btnAdaugareServiciu());
		myA.addActionListenerbtnEditareClient(new btnEditareClient());
		myA.addActionListenerbtnEditareServiciu(new btnEditareServiciu());
		myA.addActionListenerbtnStergereClient(new btnStergereClient());
		myA.addActionListenerbtnStergereServiciu(new btnStergereServiciu());
		myA.addActionListenerbtnVizualizareListaServicii(new btnVizualizareListaServicii());
		myA.addActionListenerbtnDelProg(new btnDeleteProg());
		myA.addActionListenerbtnViz(new btnVizualizareStatistici());
		
	}
	
	class btnVizualizareStatistici implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			try {
				FrameStatistic myFS = new FrameStatistic();
				BuilderStatistica procVarsta = new BuilderStatistica();
				Statistici stVarsta = procVarsta.createSt("Procente dupa varsta");
				myFS.metoda1(stVarsta.createDemoPanel());
				
				BuilderStatistica stsProg = new BuilderStatistica();
				Statistici stProg = stsProg.createSt( "Procente dupa varsta" );
				myFS.metoda2(stProg.createDemoPanelProg());
				
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}	
	}
	
	class btnSalvareRapoarte implements ActionListener {

		@SuppressWarnings("unchecked")
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			try {
				
				 //JSON FILE
					
					ArrayList<Serviciu> servicii = new ArrayList<>();

					JSONObject object = new JSONObject();
					
					servicii = ((PersistentaServicii) pserv).incarcare();
					
					JSONArray servJ = new JSONArray();
					
					for(Serviciu s: servicii)
					{
						JSONObject obj = new JSONObject();
						
						obj.put("Denumire",s.getDenumire());
						obj.put("Descriere",s.getDescriere());
						obj.put("Pret",s.getTarif()+"");
						obj.put("Durata",s.getDurata()+"");
						servJ.add(obj);

					}
					
					try(FileWriter file = new FileWriter("Servicii.json"))
					{
						
						file.write(servJ.toJSONString());
						file.flush();
					}
					catch(IOException ex)
					{
						ex.printStackTrace();
					}
	                
					
					//CSV
					
					PrintWriter pw = new PrintWriter(new File("Servicii.csv"));
					StringBuilder sb = new StringBuilder();
					
					for(Serviciu s: servicii)
					{
						sb.append(s.getDenumire());
						sb.append(",");
						sb.append(s.getDescriere());
						sb.append(",");
						sb.append(s.getTarif());
						sb.append(",");
						sb.append(s.getDurata());
						sb.append("\n");

					}
	               pw.write(sb.toString());
	               pw.close();
				
	               
	               //XML
	               
	            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
	       		DocumentBuilder docBuilder = docFactory.newDocumentBuilder(); 
	               
	       		Document doc = docBuilder.newDocument();
	    		Element rootElement = doc.createElement("Servicii");
	    		//doc.appendChild(rootElement);
	    		
	    		Element mainElement = doc.createElement("Serviciu");
	    		
	    		rootElement.appendChild(mainElement);
    			
    			doc.appendChild(rootElement);
	    		
	    		for(Serviciu s: servicii)
	    		{

		    		mainElement.setAttribute("Denumire",s.getDenumire());
		    		
		    		
		    		Element descriere = doc.createElement("Descriere");
		    		descriere.appendChild(doc.createTextNode(s.getDescriere()));
		    		mainElement.appendChild(descriere);

		    		
		    		Element lastname = doc.createElement("Pret");
		    		lastname.appendChild(doc.createTextNode(s.getTarif()+""));
		    		mainElement.appendChild(lastname);

		    		
		    		Element nickname = doc.createElement("Durata");
		    		nickname.appendChild(doc.createTextNode(s.getDurata()+""));
		    		mainElement.appendChild(nickname);
		    		
	    		}
	    		
	    		TransformerFactory transformerFactory = TransformerFactory.newInstance();
	    		Transformer transformer = transformerFactory.newTransformer();
	    		DOMSource source = new DOMSource(doc);
	    		StreamResult result = new StreamResult(new File("Servicii.xml"));

	    	
	    		transformer.transform(source, result);

	    		System.out.println("Fisierele sunt salvate!");
	    		
	               
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}	
	}
	
	class btnSearch implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			try {
				
				String[] header = new String[] {
						" NUME "," VARSTA ", " PROGRAMARE "
				};
				
				
				Client client = new Client();
				
				String nume = myA.getTextNumeClient();
				
				client = ((PersistentaClienti) pcl).searchClient(nume);
				
				ArrayList<Client> clients = new ArrayList<>();
				
				clients.add(client);
				
				myA.setPanel2(myA.createTable(header, clients));
				
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}	
	}
	
	class btnFill implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			try {
				
				String[] header = new String[] {
						" NUME "," VARSTA ", " PROGRAMARE "
				};
				
				
				ArrayList<Client> clients = new ArrayList<>();
				
				String prog = myA.getProg();
				
				
				
				String combo1 = myA.getComboBox().getSelectedItem().toString();
				
				if (combo1.equalsIgnoreCase("VARSTA"))
				{
					int varsta = myA.getVrst();
					clients = ((PersistentaClienti) pcl).filterClientAge(varsta);
				
				}
				else if(combo1.equalsIgnoreCase("SERVICII PROGRAMATE"))
				{
					clients = ((PersistentaClienti) pcl).filterClientProg(prog);
				}
					myA.setPanel2(myA.createTable(header, clients));
				
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}	
	}
	
	
	class btnProg implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			try {
				
				String numeProg = myA.getProg();
				String numeclient = myA.getTextNumeClient();	
				int varsta = myA.getVrst();
				
				
				ArrayList<Serviciu> servicii = new ArrayList<>();
				
				servicii = ((PersistentaServicii) pserv).incarcare();
				
				
				Serviciu ser = new Serviciu();
				for(Serviciu s: servicii)
				{
					if(s.getDenumire().equals(numeProg))
					{
						ser = s;
					}
				}
				if(!servicii.contains(numeProg))
					System.out.println("Acest serviciu nu exista!");
				
				
				ArrayList<Client> clients = new ArrayList<>();
				
				clients = ((PersistentaClienti) pcl).incarcare();
				
				
				Client cl = new Client();
				for(Client c: clients)
				{
					if(c.getNume().equals(numeclient))
					{
						cl = c;
					}
					else {
						System.out.println("Clientul nu este inregistrat! Va rugam adaugati clientul!");
					}
				}
				
				ArrayList<Serviciu> prog = new ArrayList<>();
				prog = cl.getProgramare();
				prog.add(ser);
				cl.setProgramare(prog);
				
				((PersistentaClienti) pcl).salvare(clients);
				
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}	
	}
	
	class btnDeleteProg implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			try {
				
				String numeProg = myA.getProg();
				String numeclient = myA.getTextNumeClient();
				int varsta = myA.getVrst();
				
				((PersistentaClienti) pcl).deleteProg(numeclient,varsta, numeProg);
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}	
	}
	
	class btnAdaugareClient implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			try {
				
				String numeProg = myA.getProg();
				String numeclient = myA.getTextNumeClient();	
				int varsta = myA.getVrst();
				
				if(varsta>10 && varsta <100)
			
				((PersistentaClienti) pcl).addClient(numeclient,varsta,numeProg);
				else 
					System.out.println("Persoana nu are o varsta corespunzatoare serviciilor!");
				
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}	
	}
	
	class btnEditareClient implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			try {
				String numeProg = myA.getProg();
				String numeclient = myA.getTextNumeClient();	
				int varsta = myA.getVrst();
				
				if(varsta>10 && varsta <100)
				
				((PersistentaClienti) pcl).editClient(numeclient, varsta, numeProg);
				else
				{
					System.out.println("Persoana nu are o varsta corespunzatoare serviciilor!");
				}
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}	
	}
	
	class btnStergereClient implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			try {
				
				String numeProg = myA.getProg();
				String numeclient = myA.getTextNumeClient();	
				int varsta = myA.getVrst();
				
				
				((PersistentaClienti) pcl).deleteClient(numeclient, varsta, numeProg);
				
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}	
	}
	
	class btnAdaugareServiciu implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			try {
				
				String name = myA.getTextdenumire();
				String descriere = myA.getTextdescriere();
				float tarif = myA.getTextpret();
				int durata = myA.getTextdurata();
				
				
				((PersistentaServicii) pserv).addService(name, descriere, tarif, durata);
				
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}	
	}
	
	class btnEditareServiciu implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			try {
				String name = myA.getTextdenumire();
				String descriere = myA.getTextdescriere();
				float tarif = myA.getTextpret();
				int durata = myA.getTextdurata();
				
				
				
				((PersistentaServicii) pserv).updateService(name, descriere, tarif, durata);
				
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}	
	}
	
	class btnStergereServiciu implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			try {
				String name = myA.getTextdenumire();
				String descriere = myA.getTextdescriere();
				float tarif = myA.getTextpret();
				int durata = myA.getTextdurata();
				
				
				((PersistentaServicii) pserv).deleteService(name, descriere, tarif, durata);
				
				
				
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}	
	}
	
	class btnVizualizareListaServicii implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			try {
				
				ArrayList<Serviciu> servicii = new ArrayList<>();
				
				String[] header = new String[] {
						" PROCEDURA ", " DESCRIERE ", "  PRET/LEI ", " DURATA/MINUTE " 
				};
				
				
			
				servicii = ((PersistentaServicii) pserv).incarcare();
				
				
				
				myA.setPanel2(myA.createTableServicii(header, servicii));

			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}	
	}
	
	class btnActualizareClienti implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			try {
				
				
				ArrayList<Client> clients = new ArrayList<>();
				
				String[] header = new String[] {
						" NUME "," VARSTA ", " PROGRAMARE "
				};
				
				
			
				clients = ((PersistentaClienti) pcl).incarcare();
				
				
				
				
				myA.setPanel2(myA.createTable(header, clients));

				
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}	
	}
}
