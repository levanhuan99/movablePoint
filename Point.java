package moveablePoint;

public class Point {
    private float x;
    private float y;

    public Point(){
    }

    public Point(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        float[] arr= {this.x,this.y};
        return arr;
    }
    public void setXY(float x,float y){
        setX(x);
        setY(y);
    }
    @Override
    public String toString(){
        return  "Point 2D is created with x and y are "+"("+getX()+","+getY()+")";
    }
    public void move(){
        this.x+=1;
        this.y+=2;
    }

}

class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;
    public MovablePoint(){
    }
    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] arr={this.xSpeed,this.ySpeed};
        return arr;
    }
    public void setSpeed(float x,float y){
        setXSpeed(x);
        setYSpeed(y);
    }
    @Override
    public String toString(){
        return "MovablePoint with "+"("+getX()+","+getY()+"),speed="+"("+getXSpeed()+","+getYSpeed()+")";
    }
    public void move(){
        this.setX(getX()+xSpeed);
        this.setY(getY()+ySpeed);
    }


}
