package SubiecteAI.Composite.program;

import SubiecteAI.Composite.clase.Component;
import SubiecteAI.Composite.clase.DirectorComposite;
import SubiecteAI.Composite.clase.Fisier;

public class Main {
    public static void main(String[] args) {
        Component root = new DirectorComposite("root");

        root.add(new Fisier("readme.txt",5));
        root.add(new Fisier("photo.jpg",1500));

        Component docs = new DirectorComposite("docs");
        docs.add(new Fisier("design.pdf",300));
        docs.add(new Fisier("specs.docx",120));

        Component pics = new DirectorComposite("pics");
        pics.add(new Fisier("vacation1.png",800));
        pics.add(new Fisier("vacation2.png",950));

        docs.add(pics);
        root.add(docs);

        root.print("");
    }
}
