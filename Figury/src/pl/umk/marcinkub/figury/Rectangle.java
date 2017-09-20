package pl.umk.marcinkub.figury;

import pl.umk.marcinkub.figury.Figure;

public class Rectangle implements Figure {

    private double a;
    private double b;
    public Rectangle(double _a, double _b){
        a=_a;
        b=_b;
    }
    @Override
    public double oblicz_powierzchnie() {
        return a*b;
    }
}
