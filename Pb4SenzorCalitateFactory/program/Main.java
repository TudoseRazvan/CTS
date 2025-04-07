package Pb4SenzorCalitateFactory.program;

import Pb4SenzorCalitateFactory.clase.AbstractAirQualityReport;
import Pb4SenzorCalitateFactory.clase.AirQualityReportFactory;
import Pb4SenzorCalitateFactory.clase.Senzor;

public class Main {
    public static void main(String[] args) {
        Senzor senzor = new Senzor(50);

        AbstractAirQualityReport raport = AirQualityReportFactory.creazaRaport(senzor.getPM2_5());

        if(raport!= null){
            raport.afiseazaRaport();
        }else{
            System.out.println("Valoare PM2_5 invalida!");
        }
    }
}
