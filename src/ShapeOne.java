import java.util.ArrayList;

public class ShapeOne {
    private double volume;

    public ShapeOne(double volume) {
        this.volume = volume;
    }
    public double getVolume() {
        return volume;
    }

}
class SolidOfRevolution extends ShapeOne {
    private double radius;

    public SolidOfRevolution(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
}
class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super(Math.PI * Math.pow(radius, 3) * 4/3, radius);
    }
}
class Cylinder extends SolidOfRevolution { // Конкретный класс
    private double height;

    public Cylinder(double radius, double height) {
        super(Math.PI * radius * height, radius);
        this.height = height;
    }
}
class Pyramid extends ShapeOne {
    private double height;
    private double s; // площадь основания

    public Pyramid(double height, double s) {
        super(height * s * 4 / 3);
        this.height = height;
        this.s = s;
    }
}
class Box extends ShapeOne {
    private ArrayList<ShapeOne> shapes = new ArrayList<>();
    private double available;

    public Box(double available) {
        super(available);
        this.available = available;
    }

    public boolean add(ShapeOne shape) {
        if (available >= shape.getVolume()) {
            shapes.add(shape);
            available -= shape.getVolume();
            return true;
        } else {
            return false;
        }
    }
}
