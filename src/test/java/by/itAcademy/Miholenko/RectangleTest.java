package by.itAcademy.Miholenko;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void testRectangleSquareIsNotNull() {
        Rectangle rectangle = new Rectangle(0,1);
        Assert.assertNotEquals(0.0, rectangle.getSquare());
    }

    @Test
    public void testRectangleSquareIsNotNegative() {
        Rectangle rectangle = new Rectangle(-5, 1);
        Assert.assertFalse(rectangle.getSquare() < 0);
    }
}
