package pl.umk.marcinkub.figury;

import pl.umk.marcinkub.figury.Figure;

public class Triangle implements Figure {

    private double a;
    private double h;
    public Triangle(double _a, double _h){
        a=_a;
        h=_h;
    }
    @Override
    public double oblicz_powierzchnie() {
        return a*h/2.0;
    }
}
