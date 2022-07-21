public class Main {
    /***
     * getShapeInfo prints the type, area and perimeter of the given shape.
     *
     * @param shape an object of type Shape taken as a parameter
     */
    public static void getShapeInfo (Shape shape) {
        System.out.println("Type of the shape: " + shape.typeOfShape);
        shape.calculateArea();
        shape.calculatePerimeter();
        System.out.println("******************");
    }

    public static void main(String[] args) {
        Shape square = new Square(10);
        getShapeInfo(square);

        Shape circle = new Circle();
        getShapeInfo(circle);

        Shape triangle = new Triangle(12,14,5);
        getShapeInfo(triangle);
    }
}