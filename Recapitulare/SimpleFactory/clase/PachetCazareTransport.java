package Recapitulare.SimpleFactory.clase;

public class PachetCazareTransport implements IPachetTuristic{
    @Override
    public void descriere() {
        System.out.println("Acest pachet include cazare si transport!");
    }
}
