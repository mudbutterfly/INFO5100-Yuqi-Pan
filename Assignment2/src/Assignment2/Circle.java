package Assignment2;

public class Circle extends Shape{
    private double radius;

    public Circle() {
    }

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public void computeArea(){
        System.out.println("Circle Area: " + Math.pow(this.radius, 2) * Math.PI);
    }

    @Override
    public void computePerimeter(){
        System.out.println("Circle Perimeter: " + this.radius * 2  * Math.PI );
    }
}
