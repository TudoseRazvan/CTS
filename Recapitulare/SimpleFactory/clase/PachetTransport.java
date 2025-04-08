package Recapitulare.SimpleFactory.clase;

public class PachetTransport implements IPachetTuristic{
    @Override
    public void descriere() {
        System.out.println("Acest pachet include doar transport!");
    }
}
