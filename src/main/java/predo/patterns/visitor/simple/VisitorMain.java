package predo.patterns.visitor.simple;

import predo.patterns.visitor.simple.elements.ElementA;
import predo.patterns.visitor.simple.elements.ElementB;
import predo.patterns.visitor.simple.elements.ElementC;
import predo.patterns.visitor.simple.visitors.BitchCVisitor;
import predo.patterns.visitor.simple.visitors.SimpleVisitor;
import predo.patterns.visitor.simple.visitors.Visitor;

/**
 * Created by predo1 on 25/08/16.
 */
public class VisitorMain {
    public static void main(String[] args) {
        Visitor simpleVisitor = new SimpleVisitor();
        Visitor bitchCVisitor = new BitchCVisitor();

        System.out.println("Using the simple visitor :\n");
        visit(simpleVisitor);

        System.out.println("\nUsing the bitchCVisitor :\n");
        visit(bitchCVisitor);

    }

    static void visit(Visitor visitor){
        ElementA elementA = new ElementA();
        elementA.accept(visitor);

        ElementB elementB = new ElementB();
        elementB.accept(visitor);

        ElementC elementC = new ElementC();
        elementC.accept(visitor);
    }
}
