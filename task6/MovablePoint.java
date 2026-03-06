package task6;
class MovablePoint implements Movable {

    int x, y;
    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveUp() {
        y++;
    }

    public void moveDown() {
        y--;
    }

    public void moveLeft() {
        x--;
    }

    public void moveRight() {
        x++;
    }
    public void printPosition() {
        System.out.println("(" + x + ", " + y + ")");
    }
}