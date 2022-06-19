package by.itAcademy.Miholenko;

abstract class Figure {
        private String type;

        Figure() {

        }

        Figure(String type) {
            this.type = type;
        }

        abstract double getPerimeter();

}
