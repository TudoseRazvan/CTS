package SubiecteAI.Strategy.problema1.clase;

public class UltraCompression implements ICompression {
    @Override public byte[] compress(byte[] input) {
        System.out.println("UltraCompression – 70 % ratio");
        return new byte[(int) (input.length * 0.30)];   // simulare
    }
}