package org.example;

public class Triangulo {
    private Punto a;
    private Punto b;
    private Punto c;

    public Triangulo(Punto a, Punto b, Punto c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public Punto getA() {
        return this.a;
    }
    public Punto getB() {
        return this.b;
    }
    public Punto getC() {
        return this.c;
    }

}
