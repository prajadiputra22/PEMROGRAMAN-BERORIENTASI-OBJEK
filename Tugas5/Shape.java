package Tugas5;

abstract class Shape {
    public static void main(String[] args) {
        Square Persegi = new Square(5);
        double Luas = Persegi.calculateArea();
        System.out.println("\nLuas Persegi: " + Luas);

        Rectangle PersegiPanjang = new Rectangle(4, 6);
        double LuasPP = PersegiPanjang.calculateArea();
        System.out.println("Luas Persegi Panjang: " + LuasPP);

        Circle Lingkaran = new Circle(7);
        double LuasL = Lingkaran.calculateArea();
        System.out.println("Luas Lingkaran dengan: " + LuasL);

        System.out.println("Volatile: " + volatileValue);
        System.out.println("Transient: " + transientValue);
    }
    static volatile int volatileValue = 10;
    static transient int transientValue = 20;
}

class Square {
    protected double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }
}

class Rectangle {
    private double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class Circle {
    private double radius;
    final double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        synchronized (this) {
            double area = PI * radius * radius;
            return area;
        }
    }
}