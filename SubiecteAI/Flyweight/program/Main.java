package SubiecteAI.Flyweight.program;

import SubiecteAI.Flyweight.clase.IMarker;
import SubiecteAI.Flyweight.clase.MarkerFactory;
import SubiecteAI.Flyweight.clase.Type;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Type[] vals = Type.values();
        for (int i = 0; i < 15_000; i++) {
            Type t = vals[rnd.nextInt(vals.length)];
            IMarker m = MarkerFactory.getMarker(t);
            m.draw(rnd.nextInt(2000), rnd.nextInt(2000),
                    t + "-" + i);  //
        }
        System.out.println("Instanțe Marker create: " + MarkerFactory.count()); // va fi 3
    }
}
