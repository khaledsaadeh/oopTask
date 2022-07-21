import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    @org.junit.jupiter.api.Test
    public void setLength_whenTestPositiveNumber_returnLength() {
        Square square = new Square();
        square.setLength(20);
        assertEquals(20, square.getLength());
    }

    @org.junit.jupiter.api.Test
    public void setLength_whenTestNegativeNumber_throwIllegalArgumentException() {
        Square square = new Square();
        assertThrows(IllegalArgumentException.class, ()-> square.setLength(-20));
    }

    @org.junit.jupiter.api.Test
    public void calculateArea_whenLengthPositiveNumber_returnSquareArea() {
        Square square = new Square(10);
        assertEquals(100, square.getLength() * square.getLength());
    }

    @org.junit.jupiter.api.Test
    public void calculatePerimeter_whenSquarePositiveNumber_returnSquarePerimeter() {
        Square square = new Square(10);
        assertEquals(40, 4 * square.getLength());
    }
}