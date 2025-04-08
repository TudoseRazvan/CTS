package Recapitulare.Builder.program;

import Recapitulare.Builder.clase.PachetCalatorie;

public class Main {
    public static void main(String[] args) {
        PachetCalatorie pachetCalatorie = new PachetCalatorie.PachetCalatorieBuilder()
                .setHasAC(true).setHasAnimale(true).setHasTV(true).build();
        System.out.println(pachetCalatorie);

        PachetCalatorie pachetCalatorie2 = PachetCalatorie.builder()
                .setHasAC(true)
                .setHasTV(true)
                .build();
        System.out.println(pachetCalatorie2);
    }
}
