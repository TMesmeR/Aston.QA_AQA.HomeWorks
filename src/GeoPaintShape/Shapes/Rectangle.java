package GeoPaintShape.Shapes;

import GeoPaintShape.Interface.IShape;

public class Rectangle extends Shape {
    private final double sideOne;
    private final double sideTwo;

    public Rectangle(double sideOne, double sideTwo, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public double getPerimeter() {
        return 2 * (sideOne + sideTwo);
    }

    @Override
    public double getArea() {
        return sideOne * sideTwo;
    }
}
