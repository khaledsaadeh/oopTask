public class Circle extends Shape {
    private int radius;

    public Circle() {
        radius = 1;
        typeOfShape = "circle";
    }

    public Circle (int radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("radius must be bigger than zero");
        }
        this.radius = radius;
        typeOfShape = "circle";
    }

    public int getRadius() {
        return radius;
    }

    public String getTypeOfShape() {
        return typeOfShape;
    }

    public void setRadius(int radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("radius must be bigger than zero");
        }
        this.radius = radius;
    }

    @Override
    /***
     * calculateArea() overrides from Shape, it calculates the area of the circle.
     */
    public void calculateArea() {
        System.out.println("The area of the circle is " + (3.14 * radius * radius));
    }

    @Override
    /***
     *
     * calculatePerimeter() overrides from Shape, it calculates the perimeter of the circle.
     */
    public void calculatePerimeter() {
        System.out.println("The perimeter of the circle is " + (2 * 3.14 * radius));
    }
}