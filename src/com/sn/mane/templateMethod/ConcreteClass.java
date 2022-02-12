package com.sn.mane.templateMethod;

/**
 *
 * Implements the primitive operations to carry out subclass-specific steps of
 * the algorithm.
 *
 */
public class ConcreteClass extends AbstractClass{
    @Override
    String primitiveOperation1() {
        return "Template";
    }

    @Override
    String primitiveOperation2() {
        return "Method";
    }
}
