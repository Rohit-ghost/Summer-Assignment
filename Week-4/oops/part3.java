
class Point {

    private int x, y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("x = " + x + ", y = " + y);
    }
}

public class PointDemo {

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(10, 20);

        p1.display();
        p2.display();

        p1.setX(5);
        p1.setY(15);
        p1.display();

        p2.setXY(100, 200);
        p2.display();
    }
}

output;
PS C:\Users\user\Desktop\Assignment> cd "c:\Users\user\Desktop\Assignment\" ; if ($?) { javac PointDemo.java } ; if ($?) { java PointDemo }
x = 0, y = 0
x = 10, y = 20
x = 5, y = 15
x = 100, y = 200
PS C:\Users\user\Desktop\Assignment> 
