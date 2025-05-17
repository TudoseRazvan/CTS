package DesignPatterns.Proxy.clase;

//Real Subject -> Contine logica adevarata de rezervare
public class TransportPackage implements ITransport{
    private final String destination;

    public TransportPackage(String destination) {
        this.destination = destination;
    }

    @Override
    public void reserve(String client) {
        System.out.println("Rezervare transport la " + destination + " pentru " + client);
    }
}
