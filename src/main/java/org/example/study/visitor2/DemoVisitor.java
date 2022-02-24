package org.example.study.visitor2;

public class DemoVisitor {

    public static void main(String[] args) {
        Dot dot = new Dot(1, 10, 55);
        Circle circle = new Circle(2, 23, 15, 10);
        Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

        CompoundShape compoundShape = new CompoundShape(4);
        compoundShape.add(dot);
        compoundShape.add(circle);
        compoundShape.add(rectangle);

        CompoundShape c = new CompoundShape(5);
        c.add(dot);
        compoundShape.add(c);

        XMLExportVisitor visitor = new XMLExportVisitor();
        System.out.println(visitor.export(circle, compoundShape));

        System.out.println("-----");
        System.out.println(rectangle.accept(visitor));
    }

}
