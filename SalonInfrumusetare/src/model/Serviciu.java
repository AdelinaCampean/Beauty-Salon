package model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Serviciu implements Serializable{
	
	private static final long serialVersionUID = 4277484339798027471L;
	
	private String denumire;
	private String descriere;
	private float tarif;
	private int durata;
	
	public Serviciu(String denumire, String descriere, float tarif, int durata) {
		super();
		this.denumire = denumire;
		this.descriere = descriere;
		this.tarif = tarif;
		this.durata = durata;
	}

	public Serviciu()
	{
		
	}
	
	public String getDescriere() {
		return descriere;
	}

	public void setDescriere(String descriere) {
		this.descriere = descriere;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public float getTarif() {
		return tarif;
	}

	public void setTarif(float tarif) {
		this.tarif = tarif;
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}


	

	@Override
	public String toString() {
		return denumire ;//+ descriere+ tarif + durata;
	}
	
	public String toString1() {
		return denumire +","+ descriere +","+ tarif +","+ durata;
	}
}
