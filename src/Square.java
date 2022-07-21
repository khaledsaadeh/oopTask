public class Square extends Shape {
    private int length;

    public Square() {
        typeOfShape = "square";
        length = 1;
    }

    public Square(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length can't be zero or negative");
        }
        this.length = length;
        typeOfShape = "square";
    }

    public int getLength() {
        return length;
    }

    public String getTypeOfShape() {
        return typeOfShape;
    }

    public void setLength(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length can't be zero or negative");
        }
        this.length = length;
    }

    @Override
    /***
     * calculateArea() overrides from Shape, it calculates the area of the square.
     */
    public void calculateArea() {
        System.out.println("The area of the square is " + length * length);
    }

    @Override
    /***
     * calculatePerimeter() overrides from Shape, it calculates the perimeter of the square.
     */
    public void calculatePerimeter() {
        System.out.println("The perimeter of the square is "+ 4 * length);
    }
}