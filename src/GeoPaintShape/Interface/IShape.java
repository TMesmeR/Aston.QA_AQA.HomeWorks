package GeoPaintShape.Interface;

public interface IShape {
    default double getPerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    default double getPerimeter(double sideA, double sideB) {
        return 2 * (sideA + sideB);
    }

    default double getPerimeter(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }


    default double getArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    default double getArea(double sideA, double sideB) {
        return sideA * sideB;
    }

    default double getArea(double sideA, double sideB, double sideC) {
        double s = getPerimeter(sideA, sideB, sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    String getFillColor();

    String getBorderColor();

    void printInfo();
}
