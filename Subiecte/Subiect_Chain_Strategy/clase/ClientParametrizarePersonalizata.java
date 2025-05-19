package Subiecte.Subiect_Chain_Strategy.clase;

import java.util.Scanner;

public class ClientParametrizarePersonalizata implements IClient{
    private Scanner scanner;

    public ClientParametrizarePersonalizata() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public ICautare obtineCautare() {
        System.out.println("Alegeti criteriile de cautare:");

        ICautare primulCriteriu = null;
        ICautare ultimulCriteriu = null;

        System.out.print("Doriti cautare dupa pret? (da/nu): ");
        if (scanner.nextLine().equalsIgnoreCase("da")) {
            System.out.print("Introduceti pret maxim: ");
            double pretMaxim = scanner.nextDouble();
            scanner.nextLine();

            CautarePretMic cautarePret = new CautarePretMic(pretMaxim);
            primulCriteriu = cautarePret;
            ultimulCriteriu = cautarePret;
        }

        System.out.print("Doriti cautare dupa marime? (da/nu): ");
        if (scanner.nextLine().equalsIgnoreCase("da")) {
            System.out.print("Introduceti marimea: ");
            String marime = scanner.nextLine();

            CautareMarime cautareMarime = new CautareMarime(marime);

            if (primulCriteriu == null) {
                primulCriteriu = cautareMarime;
                ultimulCriteriu = cautareMarime;
            } else {
                ultimulCriteriu.setUrmatorulCriteriu(cautareMarime);
                ultimulCriteriu = cautareMarime;
            }
        }

        System.out.print("Doriti cautare dupa culoare? (da/nu): ");
        if (scanner.nextLine().equalsIgnoreCase("da")) {
            System.out.print("Introduceti culoarea: ");
            String culoare = scanner.nextLine();

            CautareCuloare cautareCuloare = new CautareCuloare(culoare);

            if (primulCriteriu == null) {
                primulCriteriu = cautareCuloare;
                ultimulCriteriu = cautareCuloare;
            } else {
                ultimulCriteriu.setUrmatorulCriteriu(cautareCuloare);
                ultimulCriteriu = cautareCuloare;
            }
        }

        return primulCriteriu;
    }
}
