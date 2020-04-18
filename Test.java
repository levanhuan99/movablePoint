package moveablePoint;

public class Test {
    public static void main(String[] args) {
        Point point=new Point(2,3);
        point.move();
        System.out.println(point);


        System.out.println("--------------");

        MovablePoint movablePoint=new MovablePoint(4,5,3,2);
         movablePoint.move();
        System.out.println(movablePoint.getX());
    }
}
