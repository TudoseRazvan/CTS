package DesignPatterns.Proxy.program;

import DesignPatterns.Proxy.clase.AgeProxyTransport;
import DesignPatterns.Proxy.clase.ITransport;
import DesignPatterns.Proxy.clase.TransportPackage;

public class Main {
    public static void main(String[] args) {
        ITransport seniorTrip = new AgeProxyTransport(new TransportPackage("Paris"),70);
        ITransport youngTrip = new AgeProxyTransport(new TransportPackage("Viena"),30);

        seniorTrip.reserve("Maria Popescu");
        youngTrip.reserve("Andrei Ionescu");
    }
}
