package comPack.assingPack;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("The area of the circle is: " + area);
        return area;
    }
}
