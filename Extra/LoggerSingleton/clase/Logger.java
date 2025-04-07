package Extra.LoggerSingleton.clase;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    //instanta unica a clasei Logger
    private static Logger instance = null;

    //Constructor private pentru a preveni instantierea din exterior
    private Logger(){}

    //Metoda publica pentru a obtine instanta unica a clasei Logger
    public static Logger getInstance(){
        if(instance == null){
            return new Logger();
        }
        return instance;
    }

    //Metoda care scrie un mesaj in fisierul de log
    public void log(String mesaj){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt",true))){
            writer.write(mesaj);
            writer.newLine();
        }catch (IOException e){
            System.out.println("Eroare la scrierea in fisierul de log: " + e.getMessage());
        }
    }
}
