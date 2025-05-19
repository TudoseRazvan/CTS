package SubiecteAI.Flyweight.clase;

public class Marker implements IMarker{
    private final Type type;
    private final String iconPath;

    public Marker(String iconPath, Type type) {
        this.type = type;
        this.iconPath = iconPath;
        System.out.println(">> Incarcat sprite pentru " + type);
    }

    @Override
    public void draw(int x, int y, String hint) {
        //Stare extrinseca: coordonate + text
        System.out.println("Draw " + type + " at: " + x + y + " = " + hint);
    }
}
