package model;

import java.util.ArrayList;

public class PersistentaClienti extends Persistenta{

	public PersistentaClienti(String denumire) {
		super(denumire);
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Client> incarcare(){
		
		ArrayList<Client> clients = new ArrayList<>();
		clients = deserialize();
		
		return clients;
	}

	@SuppressWarnings("unchecked")
	public void salvare(ArrayList<Client> clients){
		
		 serialize(clients);
		
	}
	
	public void addClient(Client c)
	{
		ArrayList<Client> clients = new ArrayList<>();
		clients = incarcare();
		clients.add(c);
		salvare(clients);
	}
	
	
	public void addClient(String numeClient, int varsta, String numeProg)
	{
		PersistentaServicii ps = new PersistentaServicii("serviciu.ser");
		
		ArrayList<Serviciu> servicii = new ArrayList<>();
		
		servicii = ps.incarcare();
		
		
		Serviciu ser = new Serviciu();
		for(Serviciu s: servicii)
		{
			if(s.getDenumire().equals(numeProg))
			{
				ser = s;
			}
		}
		
		ArrayList<Serviciu> programari = new ArrayList<>();
		programari.add(ser);
		
		Client c = new Client(numeClient,varsta,programari);
		
		ArrayList<Client> clients = new ArrayList<>();
		clients = incarcare();
		clients.add(c);
		salvare(clients);
	}
	
	public void editClient(String numeclient, int varsta, String numeProg)
	{
		ArrayList<Serviciu> programari = new ArrayList<>();

		
		PersistentaServicii ps = new PersistentaServicii("serviciu.ser");
		
		ArrayList<Serviciu> servicii = new ArrayList<>();
		
		servicii = ps.incarcare();
		
		
		Serviciu ser = new Serviciu();
		
		
		ArrayList<Client> clients = new ArrayList<>();
		clients = incarcare();
		
		Client cl = new Client();
		
		if(!numeclient.isEmpty())
		{
			if(varsta != 0)
			{
				for(Client c: clients)
				{
					if(c.getNume().equalsIgnoreCase(numeclient))
					{
						cl = c;
					}
				}
				cl.setVarsta(varsta);
			}
			
			
			if(!numeProg.isEmpty())
			{
				for(Serviciu s: servicii)
				{
					if(s.getDenumire().equalsIgnoreCase(numeProg))
					{
						ser = s;
					}
					
				}
				for(Client c: clients)
				{
					if(c.getNume().equals(numeclient))
					{
						programari = cl.getProgramare();
						
						programari.add(ser); 
					
							
					}
				}
			}
		}
		
	
		salvare(clients);
		
	}
	
	public void deleteClient(String numeclient, int varsta, String numeProg)
	{
		
		ArrayList<Client> clients = new ArrayList<>();
		clients = incarcare();
		
		Client cl = new Client();
		
		if((!numeclient.isEmpty()) && (varsta != 0))
		{
			for(Client c: clients)
			{
				if(c.getNume().equalsIgnoreCase(numeclient) && c.getVarsta() == varsta)
				{
					cl = c;
					
				}
			}
			
			clients.remove(cl);
			
		}
		
		
		
		salvare(clients);
	}
	
	public ArrayList<Client> filterClientAge(int varsta)
	{
		ArrayList<Client> clientsAge = new ArrayList<>();
		
		ArrayList<Client> clients = new ArrayList<>();
		clients = incarcare();
		
		Client cl = new Client();
		
		if(varsta != 0)
		{
			for(Client c: clients)
			{
				if(c.getVarsta() == varsta)
				{
					clientsAge.add(c);
				}
			}
			//clientsAge.add(cl);
		}
		
		//salvare(clientsAge);
		
		return clientsAge;
	}

	public ArrayList<Client> filterClientProg( String numeProg)
	{
		ArrayList<Client> clientsProg = new ArrayList<>();
		
		ArrayList<Client> clients = new ArrayList<>();
		clients = incarcare();
		
		Client cl = new Client();
		
		
		for(Client c1:clients)
		{
			for(Serviciu s1: c1.getProgramare())
			if(s1.getDenumire().equalsIgnoreCase(numeProg))
			{
				cl = c1;
				clientsProg.add(c1);
			}
			
		}
		
		return clientsProg;
	}	
	
	public Client searchClient(String numeClient)
	{
		
		ArrayList<Client> clients = new ArrayList<>();
		clients = incarcare();
		
		Client cl = new Client();
		
		for(Client c1:clients)
		{
			if(c1.getNume().equalsIgnoreCase(numeClient))
			{
				cl = c1;
			}
		}
		
		return cl;
	}
	
	
	public void deleteProg(String numeclient,int varsta, String numeProg)
	{
		ArrayList<Serviciu> programari = new ArrayList<>();
		//ArrayList<Serviciu> programari2 = new ArrayList<>();
		
		PersistentaServicii ps = new PersistentaServicii("serviciu.ser");
		
		ArrayList<Serviciu> servicii = new ArrayList<>();
		
		servicii = ps.incarcare();
		
		
		Serviciu ser = new Serviciu();
		
		
		ArrayList<Client> clients = new ArrayList<>();
		clients = incarcare();
		
		Client cl = new Client();
		int ok=0;
		
		if(!numeProg.isEmpty())
		{
			System.out.println("SMT");
			for(Serviciu s: servicii)
			{
				if(s.getDenumire().equalsIgnoreCase(numeProg))
				{
					ser = s;
				}
				
			}
			for(Client c: clients)
			{
				if(c.getNume().equalsIgnoreCase(numeclient) && c.getVarsta() == varsta)
				{
					
					cl = c;
					programari = c.getProgramare();
											
				}
			}
			for(Serviciu s3: programari)
			{
				if(s3.getDenumire().equalsIgnoreCase(numeProg))
				{
					ok=1;
				}
			}
		
			if(ok==1)
			{	
			 
			for ( int i = 0;  i < programari.size(); i++){
		            Serviciu oldName = programari.get(i);
		            if(oldName.getDenumire().equalsIgnoreCase(numeProg))
		            {
		            	programari.remove(i);
		                i--;
		            }
		        }
				
				
				for(Client c: clients)
				{
					if(c.getNume().equals(numeclient) && c.getVarsta() == varsta)
					{
						c.setProgramare(programari);
					}
				}
			}
			
		
		}
		
		salvare(clients);
	}
	
	
	
	
}
