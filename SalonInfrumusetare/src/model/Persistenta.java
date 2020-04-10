package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Persistenta<T> implements Serializable {
	
	protected String denumire;

	
	
	public Persistenta(String denumire) {
		super();
		this.denumire = denumire;
	}

	public Persistenta()
	{
		
	}
	

	public void serialize(ArrayList<T> s)
	{
		try {
			FileOutputStream o = new FileOutputStream(this.denumire);
			ObjectOutputStream out = new ObjectOutputStream(o);
	         out.writeObject(s);
	         out.close();
	         o.close();
	         System.out.printf("Serialized data is saved\n");
		}
		catch (IOException i) {
	         i.printStackTrace();
	      }
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<T> deserialize() {
		
		try
		{
			FileInputStream i = new FileInputStream(this.denumire);
			ObjectInputStream in = new ObjectInputStream(i);
			ArrayList<T> s = (ArrayList<T>) in.readObject();
	         in.close();
	         i.close();
	         return s;
		}
		catch (IOException i) {
	         i.printStackTrace();
	         return null;
	      } catch (ClassNotFoundException c) {
	         System.out.println("Class not found!");
	         c.printStackTrace();
	         return null;
	      }
	}

	
	
}
