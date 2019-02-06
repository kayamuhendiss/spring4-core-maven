package com._02.DI;

public class ConstructorConfuse {
    private String strProperty;
    private int intProperty;

    public ConstructorConfuse(String strProperty) {
        this.strProperty = strProperty;
    }

    public ConstructorConfuse(int intProperty) {
        this.intProperty = intProperty;
    }

    public ConstructorConfuse() {
    }

    @Override
    public String toString() {
        return "ConstructorConfuse{" +
                "strProperty='" + strProperty + '\'' +
                ", intProperty=" + intProperty +
                '}';
    }
}
