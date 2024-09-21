import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductTovar {
    Map<String, Integer> products = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

    void choice(Scanner scanner) {
        while (true) {
            System.out.println("""
                    1 -> Add Product
                    2 -> Update Product
                    3 -> Check Product
                    """);

            switch (scanner.nextInt()) {
                case 1 -> {
                    addProduct();
                }
                case 2 -> {
                    updateProduct();
                }
                case 3 -> {
                    checkProduct();
                }
            }
        }
    }


    void addProduct() {
        System.out.println("Введите имя продукта: ");
        String product = scanner.nextLine();
        System.out.println("Введите количество продукта: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        products.put(product, quantity);

        System.out.println(products);
    }

    void updateProduct() {
        System.out.println("Введите имя которую хотите обновить: ");
        String productName = scanner.nextLine();

        if (products.containsKey(productName)) {
            System.out.println("Введите новый продукт: ");
            String updateProductName = scanner.nextLine();
            System.out.println("Введите количество: ");
            int quantityUp = scanner.nextInt();
            scanner.nextLine();
            if (!updateProductName.equalsIgnoreCase(productName)) {
                products.remove(productName);
            }
            products.put(updateProductName, quantityUp);
        } else {
            System.out.println("Продукт не найден: ");
        }

        System.out.println(products);
    }

    void checkProduct(){
        System.out.println("Введите имя продукта которую хотите проверить: ");
        String productName = scanner.nextLine();
        if (products.containsKey(productName)){
            int quantity = products.get(productName);
            System.out.println("Имя продукта: " + productName + " Запас: " + quantity);
        }
        else {
            System.out.println("Продукт не найден: " + productName);
        }
    }
}
