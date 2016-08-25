package predo.patterns.visitor.simple.elements;

import predo.patterns.visitor.simple.visitors.Visitor;

/**
 * Created by predo1 on 25/08/16.
 */
public class ElementC implements Element{
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public String toString(){
        return "I am element C";
    }
}
