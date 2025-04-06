package S2ClubSportiv.prototype;

public interface JucatorPrototype {
    JucatorPrototype cloneaza(); //Obligatoriu
    void adaugaAntrenament(String antrenament);
    void adaugaMedicamentInterzis(String medicament);
    void afisareDetalii();
}
