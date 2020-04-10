package model;

import java.util.ArrayList;

public class PersistentaPersoane extends Persistenta{

	public PersistentaPersoane(String denumire) {
		super(denumire);
		// TODO Auto-generated constructor stub
	}

	
@SuppressWarnings("unchecked")
public ArrayList<Persoana> incarcare(){
		
		ArrayList<Persoana> pers = new ArrayList<>();
		pers = deserialize();
		
		return pers;
	}

	@SuppressWarnings("unchecked")
	public void salvare(ArrayList<Persoana> ang){
		
		 serialize(ang);
		
	}

	public void addPersoana(Persoana s)
	{
		if(s.getRol().equals("angajat"))
		{
		ArrayList<Persoana> ang = new ArrayList<>();
		ang = incarcare();
		ang.add(s);
		salvare(ang);
		}
		else if(s.getRol().equals("administrator"))
		{
			ArrayList<Persoana> adm = new ArrayList<>();
			adm = incarcare();
			adm.add(s);
			salvare(adm);
			
	    }
		
}
	
	public void addAngajat(int id, String username, String password)
	{
		Persoana s = new Persoana(username, password, id);
		
		ArrayList<Persoana> pers = new ArrayList<>();
		
		pers = incarcare();
		
		pers.add(s);
		
		salvare(pers);
	}
	
	
	public void updateAngajat( int id, String username, String password)
	{
		ArrayList<Persoana> pers = new ArrayList<>();
		pers = incarcare();
		
		Persoana per = new Persoana();
		
		if(id != 0)
		{
			if(!username.isEmpty())
			{
				for(Persoana p: pers)
				{
					if((p.getId() == id))
					{
						per = p;
					}
				}
				per.setUsername(username);
			}
			if(!password.isEmpty())
			{
				for(Persoana p: pers)
				{
					if((p.getId() == id))
					{
						per = p;
					}
				}
				per.setPassword(password);
			}
			if((!username.isEmpty())&&(!password.isEmpty()))
			{
				for(Persoana p: pers)
				{
					if((p.getId() == id))
					{
						per = p;
					}
				}
				per.setPassword(password);
				per.setUsername(username);
			}
		}
		
		salvare(pers);
		
	}
	
	public void deleteAngajat(int id, String username, String password)
	{
		
		ArrayList<Persoana> pers = new ArrayList<>();
		pers = incarcare();
		Persoana per = new Persoana();
		
		for(Persoana p: pers)
		{
			if((p.getId() == id))
			{
				per = p;
				
			}
		}
		
		pers.remove(per);
		
		salvare(pers);
	}
	
	
	
}
