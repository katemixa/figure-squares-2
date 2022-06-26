package by.itAcademy.Miholenko;

import org.junit.*;

public class TriangleTest {
    @Test
    public void testTriangleSquareIsNotNull() {
        Triangle triangle = new Triangle(5, 5, 5);
        Assert.assertNotEquals(0.0, triangle.getSquare());
    }

    @Test
    public void testTriangleSquareIsNotNaN() {
        Triangle triangle = new Triangle(2, 1, 8);
        Assert.assertFalse(Double.isNaN(triangle.getSquare()));
    }

    @Test
    public void testTrianglePerimeterIsNotNegative() {
        Triangle triangle = new Triangle(2, -1, 8);
        System.out.println(triangle.getPerimeter());
        Assert.assertFalse(triangle.getPerimeter() < Math.abs(triangle.getSideA()) + Math.abs(triangle.getSideB()) + Math.abs(triangle.getSideC()));
    }

}
