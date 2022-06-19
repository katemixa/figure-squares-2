package by.itAcademy.Miholenko;

import java.util.Scanner;

public class FigureSquares {
    public static void main(String[] args) {
        System.out.println("Меню программы:\n" +
                "1 - треугольник\n" +
                "2 - прямоугольник\n" +
                "3 - круг\n" +
                "Для выхода из программы нажмите 0");
        int getChoice;
        do {
            System.out.println("Выберите пункт меню или нажмите 0 для выхода");
            Scanner get = new Scanner(System.in);
            getChoice = get.nextInt();
            switch (getChoice) {
                case 1:
                    workingWithTriangle();
                    break;
                case 2:
                    workingWithRectangle();
                    break;
                case 3:
                    workingWithCircle();
                    break;
                case 0:
                    System.out.println("До свидания.");
                    break;
                default:
                    System.out.println("Нет такого пункта меню. Попробуйте ещё раз.");
            }
        } while ((getChoice != 0));


    }

    public static void workingWithTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону A");
        double sideA = scanner.nextDouble();
        System.out.println("Введите сторону B");
        double sideB = scanner.nextDouble();
        System.out.println("Введите сторону C");
        double sideC = scanner.nextDouble();
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        System.out.printf("Площадь треугольника равна: %.2f%n", triangle.getSquare());
        System.out.printf("Периметр треугольника равен: %.2f%n", triangle.getPerimeter());

    }

    public static void workingWithRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону A");
        double height = scanner.nextDouble();
        System.out.println("Введите сторону B");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(height, width);
        rectangle.setHeight(height);
        rectangle.setWidth(width);
        System.out.printf("Площадь прямоугольника равна: %.2f%n", rectangle.getSquare());
        System.out.printf("Периметр прямоугольника равен: %.2f%n", rectangle.getPerimeter());

    }

    public static void workingWithCircle() {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.println("Введите радиус");
        circle.setRadius(scanner.nextDouble());
        System.out.println("Диаметр: " + circle.getDiameter(circle.getRadius()));
        System.out.printf("Площадь: %.2f%n", circle.getSquare());
        System.out.printf("Периметр: %.2f%n", circle.getPerimeter());
    }
}
