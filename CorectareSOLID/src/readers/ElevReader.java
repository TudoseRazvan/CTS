package readers;

import clase.Aplicant;
import clase.Elev;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends AplicantReader {

    @Override
    public List<Aplicant> readData(String fileName) throws FileNotFoundException {
        Scanner input = new Scanner(new File(fileName));
        List<Aplicant> elevi = new ArrayList<>();

        while (input.hasNextLine()) {
            try {
                String line = input.nextLine();
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter(",");

                Elev elev = new Elev();
                super.readAplicant(lineScanner, elev);
                elev.setClasa(lineScanner.nextInt());
                elev.setTutore(lineScanner.next());

                elevi.add(elev);
                lineScanner.close();
            } catch (Exception e) {
                System.out.println("Eroare la citirea elevului: " + e.getMessage());
            }
        }

        input.close();
        return elevi;
    }
}