package SubiecteAI.ChainOfResponsibility.clase;

public class Request {
    private int id;
    private String descriere;
    private float costEstimativ;

    public Request(int id, String descriere, float costEstimativ) {
        this.id = id;
        this.descriere = descriere;
        this.costEstimativ = costEstimativ;
    }

    public int getId() {
        return id;
    }

    public String getDescriere() {
        return descriere;
    }

    public float getCostEstimativ() {
        return costEstimativ;
    }
}
