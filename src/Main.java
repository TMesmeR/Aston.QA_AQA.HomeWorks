//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var productArray = new Product[]{
                new Product("Samsung S25 Ultra", "01.02.2025",
                        "Samsung Corp.", "Korea", 5599, true),
                new Product("iPhone 16 Pro", "15.03.2025",
                        "Apple Inc.", "USA", 7999, false),
                new Product("Xiaomi 14", "10.01.2025",
                        "Xiaomi Corporation", "China", 3499, true),
                new Product("Sony WH-1000XM6", "20.12.2024",
                        "Sony Corporation", "Japan", 2999, false),
                new Product("LG OLED TV", "05.11.2024",
                        "LG Electronics", "Korea", 12999, true)
        };

        for (var p : productArray
        ) {
            p.printProductFullInfo();
            System.out.println("\n-///////////////////////-\n");
        }

        var park = new Park("", "");
        var attration = park.new Attraction("Карусель","10:00 - 18:00", 100.00);
        System.out.println(attration.getName());
    }
}


