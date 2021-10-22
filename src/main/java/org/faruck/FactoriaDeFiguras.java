package org.faruck;

public class FactoriaDeFiguras {
    public static final int CUADRADO = 0;
    public static final int CIRCULO = 1;

    public FactoriaDeFiguras() {
    }

    public Figuras getFigura(int tipo, int lado)
    {
        return (Figuras)(tipo == 0 ? new Cuadrado(lado) : new Circulo(lado));
    }
}