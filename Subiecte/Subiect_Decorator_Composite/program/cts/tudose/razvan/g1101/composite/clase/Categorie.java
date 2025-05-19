package Subiecte.Subiect_Decorator_Composite.program.cts.tudose.razvan.g1101.composite.clase;

import java.util.ArrayList;
import java.util.List;

//Composite
public class Categorie implements IProdus{
    private String denumire;
    private List<IProdus> copii = new ArrayList<>();

    public Categorie(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void adauga(IProdus produs) {
        copii.add(produs);
    }

    @Override
    public void sterge(IProdus produs) {
        copii.remove(produs);
    }

    @Override
    public int numaraProduse() {
        int count = 0;
        for(IProdus p : copii){
            if(p instanceof Categorie){
                count += ((Categorie) p).numaraProduse();
            }else{
                count += 1;
            }
        }
        return count;
    }

    @Override
    public void afiseaza() {
        afiseazaNivel(0);
    }

    private void afiseazaNivel(int nivel) {
        String indent = "    ".repeat(nivel);
        System.out.println(
                indent + "Categoria: " + denumire +
                        " (Produse totale: " + numaraProduse() + ")"
        );
        for (IProdus p : copii) {
            if (p instanceof Categorie) {
                ((Categorie) p).afiseazaNivel(nivel + 1);
            } else {
                // presupunem că Produs.afiseaza() nu are indent, așa că:
                System.out.println(
                        indent + "    Produs: " +
                                ((Produs) p).getDenumire() +
                                " (Stoc: " + ((Produs) p).getStoc() + ")"
                );
            }
        }
    }
}
