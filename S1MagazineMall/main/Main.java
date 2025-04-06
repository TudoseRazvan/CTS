package S1MagazineMall.main;

import S1MagazineMall.clase.Magazin;
import S1MagazineMall.clase.MaterialTip;
import S1MagazineMall.builder.MagazinBuilder;
import S1MagazineMall.exceptions.InvalidInputException;

public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("Inregistrare Magazine in mall:");

            //Creare magazin 1 -> magazin simplu cu setari implicite
            Magazin magazin1 = new MagazinBuilder("Carrefour", 500)
                    .cuNumarIntrari(5)
                    .build();
            System.out.println("\nMagazin 1 inregistrat cu succes!:");
            System.out.println(magazin1);

            //Creare magazin 2 -> podea personalizata si decoratiuni
            Magazin magazin2 = new MagazinBuilder("Zara", 250)
                    .cuNumarIntrari(3)
                    .cuPodeaPersonalizata("Parchet", 3)
                    .adaugaDecoratiune("Raft", MaterialTip.LEMN)
                    .adaugaDecoratiune("Suport",MaterialTip.METAL)
                    .adaugaDecoratiune("Vitrina",MaterialTip.STICLA)
                    .build();
            System.out.println("\nMagazin 2 inregistrat cu succes!:");
            System.out.println(magazin2);

            //Creare magazin 3 -> podea moale, fara decoratiuni din sticla
            Magazin magazin3 = new MagazinBuilder("H&M", 300)
                    .cuNumarIntrari(3)
                    .cuPodeaPersonalizata("Mocheta", 1.5)
                    .adaugaDecoratiune("Manechin",MaterialTip.PLASTIC)
                    .adaugaDecoratiune("Perdea",MaterialTip.TEXTIL)
                    .build();
            System.out.println("\nMagazin 3 inregistrat cu succes!");
            System.out.println(magazin3);

            //Testare restrictie numar intrari
            System.out.println("\nIncercare a crea un magazin cu restrictii incalcate:");
            try{
                Magazin magazinInvalid = new MagazinBuilder("Reserved", 275)
                        .cuNumarIntrari(1) //Insuficient pentru 275 mp
                        .build();
            } catch (InvalidInputException e){
                System.out.println("Eroare asteptata: " + e.getMessage());
            }

            //Testare restrictie pentru podea moale cu deoratiuni din sticla
            System.out.println("\nIncercare a crea un magazin cu restrictii incalcate:");
            try{
                Magazin magazinInvalid2 = new MagazinBuilder("Hugo Boss", 200)
                        .cuNumarIntrari(2)
                        .cuPodeaPersonalizata("Mocheta", 1.5) //Podea moale
                        .adaugaDecoratiune("Vitrina",MaterialTip.STICLA) // Insuficient 1.5 pentru sticla
                        .build();
            } catch (InvalidInputException e){
                System.out.println("Eroare asteptata: " + e.getMessage());
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
