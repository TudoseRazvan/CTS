package Recapitulare.SingletonCuptor.clase;

import java.util.ArrayList;
import java.util.List;

public class Cuptor {
    private List<Preparat> listaAsteptare;
    private int nrMaximeGrade;

    private static Cuptor instance = new Cuptor();

    private Cuptor(){
        this.nrMaximeGrade = 270;
        this.listaAsteptare = new ArrayList<>();
    }

    public static synchronized Cuptor getInstance(){
        if(instance == null){
            instance = new Cuptor();
        }
        return instance;
    }

    public void addPreparat(Preparat p){
        if(p != null){
            if(p.getNrGradeGatire() > this.nrMaximeGrade){
                System.out.println("Nu se poate prepara. Nu suporta atatea grade.");
            }else{
                this.listaAsteptare.add(p);
            }
        }else{
            System.out.println("Adaugati un preparat valid");
        }
    }

    public void afisarePreparate(){
        for(Preparat p : listaAsteptare){
            System.out.println(p);
        }
    }


}
