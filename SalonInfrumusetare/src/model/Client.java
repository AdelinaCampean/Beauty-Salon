package model;

import java.io.Serializable;
import java.sql.Time;
import java.util.ArrayList;
import java.util.HashMap;

public class Client implements Serializable {
	
	private String nume;
	private int varsta;
	//private Serviciu programare;
	private ArrayList<Serviciu> programare;
	
	private static final long serialVersionUID = 742057913819512906L;
	

	public Client()
	{
		
	}
	public Client(String nume, int varsta, ArrayList<Serviciu> programare)//ArrayList<Serviciu> serviciiProgramate) {
	{
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.programare = programare;
	}
	

	
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public ArrayList<Serviciu> getProgramare() {
		return programare;
	}

	public void setProgramare(ArrayList<Serviciu> programare) {
		this.programare = programare;
	}
	@Override
	public String toString() {
		return  nume + varsta +  programare;
	}
	
	
	
}