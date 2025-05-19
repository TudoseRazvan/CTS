package SubiecteAI.Template.clase;

import java.util.List;

public abstract class ReportGenerator {
    public final void generateReport(){
        List<String> data = fetchData();
        validateData(data); // hook: se poate override
        String formattedData = formatData(data);
        writeReport(formattedData);
    }

    //pasii abstracti pe care subclasele ii implementeaza
    protected abstract List<String> fetchData();
    protected abstract String formatData(List<String> data);
    protected abstract void writeReport(String formattedData);

    // hook: implementare default "fara validare"
    protected void validateData(List<String> data){
        // default: nu face nimic
    }
}
