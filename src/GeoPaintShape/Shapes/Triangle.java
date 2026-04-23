package GeoPaintShape.Shapes;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    @Override
    public void printInfo() {
        System.out.println("Фигура: " + getClass().getSimpleName());
        System.out.println("Периметр: " + String.format("%.2f", getPerimeter(sideA,sideB,sideC)));
        System.out.println("Площадь: " + String.format("%.2f", getArea(sideA,sideB,sideC)));
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы:" + getBorderColor());
    }
}
