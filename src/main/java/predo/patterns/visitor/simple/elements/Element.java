package predo.patterns.visitor.simple.elements;

import predo.patterns.visitor.simple.visitors.Visitor;

/**
 * Created by predo1 on 25/08/16.
 */
public interface Element {
    void accept(Visitor visitor);
}
