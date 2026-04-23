package GeoPaintShape.Shapes;

public class Rectangle extends Shape {
    private final double sideOne;
    private final double sideTwo;

    public Rectangle(double sideOne, double sideTwo, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public void printInfo() {
        System.out.println("Фигура: " + getClass().getSimpleName());
        System.out.println("Периметр: " + String.format("%.2f", getPerimeter(sideOne,sideTwo)));
        System.out.println("Площадь: " + String.format("%.2f", getArea(sideOne,sideTwo)));
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы:" + getBorderColor());
    }
}
