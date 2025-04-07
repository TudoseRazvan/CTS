package Extra.LoggerSingleton.program;


import Extra.LoggerSingleton.clase.Logger;

/*
Implementați o clasă Logger care să fie responsabilă cu logarea mesajelor într-un fișier.
Clasa trebuie să aibă o singură instanță pe întreaga aplicație.
Nu trebuie să permită crearea de instanțe multiple.
Fiecare mesaj de log trebuie să fie stocat într-un fișier log.txt (simulat).
*/
public class Main {
    public static void main(String[] args) {
        //Obtinem instanta unica a clasei Logger
        Logger logger = Logger.getInstance();

        logger.log("Mesaj de log 1");
        logger.log("Mesaj de log 2");
        logger.log("Mesaj de log 3");

        //Verificam ca aceeasi instanta este folosita
        Logger anotherLogger = Logger.getInstance();
        anotherLogger.log("Mesaj de log 4");
    }
}
