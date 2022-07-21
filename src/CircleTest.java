import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    @org.junit.jupiter.api.Test
    public void setRadius_whenRadiusPositiveNumber_returnRadius() {
        Circle circle = new Circle();
        circle.setRadius(15);
        assertEquals(15, circle.getRadius());
    }

    @org.junit.jupiter.api.Test
    public void setRadius_WhenRadiusNegativeNumber_throwIllegalArgumentException() {
        Circle circle = new Circle();
        assertThrows(IllegalArgumentException.class, ()->circle.setRadius(-1));
    }

    @org.junit.jupiter.api.Test
    public void calculateArea_whenRadiusPositiveNumber_returnCircleArea() {
        Circle circle = new Circle();
        circle.setRadius(5);
        assertEquals(78.5, 3.14 * circle.getRadius() * circle.getRadius());
    }

    @org.junit.jupiter.api.Test
    public void calculatePerimeter_whenRadiusPositiveNumber_returnCirclePerimeter() {
        Circle circle = new Circle();
        circle.setRadius(1);
        assertEquals(6.28, 2 * 3.14 * circle.getRadius());
    }
}