package task11;

public abstract class Shape {
    private String color;

    public Shape() {

    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void draw();


    //Создайте супер класс Shape и его наследники Circle, Rectangle.
    // Класс Shape содержит абстрактный метод draw() и переменную хранящую цвет. Классы Circle, Rectangle содержат координаты точек.
    // Создать массив содержащий эти фигуры. В цикле нарисовать их (вызвать метод draw).
    // Добавить метод equals() для классов Shape, Circle, Rectangle.
}
