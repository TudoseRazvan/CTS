package clase;

public abstract class Aplicant {
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nrProiecte;
	protected String[] denumireProiect;
	protected static int pragPunctaj = 80;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public int getPunctaj() {
		return punctaj;
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	public int getNrProiecte() {
		return nrProiecte;
	}

	public void setNrProiecte(int nrProiecte) {
		this.nrProiecte = nrProiecte;
	}

	public String[] getDenumireProiect() {
		return denumireProiect;
	}

	public void setDenumireProiect(String[] denumireProiect) {
		this.denumireProiect = denumireProiect;
	}

	public void setDenumireProiecte(int nrProiecte, String[] denumireProiect) {
		this.nrProiecte = nrProiecte;
		this.denumireProiect = new String[this.nrProiecte];
		for (int i = 0; i < this.nrProiecte; i++) {
			this.denumireProiect[i] = denumireProiect[i];
		}
	}

	public static void setPragPunctaj(int pragPunctaj) {
		Aplicant.pragPunctaj = pragPunctaj;
	}

	public String getStatusInProiect() {
		return punctaj > pragPunctaj ? "acceptat" : "respins";
	}

	public void afisareStatus() {
		System.out.println("Aplicantul " + nume + " " + prenume + " a fost " + getStatusInProiect() + ".");
	}

	public Aplicant() {}

	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nrProiecte, String[] denumireProiect) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nrProiecte = nrProiecte;
		this.denumireProiect = denumireProiect;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nume=").append(nume);
		sb.append(", Prenume=").append(prenume);
		sb.append(", Varsta=").append(varsta);
		sb.append(", Punctaj=").append(punctaj);
		sb.append(", Nr_proiecte=").append(nrProiecte);
		sb.append(", Denumire Proiecte=[");
		if (denumireProiect != null) {
			for (int i = 0; i < nrProiecte; i++) {
				sb.append(denumireProiect[i]);
				if (i < nrProiecte - 1) {
					sb.append(", ");
				}
			}
		}
		sb.append("]");
		return sb.toString();
	}
}