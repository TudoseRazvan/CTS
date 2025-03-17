package readers;

import java.io.FileNotFoundException;
import java.util.List;

public interface IReadable<T> {
    List<T> readData(String fileName) throws FileNotFoundException;
}

