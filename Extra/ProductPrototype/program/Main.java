package Extra.ProductPrototype.program;

import Extra.ProductPrototype.clase.Laptop;
import Extra.ProductPrototype.clase.Telefon;

public class Main {
    public static void main(String[] args) {
        Laptop laptopOriginal = new Laptop("Laptop HP", 3500.75, "Windows 11");
        System.out.println("Laptop Original: ");
        laptopOriginal.detalii();

        //Clonarea laptopului
        Laptop laptopClonat = laptopOriginal.clone();
        System.out.println("\nLaptop Clonat:");
        laptopClonat.detalii();

        Telefon telefonOriginal = new Telefon("iPhone 13",4500.50, true);
        System.out.println("\nTelefon Original:");
        telefonOriginal.detalii();

        Telefon telefonClonat = telefonOriginal.clone();
        System.out.println("\nTelefon Clonat:");
        telefonClonat.detalii();

        telefonClonat.setNume("Iphone 14");
        telefonClonat.setPret(5000.00);
        telefonClonat.setEsteDualSim(false);

        System.out.println("\nTelefon Clonat Dupa Modficari:");
        telefonClonat.detalii();

    }
}
