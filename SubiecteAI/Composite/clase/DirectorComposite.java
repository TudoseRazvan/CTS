package SubiecteAI.Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class DirectorComposite implements Component{
    public static int indentLevel = 0;
    private final String name;
    private final List<Component> children = new ArrayList<>();

    public DirectorComposite(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return children.get(i);
    }

    @Override
    public int getSize() {
        return children.stream()
                .mapToInt(Component::getSize)
                .sum();
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "* " + name + " [" + getSize() + "h]");
        children.forEach(component -> component.print(indent + "   "));
    }
}
