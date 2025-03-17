package readers;

import clase.Aplicant;
import clase.Student;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader {

    @Override
    public List<Aplicant> readData(String fileName) throws FileNotFoundException {
        Scanner input = new Scanner(new File(fileName));
        List<Aplicant> studenti = new ArrayList<>();

        while (input.hasNextLine()) {
            try {
                String line = input.nextLine();
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter(",");

                Student student = new Student();
                super.readAplicant(lineScanner, student);
                student.setAnStudii(lineScanner.nextInt());
                student.setFacultate(lineScanner.next());

                studenti.add(student);
                lineScanner.close();
            } catch (Exception e) {
                System.out.println("Eroare la citirea studentului: " + e.getMessage());
            }
        }

        input.close();
        return studenti;
    }
}