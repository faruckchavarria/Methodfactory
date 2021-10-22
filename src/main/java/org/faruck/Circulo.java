package org.faruck;

import java.awt.*;

public class Circulo extends Figuras {
    public Circulo(int Lados)
    {
        super (Lados);
    }

    @Override
    public double getArea() {

        return 3.141592653589793D * (double)this.lado * (double)this.lado;
    }

    @Override
    public void dibujar(Graphics G, int X, int Y)
    {
        G.setColor(Color.RED);
        G.drawArc(X, Y, this.lado, this.lado, 0, 360);
    }
}
