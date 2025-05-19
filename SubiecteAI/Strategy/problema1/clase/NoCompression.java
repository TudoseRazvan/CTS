package SubiecteAI.Strategy.problema1.clase;

public class NoCompression implements ICompression {
    @Override public byte[] compress(byte[] input) {
        System.out.println("NoCompression – skip");
        return input;
    }
}
