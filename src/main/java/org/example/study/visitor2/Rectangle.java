package org.example.study.visitor2;

public class Rectangle implements Shape {

    private int id;
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int id, int x, int y, int width, int height) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void move(int x, int y) {
        System.out.println("moving rectangle");
    }

    @Override
    public void draw() {
        System.out.println("drawing rectangle");
    }

    @Override
    public String accept(MyVisitor visitor) {
        return visitor.visitRectangle(this);
    }

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
