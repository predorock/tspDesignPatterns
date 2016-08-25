package predo.patterns.visitor.simple.elements;

import predo.patterns.visitor.simple.visitors.Visitor;

/**
 * Created by predo1 on 25/08/16.
 */
public class ElementA implements Element {

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String toString(){
        return "I am element A";
    }
}
