public class Triangle extends Shape {
    private int base;
    private int height;
    private int side;

    public Triangle() {
        base = 1;
        height = 1;
        side = 1;
        typeOfShape = "triangle";
    }

    public Triangle(int base, int height,int side) {
        if (base <= 0 || height <=0 || side <= 0) {
            throw new IllegalArgumentException("attributes must be bigger than zero");
        }
        this.base = base;
        this.height = height;
        this.side = side;
        typeOfShape="triangle";
    }

    public void setBase(int base) {
        if (base <= 0) {
            throw new IllegalArgumentException("base must be bigger than zero");
        }
        this.base = base;
    }

    public void setHeight(int height) {
        if (height <= 0) {
            throw new IllegalArgumentException("height must be bigger than zero");
        }
        this.height = height;
    }

    public void setSide(int side) {
        if (side <= 0) {
            throw new IllegalArgumentException("side must be bigger than zero");
        }
        this.side = side;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    public int getSide() {
        return side;
    }

    public String getTypeOfShape() {
        return typeOfShape;
    }

    @Override
    /***
     * calculateArea() overrides from Shape, it calculates the area of the triangle.
     */
    public void calculateArea() {
        System.out.println("The area of the triangle is "+ (double)(base * height) / 2);
    }

    @Override
    /***
     * calculatePerimeter() overrides from Shape, it calculates the perimeter of the triangle.
     */
    public void calculatePerimeter() {
        System.out.print("the perimeter of the triangle is "+ side + height + base);
    }
}