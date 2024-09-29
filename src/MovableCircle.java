public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveUP() {
        center.y = center.y + center.ySpeed;
    }

    @Override
    public void moveDOWN() {
        center.y -= center.ySpeed;
    }

    @Override
    public void moveLEFT() {
        center.x -= center.xSpeed;
    }

    @Override
    public void moveRIGHT() {
        center.x += center.xSpeed;

    }
}
