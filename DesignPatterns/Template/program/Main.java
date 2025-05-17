package DesignPatterns.Template.program;

import DesignPatterns.Template.clase.ProcesareComandaStandard;
import DesignPatterns.Template.clase.ProcesareComandaStudent;
import DesignPatterns.Template.clase.ProcesareComandaTemplate;

public class Main {
    public static void main(String[] args) {
        ProcesareComandaTemplate comandaStudent = new ProcesareComandaStudent();
        ProcesareComandaTemplate comandaStandard = new ProcesareComandaStandard();

        System.out.println("=== Comanda STUDENT ===");
        comandaStudent.proceseaza(200f);

        System.out.println("=== Comanda STANDARD ===");
        comandaStandard.proceseaza(350f);
    }
}
