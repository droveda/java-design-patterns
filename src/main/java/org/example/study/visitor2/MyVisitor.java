package org.example.study.visitor2;

public interface MyVisitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCopoundGraphic(CompoundShape compoundShape);
}
