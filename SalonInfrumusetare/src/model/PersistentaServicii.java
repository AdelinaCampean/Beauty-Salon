package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PersistentaServicii extends Persistenta{
	
	

	public PersistentaServicii(String denumire) {
		super(denumire);
		// TODO Auto-generated constructor stub
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<Serviciu> incarcare(){
		
		ArrayList<Serviciu> serv = new ArrayList<>();
		serv = deserialize();
		
		return serv;
	}

	@SuppressWarnings("unchecked")
	public void salvare(ArrayList<Serviciu> serv){
		
		 serialize(serv);
		
	}

	public void addService(Serviciu s)
	{
		ArrayList<Serviciu> serv = new ArrayList<>();
		serv = incarcare();
		serv.add(s);
		salvare(serv);
	}

	
	public void addService(String name, String descriere, float tarif, int durata)
	{
		Serviciu s = new Serviciu(name,descriere, tarif, durata);
		ArrayList<Serviciu> serv = new ArrayList<>();
		serv = incarcare();
		serv.add(s);
		salvare(serv);
	}
	
	public void updateService( String name, String descriere, float tarif, int durata)
	{
		ArrayList<Serviciu> servicii = new ArrayList<>();
		servicii = incarcare();
	
		Serviciu se = new Serviciu();
		
		if(!name.isEmpty())
		{
			if(!descriere.isEmpty())
			{
				for(Serviciu s: servicii)
				{
					if(s.getDenumire().equalsIgnoreCase(name))
					{
						s.setDescriere(descriere);
						se =s;

						System.out.println("desc ->"+descriere+"->"+s.getDescriere());
					}
				};
			}	
					
			if(durata != 0)
			{
				for(Serviciu s: servicii)
				{
					if(s.getDenumire().equalsIgnoreCase(name))
					{					
						se =s;
						s.setDurata(durata);
						System.out.println("durata->"+durata+"->"+s.getDurata());
					}
				};
			}
					
			if(tarif != 0)
			{
				
				for(Serviciu s: servicii)
				{
					if(s.getDenumire().equalsIgnoreCase(name))
					{					
						se =s;
						s.setTarif(tarif);
						System.out.println("tarif ->"+tarif+"->"+s.getTarif());
					}
				}
			}
					
		}
		
		else {
			if(!descriere.isEmpty())
			{
				for(Serviciu s: servicii)
				{
					if(s.getDescriere().equalsIgnoreCase(descriere))
					{
						
						
						se = s;
						s.setDenumire(denumire);
						
					}
					
				}
			}
			if(durata != 0)
			{
				for(Serviciu s: servicii)
				{
					if(s.getDescriere().equalsIgnoreCase(descriere))
					{					
						se =s;
						s.setDurata(durata);
					}
				}
			}
					
			if(tarif != 0)
			{
				
				for(Serviciu s: servicii)
				{
					if(s.getDescriere().equalsIgnoreCase(descriere))
					{					
						se =s;
						s.setTarif(tarif);
					}
				}
			}
		}
				
		salvare(servicii);
		
	}
	
	

	/*public void updateService(String name, String descriere, float tarif, int durata)
	{
		ArrayList<Serviciu> serv = new ArrayList<>();
		serv = incarcare();
		
		Serviciu per = new Serviciu();
		
		if(!name.isEmpty())
		{
			if(!descriere.isEmpty())
			{
				for(Serviciu p: serv)
				{
					if(p.getDenumire().equalsIgnoreCase(name))
					{
						per = p;
					}
				}
				per.setDenumire(descriere);
			}
			if(tarif != 0)
			{
				for(Serviciu p: serv)
				{
					if(p.getDenumire().equalsIgnoreCase(name))					{
					{		
						per = p;
					}
					
				}
				per.setTarif(tarif);
			}
			if(durata != 0)
			{
				for(Serviciu p: serv)
				{
					if(p.getDenumire().equalsIgnoreCase(name))
					{
						per = p;
					}
				}
				per.setDurata(durata);
			}
		}
		
	}
		salvare(serv);
		
		
	}
	*/
	
	/*public void deleteService(String nume, String descriere, float tarif, int durata)
	{
		
		ArrayList<Serviciu> pers = new ArrayList<>();
		pers = incarcare();
		Serviciu per = new Serviciu();
		
		for(Serviciu p: pers)
		{
			if(p.getDenumire().equalsIgnoreCase(denumire))
			{
				per = p;
				
			}
		}
		
		pers.remove(per);
		
		salvare(pers);
	}*/
	
	
	public void deleteService( String name, String descriere, float tarif, int durata)
	{
		ArrayList<Serviciu> servicii = new ArrayList<>();
		servicii = incarcare();
		
		Serviciu ss = new Serviciu();
		
		if((!name.isEmpty()) && (!descriere.isEmpty()))
		{
			for(Serviciu s: servicii)
			{
				if((s.getDenumire().equalsIgnoreCase(name)) && (s.getDescriere().equalsIgnoreCase(descriere)))
				{
					ss =s;
					System.out.println("acesta -> "+s.getDenumire());
				}
			}
			servicii.remove(ss);
			for(Serviciu c3:servicii)
			{
				System.out.println("client-> " + c3.getDenumire());
			}
		}
		
		salvare(servicii);	
	}
	
	
	
}
