package SubiecteAI.Proxy.clase;

public class ReportProxy implements IReport{
    private final FiscalReport raportFiscal = new FiscalReport();
    private final User user;

    public ReportProxy(User user) {
        this.user = user;
    }

    @Override
    public void exportPDF() {
        raportFiscal.exportPDF();
    }

    @Override
    public void exportXML() {
        raportFiscal.exportXML();
    }

    @Override
    public void exportSigned() {
        if(user.getRole() == Role.CONTABIL){
            raportFiscal.exportSigned();
        }else{
            System.out.println("Acces refuzat pentru " + user.getNume() + " - nivel rol insuficient!");
        }
    }
}
