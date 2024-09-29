public class Main {
    public static void main(String[] args){
        MovablePoint point = new MovablePoint(3,6,4,9);
        MovableCircle circle = new MovableCircle(16,point);
        circle.moveRIGHT();
        circle.moveDOWN();
        System.out.println(circle.toString());


    }
}
