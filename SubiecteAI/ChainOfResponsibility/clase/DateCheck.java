package SubiecteAI.ChainOfResponsibility.clase;

import java.time.LocalDate;

public class DateCheck extends CheckAbstract{
    @Override
    public void handle(Request request) {
        boolean ok = !LocalDate.now().getDayOfWeek().toString().equals("SUNDAY");
        System.out.println("DateCheck > " + (ok ? "OK" : "Nu este zi lucratoare"));
        if(ok)
            forward(request);
    }
}
