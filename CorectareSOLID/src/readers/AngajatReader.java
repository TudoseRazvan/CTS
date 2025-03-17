package readers;

import clase.Angajat;
import clase.Aplicant;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends AplicantReader {

    @Override
    public List<Aplicant> readData(String fileName) throws FileNotFoundException {
        Scanner input = new Scanner(new File(fileName));
        List<Aplicant> angajati = new ArrayList<>();

        while (input.hasNextLine()) {
            try {
                String line = input.nextLine();
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter(",");

                Angajat angajat = new Angajat();
                super.readAplicant(lineScanner, angajat);
                angajat.setSalariu(lineScanner.nextInt());
                angajat.setOcupatie(lineScanner.next());

                angajati.add(angajat);
                lineScanner.close();
            } catch (Exception e) {
                System.out.println("Eroare la citirea angajatului: " + e.getMessage());
            }
        }

        input.close();
        return angajati;
    }
}