package SubiecteAI.Proxy.clase;

public class FiscalReport implements IReport{
    @Override public void exportPDF()   {
        System.out.println("PDF generat");
    }
    @Override public void exportXML()   {
        System.out.println("XML generat");
    }
    @Override public void exportSigned(){
        System.out.println("PDF semnat digital");
    }
}
