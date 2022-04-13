//in abstract class, we have method that is provided, and we need to overwrite the method
//one class can impelement multiple interfaces but can only extend one abstract class
//Interface can have only abstract methods. An abstract class can have abstract and non-abstract methods.
//in interface, the there is method, we use the key word of "implements" instead of "extend" as how we rewrite methods in abstract class

//here I am using shape and calculating area as an example:
abstract class Shape {
    int b = 20;
    abstract public void calculateArea();
}

class Square extends Shape {
    @Override
    public void calculateArea() {
        System.out.println("Area of square is " + (b * b));
    }
}

interface Shape2 {
    public void calculateArea();
}

class Rectangle implements Shape2 {
    int b = 50;
    int a = 10;
    @Override
    public void calculateArea() {
        System.out.println("Area of rectangel is "+ (a * b));
    }
}

class Main2 {
    public static void main(String args[]) {
        Square obj = new Square();
        obj.calculateArea();
        Rectangle obj2 = new Rectangle();
        obj2.calculateArea();
    }
}