package SubiecteAI.Strategy.problema2.clase;

import java.util.List;
import java.util.stream.Collectors;

public class CategoryFilter implements ProductFilterStrategy{
    private final String category;

    public CategoryFilter(String category) {
        this.category = category;
    }

    @Override
    public List<Product> filter(List<Product> products) {
        return products.stream()
                .filter(product -> product.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    @Override
    public FilterType getFilterType() {
        return FilterType.CATEGORY;
    }
}
