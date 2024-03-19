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
    }
}

class Square {
    public double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }

    protected double getSide() {
        return side;
    }
}

class Rectangle {
    private double length;
    protected double width;

    // Modifier access public untuk constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }

    protected double getLength() {
        return length;
    }

    static final double PI = 3.14159;
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        synchronized (this) {
            double area = Rectangle.PI * radius * radius;
            return area;
        }
    }
}