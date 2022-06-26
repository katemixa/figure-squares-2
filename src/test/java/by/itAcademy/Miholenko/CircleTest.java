package by.itAcademy.Miholenko;

import org.junit.Assert;
import org.junit.Test;

public class CircleTest {
    @Test
    public void testCircleSquareIsNotNull() {
        Circle circle = new Circle(0);
        Assert.assertNotEquals(0.0, circle.getSquare());
    }

    @Test
    public void testCircleRadiusIsNotNegative() {
        Circle circle = new Circle(-5);
        Assert.assertFalse(circle.getRadius() < 0);
    }
}
