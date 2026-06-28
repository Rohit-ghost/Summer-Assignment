class Box {
    protected double length;
    protected double breadth;
    protected double height;

    public Box() {
        length = 0;
        breadth = 0;
        height = 0;
    }

    public Box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    public void setDimensions(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    public double area() {
        return length * breadth;
    }
}

class Box3D extends Box {
    public Box3D() {
        super();
    }

    public Box3D(double l, double b, double h) {
        super(l, b, h);
    }

    public double volume() {
        return length * breadth * height;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box b = new Box(10, 5, 0);
        System.out.println("Area of Box = " + b.area());

        Box3D b3 = new Box3D(10, 5, 4);
        System.out.println("Area of Box3D base = " + b3.area());
        System.out.println("Volume of Box3D = " + b3.volume());
    }
}
