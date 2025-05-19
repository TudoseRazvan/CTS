package SubiecteAI.Strategy.problema1.clase;

import java.util.Arrays;

public class FastCompression implements ICompression{
    @Override
    public byte[] compress(byte[] input) {
        System.out.println("FastCompression - simplu COPY (0% gain)");
        return Arrays.copyOf(input, input.length);
    }
}
