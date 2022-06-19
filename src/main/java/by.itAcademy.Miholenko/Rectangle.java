package by.itAcademy.Miholenko;

public class Rectangle extends Figure implements GetSquare {
    private double height;
    private double width;

    Rectangle() {

    }

    public Rectangle(double height, double width) {
        super("Прямоугольник");
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getSquare() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return (height + width) * 2;
    }

}
