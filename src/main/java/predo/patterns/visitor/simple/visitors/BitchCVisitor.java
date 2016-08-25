package predo.patterns.visitor.simple.visitors;

import predo.patterns.visitor.simple.elements.ElementC;

/**
 * Created by predo1 on 25/08/16.
 */
public class BitchCVisitor extends SimpleVisitor {

    @Override
    public void visit(ElementC elementC) {
        System.out.println(elementC + ", SON OF A BITCH!!!");
    }
}
