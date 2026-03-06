package task6;

public class Main {
    public static void main(String[] args) {

        MovablePoint p = new MovablePoint(3, 4);

        p.printPosition();

        p.moveUp();
        p.moveRight();

        p.printPosition();

        p.moveLeft();
        p.moveDown();

        p.printPosition();
        Circle c = new Circle(p, 10);

        c.printCircle();

        c.moveUp();
        c.moveRight();

        c.printCircle();
    }
}
