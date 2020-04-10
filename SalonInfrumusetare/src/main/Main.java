package main;

import java.util.ArrayList;

import controller.Controller;
import controller.ControllerClient;
import jframe.View;
import model.Client;
import model.Persistenta;
import model.PersistentaClienti;
import model.PersistentaPersoane;
import model.PersistentaServicii;
import model.Persoana;
import model.Serviciu;
import view.FrameClient;
import view.FramePrincipal;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FramePrincipal v = new FramePrincipal();
		Controller c = new Controller(v);
		
		/*PersistentaPersoane ut = new PersistentaPersoane("angajati.ser");

		ArrayList<Persoana> utilizatori = new ArrayList<>();
		
		Persoana s1 = new Persoana("angajat","Adelina","1234",	3);
		Persoana s2 = new Persoana("angajat","Ioana","12345 ",2);
		Persoana s3 = new Persoana("administrator","Adriana","1234",1);

		
		utilizatori.add(s1);
		utilizatori.add(s2);
		utilizatori.add(s3);
		
		 ((PersistentaPersoane) ut).salvare(utilizatori);
		
		 ArrayList<Persoana> utilizatori1 = new ArrayList<>();
		 utilizatori1 = ut.incarcare();
		
		
		for(Persoana s: utilizatori1)
		{
			System.out.println(s.getUsername());
		}
		
		///////////////
		
		Persistenta pc = new PersistentaClienti("clienti.ser");
		ArrayList<Client> cl = new ArrayList<>();
		
		Serviciu sss = new Serviciu("TRATAMENT"," DE HIDRATARE",	150	,90);
		Serviciu ss2 = new Serviciu("TRATAMENT"," DE CURATARE ",130,90);
		
		Client c1 = new Client("Maria",25,sss);
		Client c2 = new Client("Ioana",45 ,ss2);

		//Angajat s3 = new Angajat("TRATAMENT","OXYGENEO",240,60);
		//Angajat s4 = new Angajat("TRATAMENT","HYDRABEAUTY	",240,60);
		
		//serv.add(s3);
		//serv.add(s4);
		
		cl.add(c1);
		cl.add(c2);
		
		 ((PersistentaClienti) pc).salvare(cl);
		
		 ArrayList<Client> cll = new ArrayList<>();
		cll = ((PersistentaClienti)pc).incarcare();
		
		
		for(Client s: cl)
		{
			System.out.println(s.getNume());
		}
		
		*/
		
		/*Persistenta p = new PersistentaServicii("serviciu.ser");
		ArrayList<Serviciu> serv = new ArrayList<>();
		
		Serviciu se1 = new Serviciu("TRATAMENT DE HIDRATARE","CU MASAJ FACIAL", 150	,90);
		Serviciu se2 = new Serviciu("TRATAMENT DE CURATARE","CREME MASCA",130,90);

		//Serviciu s3 = new Serviciu("TRATAMENT","OXYGENEO",240,60);
		Serviciu s4 = new Serviciu("TRATAMENT HYDRABEAUTY","APARAT",240,60);
		
		//serv.add(s3);
		serv.add(s4);
		
		serv.add(se1);
		serv.add(se2);
		
		 ((PersistentaServicii) p).salvare(serv);
		
		 @SuppressWarnings("unused")
		ArrayList<Serviciu> serv1 = new ArrayList<>();
		serv1 = ((PersistentaServicii)p).incarcare();
		
		for(Serviciu s: serv)
		{
			System.out.println(s.getDenumire());
		}*/
	}
		
	

}
