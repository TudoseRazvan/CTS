package SubiecteAI.Composite.clase;

//Leaf
public class Fisier implements Component{
    private final String name;
    private final int size;

    public Fisier(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException("Leaf nu poate avea copii");
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException("Leaf nu poate avea copii");
    }

    @Override
    public Component getChild(int i) {
        throw new UnsupportedOperationException("Leaf nu poate avea copii");
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "- " + name + " (" + size + "KB)");
    }
}
