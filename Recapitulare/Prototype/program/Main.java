package Recapitulare.Prototype.program;

import Recapitulare.Prototype.clase.Adresa;
import Recapitulare.Prototype.clase.Client;

public class Main {
    public static void main(String[] args) {
        try{
            Adresa adresa = new Adresa("Strada Mare",10);
            Client client1 = new Client("Ana", adresa);

            Client client2 = (Client) client1.clone();

            System.out.println("Original: " + client1);
            System.out.println("Clone: " + client2);

            client2.setAdresa(new Adresa("Strada Noua", 99));

            System.out.println("\nDupă modificarea clonei:");
            System.out.println("Original: " + client1);
            System.out.println("Clone:    " + client2);

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
