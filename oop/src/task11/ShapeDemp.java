package task11;

public class ShapeDemp {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle ("green",1,1,20);
        shapes[1] = new Circle("black",3,4,50);
        shapes[2] = new Rectangle("red",1,1,6,6);
        shapes[3] = new Rectangle("yellow",10,10,20,20);

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
