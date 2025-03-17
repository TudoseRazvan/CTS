package clase;

import finantare.IFinantare;

public class Elev extends Aplicant implements IFinantare {
	private int clasa;
	private String tutore;
	private static int sumaFinantare = 30;

	public int getClasa() {
		return clasa;
	}

	public void setClasa(int clasa) {
		this.clasa = clasa;
	}

	public String getTutore() {
		return tutore;
	}

	public void setTutore(String tutore) {
		this.tutore = tutore;
	}

	public static void setSumaFinantare(int sumaFinantare) {
		Elev.sumaFinantare = sumaFinantare;
	}

	@Override
	public int getSumaFinantata() {
		return sumaFinantare;
	}

	@Override
	public String getRaportFinantare() {
		return "Elevul " + getNume() + " " + getPrenume() + " primeste " + getSumaFinantata() + " Euro/zi in proiect.";
	}

	public Elev() {
		super();
	}

	public Elev(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}

	@Override
	public String toString() {
		return "Elev: " + super.toString() + ", Clasa=" + clasa + ", Tutore=" + tutore;
	}
}
