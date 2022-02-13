package Assignment2;

public class Shape {
    private String name;
    private String color;
    private double area;
    private double perimeter;

    public Shape() {
    }

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Shape(String name, String color, int area, int perimeter) {
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }

    public void printShape() {
        System.out.println("Shape Name: " + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getArea() {
        System.out.println(this.area);
    }

    public void getAreaByOnlyside() {
        System.out.println(this.area);
    }
    public void getPerimeter() {
        System.out.println(this.perimeter);
    }

    public void computeArea(){
        System.out.println("shape area: " + this.area);
    }
    public void computePerimeter(){
        System.out.println(this.perimeter);
    }

    public void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Color: " + this.color);

        System.out.println("Area: ");
        computeArea();
        System.out.println("Perimeter: ");
        computePerimeter();
        System.out.println("------------------");

    }
}



