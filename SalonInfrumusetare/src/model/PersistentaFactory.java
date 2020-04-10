package model;

public class PersistentaFactory extends Persistenta {

	public PersistentaFactory(String denumire) {
		super(denumire);
		// TODO Auto-generated constructor stub
	}

	public PersistentaFactory()
	{
		
	}
	
	public Persistenta createP (String denumire)
	{
		Persistenta p = new Persistenta();
		
		if(denumire.equals("serviciu.ser"))
		{
			p = new PersistentaServicii("serviciu.ser");
		}
		else if(denumire.equals("angajati.ser"))
		{
			p = new PersistentaPersoane("angajati.ser");
		}
		else if(denumire.equals("clienti.ser"))
		{
			p = new PersistentaClienti("clienti.ser");
		}
		
		return p;
	}
	
}
