package org.example.study.visitor2;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape {

    public int id;
    public List<Shape> children = new ArrayList<>();

    public CompoundShape(int id) {
        this.id = id;
    }

    @Override
    public void move(int x, int y) {
        System.out.println("moving compound shape");
    }

    @Override
    public void draw() {
        System.out.println("drawing compound shape");
    }

    @Override
    public String accept(MyVisitor visitor) {
        return visitor.visitCopoundGraphic(this);
    }

    public void add(Shape shape) {
        children.add(shape);
    }

    public int getId() {
        return id;
    }
}
