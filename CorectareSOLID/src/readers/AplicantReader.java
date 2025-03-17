package readers;

import clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantReader implements IReadable<Aplicant> {

    protected void readAplicant(Scanner scanner, Aplicant aplicant) {
        String nume = scanner.next();
        String prenume = scanner.next();
        int varsta = scanner.nextInt();
        int punctaj = scanner.nextInt();

        int nrProiecte = scanner.nextInt();
        String[] denumiriProiecte = new String[nrProiecte];
        for (int i = 0; i < nrProiecte; i++) {
            denumiriProiecte[i] = scanner.next();
        }

        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setDenumireProiecte(nrProiecte, denumiriProiecte);
    }

    public abstract List<Aplicant> readData(String fileName) throws FileNotFoundException;
}
