import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {
    @org.junit.jupiter.api.Test
    public void setBase_whenBasePositiveNumber_returnBase() {
        Triangle triangle = new Triangle();
        triangle.setBase(5);
        assertEquals(5,triangle.getBase());
    }

    @org.junit.jupiter.api.Test
    public void setHeight_whenHeightPositiveNumber_returnHeight() {
        Triangle triangle = new Triangle();
        triangle.setHeight(5);
        assertEquals(5,triangle.getHeight());
    }

    @org.junit.jupiter.api.Test
    public void setSide_whenSidePositiveNumber_returnSide() {
        Triangle triangle = new Triangle();
        triangle.setSide(5);
        assertEquals(5,triangle.getSide());
    }

    @org.junit.jupiter.api.Test
    public void setBase_whenBaseNegativeNumber_throwIllegalArgumentException() {
        Triangle triangle = new Triangle();
        assertThrows(IllegalArgumentException.class, ()->triangle.setBase(-1));
    }

    @org.junit.jupiter.api.Test
    public void setHeight_whenHeightNegativeNumber_throwIllegalArgumentException() {
        Triangle triangle = new Triangle();
        assertThrows(IllegalArgumentException.class, ()->triangle.setHeight(-1));
    }

    @org.junit.jupiter.api.Test
    public void setSide_whenSideNegativeNumber_throwIllegalArgumentException() {
        Triangle triangle = new Triangle();
        assertThrows(IllegalArgumentException.class, ()->triangle.setSide(-1));
    }

    @org.junit.jupiter.api.Test
    public void calculateArea_whenAttributesPositive_returnTriangleArea() {
        Triangle triangle = new Triangle(5,10,1);
        assertEquals(25,(double)(triangle.getBase() * triangle.getHeight()) / 2);
    }

    @org.junit.jupiter.api.Test
    public void calculatePerimeter_whenAttributesPositive_returnTrianglePerimeter() {
        Triangle triangle = new Triangle(5,10,1);
        assertEquals(16,triangle.getSide() + triangle.getHeight() + triangle.getBase());
    }
}