package Recapitulare.SimpleFactory.program;

import Recapitulare.SimpleFactory.clase.AgentieFactory;
import Recapitulare.SimpleFactory.clase.AgentieSingletonFactory;
import Recapitulare.SimpleFactory.clase.IPachetTuristic;
import Recapitulare.SimpleFactory.clase.TipPachet;

public class Main {
    public static void main(String[] args) {
        AgentieFactory agentieFactory = new AgentieFactory();

        IPachetTuristic pachetTuristic = null;
        try{
            pachetTuristic = agentieFactory.crearePachet(TipPachet.pachetCazare);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        pachetTuristic.descriere();



        AgentieSingletonFactory agentieFabrica = AgentieSingletonFactory.getInstanta();
        try {
            pachetTuristic = agentieFabrica.createPachet(TipPachet.pachetCazareSiTransport);
        } catch (Exception e) {
            e.printStackTrace();
        }
        pachetTuristic.descriere();
    }
}
