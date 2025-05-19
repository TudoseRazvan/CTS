package SubiecteAI.Template.clase;

import java.util.List;

public class HtmlReportGenerator extends ReportGenerator{
    @Override
    protected List<String> fetchData() {
        System.out.println("Fetching data for HTML report...");
        return List.of("User1","User2","User3");
    }

    @Override
    protected String formatData(List<String> data) {
        System.out.println("Formatting data as HTML...");
        StringBuilder sb = new StringBuilder("<ul>");
        for(String item : data){
            sb.append("\n").append("<li>").append(item).append("</li>").append("\n");
        }
        sb.append("</ul>");
        return sb.toString();
    }

    @Override
    protected void writeReport(String formattedData) {
        System.out.println("Writing HTML report: ");
        System.out.println(formattedData);
    }


}
