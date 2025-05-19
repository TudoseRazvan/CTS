package SubiecteAI.Template.program;

import SubiecteAI.Template.clase.HtmlReportGenerator;
import SubiecteAI.Template.clase.PdfReportGenerator;
import SubiecteAI.Template.clase.ReportGenerator;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PDF Report ===");
        ReportGenerator pdfGen = new PdfReportGenerator();
        pdfGen.generateReport();

        System.out.println("\n=== HTML Report ===");
        ReportGenerator htmlGen = new HtmlReportGenerator();
        htmlGen.generateReport();
    }
}
