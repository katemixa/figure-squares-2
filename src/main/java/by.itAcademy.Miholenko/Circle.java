package by.itAcademy.Miholenko;

public class Circle extends Figure implements GetSquare{
    private double radius;

    Circle() {

    }

    public Circle(double radius) {
        super("Круг");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);

    }

}
