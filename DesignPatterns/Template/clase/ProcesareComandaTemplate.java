package DesignPatterns.Template.clase;

//Clasa abstracta -> metoda obligatorie
public abstract class ProcesareComandaTemplate {
    public final void proceseaza(float valoare){
        verificaCos();
        float total = aplicaReducere(valoare);
        incaseaza(total);
        emiteFactura(total);
        trimiteEmail();
    }

    //Pasii standard, nemodificabili
    private void verificaCos(){
        System.out.println("Cos verificat -> OK");
    }

    private void incaseaza(float suma){
        System.out.println("Plata incasata pentru: " + suma + " RON");
    }

    private void emiteFactura(float suma){
        System.out.println("Factura emisa pentru " + suma + " RON");
    }

    private void trimiteEmail(){
        System.out.println("E-mail de confirmare trimis!");
    }

    //Pas variabil
    protected abstract float aplicaReducere(float valoareInitiala);
}
