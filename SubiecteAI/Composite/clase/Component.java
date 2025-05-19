package SubiecteAI.Composite.clase;

//FileSystemNode -> Component
public interface Component {
    void add(Component component);
    void remove(Component component);
    Component getChild(int i);
    int getSize();
    void print(String indent);
}
