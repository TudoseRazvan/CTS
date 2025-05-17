package DesignPatterns.Template.clase;

//Subclasa concreta

public class ProcesareComandaStandard extends ProcesareComandaTemplate{
    @Override
    protected float aplicaReducere(float valoareInitiala) {
        System.out.println("Nu se aplica reducere");
        return valoareInitiala;
    }
}
