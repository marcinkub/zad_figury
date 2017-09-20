package pl.umk.marcinkub.figury;

public class Elipse implements Figure {
    private double a,b;
    public Elipse(double _a, double _b)
    {
        a=_a;
        b=_b;
    }
    @Override
    public double oblicz_powierzchnie() {
        return Math.PI*a*b;
    }
}
