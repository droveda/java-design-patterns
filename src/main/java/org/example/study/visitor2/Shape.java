package org.example.study.visitor2;

public interface Shape {

    void move(int x, int y);
    void draw();
    String accept(MyVisitor visitor);

}
