package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import model.Persistenta;
import model.PersistentaFactory;
import model.PersistentaPersoane;
import model.PersistentaServicii;
import model.Persoana;
import model.Serviciu;
import view.FrameAdministrator;
import view.FrameAngajat;
import view.FrameClient;
import view.FrameContact;

public class ControllerAdministrator {
	
	private PersistentaFactory pfact = new PersistentaFactory();
	private Persistenta pang = pfact.createP("angajati.ser");
	private Persistenta pserv = pfact.createP("serviciu.ser");

	
	public FrameAdministrator myAd;
	public FrameClient myC;
	public FrameAngajat myA;
	public FrameContact myCo;


	public ControllerAdministrator(FrameAdministrator myAd) {
		super();
		this.myAd = myAd;
		
		myAd.addListenerButonSrv(new btnSrv());
		myAd.addListenerbtnActualizareListaAngajati(new btnActualizareListaAngajati());
		myAd.addListenerbtnAdd(new btnAdd());
		myAd.addListenerbtnDel(new btnDelete());
		myAd.addListenerbtnEdit(new btnEdit());
		myAd.addListenerbtnContact(new btnContact());

	}

	
	class btnSrv implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			try {
				
				ArrayList<Serviciu> serv = new ArrayList<>();
				
				String[] header = new String[] {
						" PROCEDURA ", " DESCRIERE "," DURATA/MINUTE ", "  PRET/LEI " 
				};
				
				
				serv = ((PersistentaServicii) pserv).incarcare();
				
			
				
				myAd.setPanel2(myAd.createTableServicii(header, serv));
				
				
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}	
	}
	
	
	
	class btnActualizareListaAngajati implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			try {
				

				ArrayList<Persoana> ang = new ArrayList<>();
				
				String[] header = new String[] {
						"ID"," USERNAME ", " PASSWORD "
				};
				
				
			
				ang = ((PersistentaPersoane) pang).incarcare();
				
				
				
				myAd.setPanel2(myAd.createTableAngajati(header, ang));
				
				
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}	
	}
	
	class btnAdd implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			try {
				
				int id = myAd.getTextId();
				String username = myAd.getTextNamee();
				String password = myAd.getTextPassw();
				
				ArrayList<Persoana> angajati = new ArrayList<>();
				angajati = ((PersistentaPersoane) pang).incarcare();
				
				int ok=0;
				for(Persoana p:angajati)
				{
					if(p.getId() == id)
				{
						ok=1;
					System.out.println("Exista deja un angajat cu acest id! Va rugam introduceti alt id!");
				}
				}
			if(ok==0)
				
				((PersistentaPersoane) pang).addAngajat(id, username, password);
				
				
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}	
	}
	

	class btnEdit implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			try {
				
				int id = myAd.getTextId();
				String username = myAd.getTextNamee();
				String password = myAd.getTextPassw();
				
				((PersistentaPersoane) pang).updateAngajat(id, username, password);
				
				
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}	
	}
	
	
	class btnDelete implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			try {
				
				int id = myAd.getTextId();
				String username = myAd.getTextNamee();
				String password = myAd.getTextPassw();
				
				((PersistentaPersoane) pang).deleteAngajat(id, username, password);
				
				
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
