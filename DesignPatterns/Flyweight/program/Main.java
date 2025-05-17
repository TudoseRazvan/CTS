package DesignPatterns.Flyweight.program;

import DesignPatterns.Flyweight.clase.ISeat;
import DesignPatterns.Flyweight.clase.SeatFactory;

public class Main {
    public static void main(String[] args) {
        final int ROWS = 100, COLS = 50;

        for(int r = 0; r < ROWS; r++){
            for(int c =0; c < COLS; c++){
                String type = switch (c % 3){
                    case 0 -> "STANDARD";
                    case 1 -> "ERGONOMIC";
                    default -> "VIP";
                };
                ISeat seat = SeatFactory.getSeat(type); //partajat
                seat.draw(r,c); //extrinsec
            }
        }
        System.out.println("Numar instante Seat create efectiv: "
            + SeatFactory.getCreatedSeats());
    }
}
