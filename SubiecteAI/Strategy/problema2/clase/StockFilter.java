package SubiecteAI.Strategy.problema2.clase;

import java.util.List;
import java.util.stream.Collectors;

public class StockFilter implements ProductFilterStrategy{
    private final int minStock;

    public StockFilter(int minStock) {
        this.minStock = minStock;
    }

    @Override
    public List<Product> filter(List<Product> products) {
        return products.stream()
                .filter(product -> product.getStock() >= minStock)
                .collect(Collectors.toList());
    }

    @Override
    public FilterType getFilterType() {
        return FilterType.STOCK;
    }
}
