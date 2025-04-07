package Extra.ProductPrototype.clase;

public class Telefon extends Produs{
    private boolean esteDualSim;

    public Telefon(String nume, double pret, boolean esteDualSim) {
        super(nume, pret);
        this.esteDualSim = esteDualSim;
    }

    public boolean isEsteDualSim() {
        return esteDualSim;
    }

    public void setEsteDualSim(boolean esteDualSim) {
        this.esteDualSim = esteDualSim;
    }

    @Override
    public Telefon clone() {
        return new Telefon(this.nume, this.pret,this.esteDualSim);
    }

    @Override
    public void detalii() {
        super.detalii();
        System.out.println("Dual SIM: " + (esteDualSim ? "Da": "Nu"));
    }


}
