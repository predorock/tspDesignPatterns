package predo.patterns.visitor.simple.visitors;

import predo.patterns.visitor.simple.elements.ElementA;
import predo.patterns.visitor.simple.elements.ElementB;
import predo.patterns.visitor.simple.elements.ElementC;

/**
 * Created by predo1 on 25/08/16.
 */
public class SimpleVisitor implements Visitor {

    public void visit(ElementA elementA) {
        System.out.println("Complex operation : who are you ?" + elementA);
    }

    public void visit(ElementB elementB) {
        System.out.println("Complex operation : who are you ?" + elementB);
    }

    public void visit(ElementC elementC) {
        System.out.println("Complex operation : who are you ?" + elementC);
    }
}
