import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Product {
    private String productName;
    private LocalDate productionDate;
    private String manufacturer;
    private String countryOfOrigin;
    private double price;
    private boolean isBooked;

    public Product(String productName, String productDate, String manufacturer,
                   String countryOfOrigin, double price, boolean isBooked) {
        this.productName = productName;
        this.productionDate = LocalDate.parse(productDate, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.isBooked = isBooked;
    }

    public void printProductFullInfo() {
        System.out.println("Имя продукта: " + productName);
        System.out.println("Дата производства: " + productionDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + countryOfOrigin);
        System.out.println("Цена: " + price);
        System.out.println("Бронь: " + isBooked);
    }
}
