package SubiecteAI.Strategy.problema2.program;

import SubiecteAI.Strategy.problema2.clase.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Nike Air Zoom Pegasus",520.0,"Running",15),
                new Product("Adidas Ultraboost", 780.0, "Running", 5),
                new Product("Puma T-Shirt", 135.0, "Casual", 50),
                new Product("Wilson Tennis Racket", 275.0, "Tennis", 12),
                new Product("Reebok CrossFit Shorts", 245.0, "Casual", 8)
        );

        Scanner scanner = new Scanner(System.in);
        List<ProductFilterStrategy> selectedFilters = new ArrayList<>();

        System.out.println("Vrei filtru de pret? (y/n): ");
        if(scanner.nextLine().trim().equalsIgnoreCase("y")){
            System.out.println("   Pret minim:   ");
            double min = Double.parseDouble(scanner.nextLine());
            System.out.println("   Pret maxim:   ");
            double max = Double.parseDouble(scanner.nextLine());
            selectedFilters.add(new PriceFilter(min, max));
        }

        System.out.println("Vrei filtru de categorie? (y/n): ");
        if(scanner.nextLine().trim().equalsIgnoreCase("y")){
            System.out.println("   Categoria (ex. Running, Casual, Tennis): ");
            String categorie = scanner.nextLine().trim();
            selectedFilters.add(new CategoryFilter(categorie));
        }

        System.out.println("Vrei filtru de stoc? (y/n): ");
        if(scanner.nextLine().trim().equalsIgnoreCase("y")){
            System.out.println("   Stoc minim: ");
            int stoc = Integer.parseInt(scanner.nextLine());
            selectedFilters.add(new StockFilter(stoc));
        }

        ProductFilterContext context = new ProductFilterContext();
        List<Product> result = context.filterProducts(products,selectedFilters);

        System.out.println("Produse filtrate: ");
        if(result.isEmpty()){
            System.out.println("   (niciun produs gasit)");
        }else{
            result.forEach(product -> System.out.println("   " + product));
        }

    }
}
