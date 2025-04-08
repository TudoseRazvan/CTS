package Recapitulare.SingletonThreadSafe.program;

import Recapitulare.SingletonThreadSafe.clase.AgentieThreadSafe;

public class Main {
    public static void main(String[] args) {
        AgentieThreadSafe primaAgentie = AgentieThreadSafe.getInstance("AgeTur",1000,10);
        AgentieThreadSafe aDouaAgentie = AgentieThreadSafe.getInstance("O alta agentie", 10,2);

        System.out.println(primaAgentie);
        System.out.println(aDouaAgentie);
    }
}
