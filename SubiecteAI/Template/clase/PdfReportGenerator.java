package SubiecteAI.Template.clase;

import java.util.List;

public class PdfReportGenerator extends ReportGenerator{
    @Override
    protected List<String> fetchData() {
        System.out.println("Fetching data for PDF report...");
        return List.of("Item A", "Item B", "Item C");
    }

    @Override
    protected String formatData(List<String> data) {
        System.out.println("Formatting data as PDF...");
        return "PDF[" + String.join(" | ", data) + "]";
    }

    @Override
    protected void writeReport(String formattedData) {
        System.out.println("Writing PDF report: ");
        System.out.println(formattedData);
    }

    @Override
    protected void validateData(List<String> data) {
        System.out.println("Validating data for PDF report...");
        if(data.isEmpty()){
            throw new IllegalStateException("PDF report: no data to generate!");
        }
    }
}
