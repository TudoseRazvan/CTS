package SubiecteAI.Strategy.problema2.clase;

import java.util.List;

public interface ProductFilterStrategy {
    List<Product> filter(List<Product> products);
    FilterType getFilterType();
}
