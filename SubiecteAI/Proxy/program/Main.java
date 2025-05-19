package SubiecteAI.Proxy.program;

import SubiecteAI.Proxy.clase.IReport;
import SubiecteAI.Proxy.clase.ReportProxy;
import SubiecteAI.Proxy.clase.Role;
import SubiecteAI.Proxy.clase.User;

public class Main {
    public static void main(String[] args) {
        User guest = new User("Andrei", Role.GUEST);
        User contabil = new User("Maria",Role.CONTABIL);

        IReport raportGuest = new ReportProxy(guest);
        IReport raportContabil = new ReportProxy(contabil);

        System.out.println("--GUEST INCEARCA ---");
        raportGuest.exportPDF();
        raportGuest.exportXML();
        raportGuest.exportSigned(); //Refuz

        System.out.println("\n---CONTABIL INCEARCA---");
        raportContabil.exportPDF();
        raportContabil.exportXML();
        raportContabil.exportSigned(); //Permis
    }
}
