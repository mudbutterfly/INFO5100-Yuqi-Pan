package Assignment2;

public class Parallelogram extends Shape{
    private int base;
    private int height;
    private int side;

    public Parallelogram(int base,int height, int side){
        super("Parallelogram","transparent");
        this.base = base;
        this.height = height;
        this.side = side;
    }

    public Parallelogram(int side) {
        super("SameSideParallelogram","transparent");
        this.side = side;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void getArea(){
        System.out.println("The area of this shape is " + this.base * this.height);
    }

    @Override
    public void getAreaByOnlyside(){
        System.out.println("The area of this shape is " + this.side * this.side);
    }

    @Override
    public void getPerimeter() {
        System.out.println("The Perimeter of this shape is " + (this.side + this.base) *2);
    }

}
