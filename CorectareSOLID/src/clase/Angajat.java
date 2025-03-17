package clase;

import finantare.IFinantare;

public class Angajat extends Aplicant implements IFinantare {
	private String ocupatie;
	private int salariu;
	private static int sumaFinantare = 10;

	public String getOcupatie() {
		return ocupatie;
	}

	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}

	public int getSalariu() {
		return salariu;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	public static void setSumaFinantare(int sumaFinantare) {
		Angajat.sumaFinantare = sumaFinantare;
	}

	@Override
	public int getSumaFinantata() {
		return sumaFinantare;
	}

	@Override
	public String getRaportFinantare() {
		return "Angajatul " + getNume() + " " + getPrenume() + " primeste " + getSumaFinantata() + " Euro/zi in proiect.";
	}

	public Angajat() {
		super();
	}

	public Angajat(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect, int salariu, String ocupatie) {
		super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiect);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}

	@Override
	public String toString() {
		return "Angajat: " + super.toString() + ", Ocupatie=" + ocupatie + ", Salariu=" + salariu;
	}
}