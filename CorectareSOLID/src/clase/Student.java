package clase;

import finantare.IFinantare;

public class Student extends Aplicant implements IFinantare {
	private String facultate;
	private int anStudii;
	private static int sumaFinantare = 20;

	public String getFacultate() {
		return facultate;
	}

	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}

	public int getAnStudii() {
		return anStudii;
	}

	public void setAnStudii(int anStudii) {
		this.anStudii = anStudii;
	}

	public static void setSumaFinantare(int sumaFinantare) {
		Student.sumaFinantare = sumaFinantare;
	}

	@Override
	public int getSumaFinantata() {
		return sumaFinantare;
	}

	@Override
	public String getRaportFinantare() {
		return "Studentul " + getNume() + " " + getPrenume() + " primeste " + getSumaFinantata() + " Euro/zi in proiect.";
	}

	public Student() {
		super();
	}

	public Student(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect, String facultate, int anStudii) {
		super(nume, prenume, varsta, punctaj, nrProiecte, denumireProiect);
		this.facultate = facultate;
		this.anStudii = anStudii;
	}

	@Override
	public String toString() {
		return "Student: " + super.toString() + ", Facultate=" + facultate + ", An_studii=" + anStudii;
	}
}
