package org.example.study.visitor2;

public class Dot implements Shape {

    private int id;
    private int x;
    private int y;

    public Dot() {
    }

    public Dot(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        System.out.println("moving dot");
    }

    @Override
    public void draw() {
        System.out.println("drawing dot");
    }

    @Override
    public String accept(MyVisitor visitor) {
        return visitor.visitDot(this);
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
}
