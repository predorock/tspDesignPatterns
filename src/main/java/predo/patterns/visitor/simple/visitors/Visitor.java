package predo.patterns.visitor.simple.visitors;

import predo.patterns.visitor.simple.elements.ElementA;
import predo.patterns.visitor.simple.elements.ElementB;
import predo.patterns.visitor.simple.elements.ElementC;

/**
 * Created by predo1 on 25/08/16.
 */
public interface Visitor {
    void visit(ElementA elementA);
    void visit(ElementB elementB);
    void visit(ElementC elementC);
}
