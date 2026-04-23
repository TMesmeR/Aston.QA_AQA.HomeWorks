package GeoPaintShape.Shapes;

import GeoPaintShape.Interface.IShape;

public class Circle extends Shape{
    private final double radius;

    public Circle(double radius, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.radius = radius;
    }

    @Override
    public void printInfo() {
        System.out.println("Фигура: " + getClass().getSimpleName());
        System.out.println("Периметр: " + String.format("%.2f", getPerimeter(radius)));
        System.out.println("Площадь: " + String.format("%.2f", getArea(radius)));
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы:" + getBorderColor());
    }
}
