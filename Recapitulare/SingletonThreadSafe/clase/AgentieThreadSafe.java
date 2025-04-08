package Recapitulare.SingletonThreadSafe.clase;

public class AgentieThreadSafe {
    private String numeAgentie;
    private float capital;
    private int numarAngajati;

    private static AgentieThreadSafe instanta = null;

    private AgentieThreadSafe(String numeAgentie, float capital, int numarAngajati) {
        this.numeAgentie = numeAgentie;
        this.capital = capital;
        this.numarAngajati = numarAngajati;
    }

    public static synchronized AgentieThreadSafe getInstance(String nume, float capital, int numarAngajati){
        if(instanta == null){
            instanta = new AgentieThreadSafe(nume, capital, numarAngajati);
        }
        return instanta;
    }

    public String getNumeAgentie() {
        return numeAgentie;
    }

    public AgentieThreadSafe setNumeAgentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
        return this;
    }

    public float getCapital() {
        return capital;
    }

    public AgentieThreadSafe setCapital(float capital) {
        this.capital = capital;
        return this;
    }

    public int getNumarAngajati() {
        return numarAngajati;
    }

    public AgentieThreadSafe setNumarAngajati(int numarAngajati) {
        this.numarAngajati = numarAngajati;
        return this;
    }

    public static AgentieThreadSafe getInstanta() {
        return instanta;
    }

    public static void setInstanta(AgentieThreadSafe instanta) {
        AgentieThreadSafe.instanta = instanta;
    }

    @Override
    public String toString() {
        return "AgentieThreadSafe{" +
                "numeAgentie='" + numeAgentie + '\'' +
                ", capital=" + capital +
                ", numarAngajati=" + numarAngajati +
                '}';
    }
}
