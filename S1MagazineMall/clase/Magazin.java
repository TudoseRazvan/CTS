package S1MagazineMall.clase;

import S1MagazineMall.builder.MagazinBuilder;

import java.util.ArrayList;
import java.util.List;

public class Magazin {
    private final String denumire;
    private final double suprafata;
    private final int numarIntrari;
    private final PodeaPersonalizata podeaPersonalizata;
    private final List<Decoratiune> decoratiuni;

    // Constructor package-private pentru acces din builder
    // Adăugăm setarea ca fiind public pentru a permite accesul din alt pachet
    public Magazin(MagazinBuilder builder) {
        this.denumire = builder.getDenumire();
        this.suprafata = builder.getSuprafata();
        this.numarIntrari = builder.getNumarIntrari();
        this.podeaPersonalizata = builder.getPodeaPersonalizata();
        this.decoratiuni = new ArrayList<>(builder.getDecoratiuni());
    }

    public double calculGradIncendiu(){
        double gradIncendiu = 0;

        //Calculam gradul de incendiu bazat pe duritatea podelei
        if(podeaPersonalizata != null){
            gradIncendiu += podeaPersonalizata.getDuritate() * 0.5;
        }
        else {
            gradIncendiu += 1.0; //Podea standard
        }

        //Factori de risc in functie de materialele decoratiunilor
        for(Decoratiune decoratiune : decoratiuni){
            switch (decoratiune.getMaterial()){
                case LEMN:
                    gradIncendiu += 2.0;
                    break;
                case TEXTIL:
                    gradIncendiu += 1.5;
                    break;
                case PLASTIC:
                    gradIncendiu += 1.8;
                    break;
                case METAL:
                    gradIncendiu += 0.5;
                    break;
                case STICLA:
                    gradIncendiu += 0.3;
                    break;
            }
        }

        return gradIncendiu;
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "denumire='" + denumire + '\'' +
                ", suprafata=" + suprafata +
                ", numarIntrari=" + numarIntrari +
                ", podeaPersonalizata=" + podeaPersonalizata +
                ", decoratiuni=" + decoratiuni +
                ", gradIncendiu" + calculGradIncendiu() +
                '}';
    }
}
