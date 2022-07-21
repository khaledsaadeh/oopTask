public abstract class Shape {
    public String typeOfShape;

    abstract public void calculateArea();

    public void calculateArea(int length) {
        System.out.println("the overloaded method for area is " + length * length);
    }

    abstract public void calculatePerimeter();
}