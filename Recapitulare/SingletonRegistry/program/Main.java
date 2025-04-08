package Recapitulare.SingletonRegistry.program;

import Recapitulare.SingletonRegistry.clase.PachetCazare;
import Recapitulare.SingletonRegistry.clase.PachetTransport;
import Recapitulare.SingletonRegistry.clase.RegistryPachete;

public class Main {
    public static void main(String[] args) {
        PachetCazare cazare = new PachetCazare();
        PachetCazare cazare2 = new PachetCazare();
        PachetTransport transport = new PachetTransport();

        try{
            RegistryPachete.register("Cazare",cazare);
            //RegistryPachete.register("Cazare",cazare2);
            RegistryPachete.register("Transport",transport);

            RegistryPachete.getPachet("Cazare").descriere();
            RegistryPachete.getPachet("Transport").descriere();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
