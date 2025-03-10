public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void moveUP() {
        y = y + ySpeed;

    }

    @Override
    public void moveDOWN() {
        y -= ySpeed;

    }

    @Override
    public void moveLEFT() {
        x -= xSpeed;

    }

    @Override
    public void moveRIGHT() {
        x += xSpeed;

    }
}
