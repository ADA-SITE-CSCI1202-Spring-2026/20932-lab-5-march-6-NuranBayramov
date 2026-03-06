package task6;

public class Circle implements Movable{
    MovablePoint center;
    int radius;

    public Circle(MovablePoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }

    public void printCircle() {
        System.out.println("Center: (" + center.x + ", " + center.y + "), Radius: " + radius);
    }
}
