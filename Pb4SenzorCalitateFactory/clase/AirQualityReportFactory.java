package Pb4SenzorCalitateFactory.clase;

public class AirQualityReportFactory {

    //Factory method care returneaza raportul corect in functie de valoarea PM2_5
    public static AbstractAirQualityReport creazaRaport(int PM2_5){
        if(PM2_5 >= 0 && PM2_5 <= 30){
            return new CleanAirQualityReport();
        }
        else if(PM2_5 >= 31 && PM2_5 <= 70){
            return new WarningAirQualityReport();
        }
        else if(PM2_5 > 70){
            return new HealthRiskAirQualityReport();
        }
        return null; //Daca PM2_5 nu este valid
    }
}
