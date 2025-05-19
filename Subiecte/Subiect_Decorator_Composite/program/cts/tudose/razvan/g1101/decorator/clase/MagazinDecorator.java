package Subiecte.Subiect_Decorator_Composite.program.cts.tudose.razvan.g1101.decorator.clase;

public abstract class MagazinDecorator implements IModCalculator{
    protected IModCalculator magazinReal;

    public MagazinDecorator(IModCalculator magazinReal) {
        this.magazinReal = magazinReal;
    }
}
