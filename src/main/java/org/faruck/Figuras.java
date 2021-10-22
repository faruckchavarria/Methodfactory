package org.faruck;

import java.awt.*;

public abstract class Figuras  {
    int lado = 0;

    public Figuras(int lado)
    {
        this.lado = lado;
    }
    public abstract double getArea();

    public abstract void dibujar(Graphics G, int X, int Y);
}
