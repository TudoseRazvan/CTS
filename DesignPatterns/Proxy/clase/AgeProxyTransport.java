package DesignPatterns.Proxy.clase;

//Proxy -> verifica permisiunea (varsta) inainte de delegare
// permite controlul accesului fara a altera clasa existenta si restrictioneaza
public class AgeProxyTransport implements ITransport{
    private final ITransport realPackage; //PRIVATE
    private final int clientAge;

    public AgeProxyTransport(ITransport realPackage, int clientAge) {
        this.realPackage = realPackage;
        this.clientAge = clientAge;
    }

    @Override
    public void reserve(String client) {
        if(clientAge >= 65){
            realPackage.reserve(client);
        }else{
            System.out.println(client + ": Rezervare refuzata - client sub 65 ani ");
        }
    }
}
