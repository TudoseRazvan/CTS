package DesignPatterns.Template.clase;

//Subclasa concreta
public class ProcesareComandaStudent extends ProcesareComandaTemplate{
    @Override
    protected float aplicaReducere(float valoareInitiala) {
        float total = valoareInitiala * 0.85f;
        System.out.println("Reducere student 15% -> " + total + " RON");
        return total;
    }
}
