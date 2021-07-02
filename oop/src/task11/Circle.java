package task11;

public class Circle extends Shape {
    private int x,y,radius;

    public Circle() {

    }

    public Circle(String color, int x, int y, int radius) {
        super(color);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle with color " + getColor() + " and coordinates x=" + getX() + " and y=" + getY());
    }
}
