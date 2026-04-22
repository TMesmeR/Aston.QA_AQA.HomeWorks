package GeoPaintShape;

import GeoPaintShape.Shapes.Circle;
import GeoPaintShape.Shapes.Rectangle;
import GeoPaintShape.Shapes.Triangle;

public class GeoPaintShapeMainView {
   private final Circle circle;
   private final Rectangle rectangle;
   private final Triangle triangle;

    public GeoPaintShapeMainView() {
        this.circle = new Circle(5.0, "Красный", "Черный");
        this.rectangle = new Rectangle(4.0, 6.0, "Синий", "Белый");
        this.triangle = new Triangle(3.0, 4.0, 5.0, "Зеленый", "Золотой");
    }


    public void printView(){
        System.out.println("=== Результаты расчета геометрических фигур ===\n");

        circle.printInfo();
        System.out.println("\n===========================\n");
        rectangle.printInfo();
        System.out.println("\n===========================\n");
        triangle.printInfo();
    }
}
