package GeoPaintShape.Interface;

public interface IShape {
    public double getPerimeter();
    public  double getArea();

    String getFillColor();
    String getBorderColor();
    default void  printInfo(){
        System.out.println("Фигура: " + getClass().getSimpleName());
        System.out.println("Периметр: " + String.format("%.2f", getPerimeter()));
        System.out.println("Площадь: " + String.format("%.2f", getArea()));
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы:" + getBorderColor());
    }
}
