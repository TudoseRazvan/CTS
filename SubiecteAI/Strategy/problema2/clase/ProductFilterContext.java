package SubiecteAI.Strategy.problema2.clase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductFilterContext {
    public List<Product> filterProducts(List<Product> products, List<ProductFilterStrategy> strategies){
        List<Product> result = new ArrayList<>(products);

        List<FilterType> order = Arrays.asList(
                FilterType.PRICE,
                FilterType.CATEGORY,
                FilterType.STOCK
        );

        for(FilterType type : order){
            for(ProductFilterStrategy strategy : strategies){
                if(strategy.getFilterType() == type){
                    result = strategy.filter(result);
                }
            }
        }

        return result;
    }
}
