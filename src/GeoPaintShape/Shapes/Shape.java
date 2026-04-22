package GeoPaintShape.Shapes;

import GeoPaintShape.Interface.IShape;

public abstract class Shape implements IShape {
    private final String fillColor;
    private final String borderColor;

    public Shape(String fillColor, String borderColor) {
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }
}
