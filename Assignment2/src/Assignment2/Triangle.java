package Assignment2;

class Triangle extends Shape {
        private int base;
        private int height;
        private int side;

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

    public Triangle(int side) {
        super("Triangle","transparent");
        this.side = side;
    }

    @Override
    public void getArea(){
        System.out.println("The area of this shape is " + this.side * 1/2 * this.side * Math.sqrt(3) / 2);

    }

    @Override
    public void getPerimeter() {
        System.out.println("The perimeter of this shape is " + this.side * 3);
    }
}
