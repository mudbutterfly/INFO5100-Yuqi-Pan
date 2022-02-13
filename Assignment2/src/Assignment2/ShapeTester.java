package Assignment2;


public class ShapeTester {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.setColor("transparent");
        s.setName("shape");
        Rectangle r = new Rectangle("rectangle","black",2.0, 3.0);
        Circle c = new Circle("circle","white",4.0);
        r.computeArea();
        r.computePerimeter();
        c.computeArea();
        c.computePerimeter();
        System.out.println("-----------");
        r.display();
        c.display();
        s.display();
    }
}
