package org.faruck;

import java.awt.*;

public class Cuadrado extends Figuras{
    public Cuadrado (int Lados)
    {
        super(Lados);
    }
    @Override
    public double getArea() {
        return (double) (this.lado * this.lado);
    }

    @Override
    public void dibujar(Graphics G, int X, int Y) {
        G.setColor(Color.RED);
        G.drawRect(X, Y, this.lado, this.lado);
    }
}
