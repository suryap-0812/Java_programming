abstract class Shape {
    abstract double area();
    void displayArea() {
        System.out.println(area());
    }
}
class Square extends Shape {
    double side;
    Square(double side) {
        this.side = side;
    }
    @Override
    double area() {
        return side * side;
    }
}
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    double area() {
        return length * width;
    }
}
public class Abs {
    public static void main(String[] args) {
        Square s = new Square(5);
        s.displayArea();

        Circle c = new Circle(3);
        c.displayArea();

        Rectangle r = new Rectangle(4, 6);
        r.displayArea();
    }
}