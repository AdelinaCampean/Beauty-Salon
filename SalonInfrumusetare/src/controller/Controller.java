package controller;


import view.FrameAdministrator;
import view.FrameAngajat;
import view.FrameClient;
import view.FrameContact;
import view.FramePrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import jframe.View;
import model.Client;
import model.Persistenta;
import model.PersistentaClienti;
import model.PersistentaFactory;
import model.PersistentaPersoane;
import model.PersistentaServicii;
import model.Persoana;
import model.Serviciu;

public class Controller {

	public FramePrincipal myF;
	public FrameClient myC;
	public FrameAngajat myA;
	public FrameContact myCo;
	public FrameAdministrator myAd;
	private PersistentaFactory pfact = new PersistentaFactory();
	private Persistenta pserv = pfact.createP("serviciu.ser");
	private Persistenta pcl = pfact.createP("clienti.ser");
	private Persistenta pang = pfact.createP("angajati.ser");

	public Controller(FramePrincipal frame) {
		myF = frame;
		myF.addListenerButon1(new btnClient());
		myF.addListenerButon2(new btnLogin());
		myF.addListenerButon3(new btnContact());
		
		}
	
	
	class btnClient implements ActionListener {
		@SuppressWarnings({ "unchecked", "unused" })
		public void actionPerformed(ActionEvent arg0) {

			try {
				ArrayList<Serviciu> serv = new ArrayList<>();
				
				String[] header = new String[] {
						" PROCEDURA ", " DESCRIERE ", "  PRET/LEI "," DURATA/MINUTE " 
				};
				

				serv = ((PersistentaServicii) pserv).incarcare();
				
				
				myC = new FrameClient();
				
				myC.setPanel_1(myC.createTable(header, serv));
				ControllerClient ccc = new ControllerClient(myC);
				
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
				
		}
	}
	

	
	
	class btnLogin implements ActionListener {
		@SuppressWarnings("unchecked")
		public void actionPerformed(ActionEvent arg0) {

			try {
				ArrayList<Client> cl = new ArrayList<>();
				
				String[] header = new String[] {
						" NUME ", " VARSTA "," PROGRAMARE " 
				};
				
			
				cl = ((PersistentaClienti) pcl).incarcare();
				
				
				ArrayList<Persoana> ang = new ArrayList<>();
		
				ang = ((PersistentaPersoane) pang).incarcare();
				
				String usr = myF.getUsr();
				String psw = myF.getPasswordField();
			
				
				
				for(Persoana ad: ang)
				{	
					

					if(ad.getUsername().equalsIgnoreCase(usr) && (ad.getPassword().equalsIgnoreCase(psw)))
					{
						
						if(usr.equalsIgnoreCase("Adriana")&& psw.equalsIgnoreCase("1234")&& ad.getRol().equalsIgnoreCase("administrator"))
						{
							

							myAd = new FrameAdministrator();
							ControllerAdministrator cad = new ControllerAdministrator(myAd);
				
						}
						else 
						{
							
							
							ControllerAngajat can = new ControllerAngajat();
						}
						break;
					}
					
			
				}
				
				
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
				
		}
	}
	
	class btnContact implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {

			try {
			
				

				myCo = new FrameContact();
				
				
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
				
		}
	}
	
}
