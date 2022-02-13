package Assignment2;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(String name, String color, double length, double width) {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    @Override
    public void computeArea(){
        System.out.println("Rectangle Area: " + this.length * this.width);
    }

    @Override
    public void computePerimeter(){
        System.out.println("Rectangle Perimeter: " + (this.length + this.width) * 2 );
    }
}
