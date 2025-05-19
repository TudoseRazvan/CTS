package SubiecteAI.Strategy.problema2.clase;

import java.util.List;
import java.util.stream.Collectors;

public class PriceFilter implements ProductFilterStrategy{
    private final double minPrice;
    private final double maxPrice;

    public PriceFilter(double minPrice, double maxPrice) {
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    @Override
    public List<Product> filter(List<Product> products) {
        return products.stream()
                .filter(product -> product.getPrice() >= minPrice && product.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    @Override
    public FilterType getFilterType() {
        return FilterType.PRICE;
    }
}
