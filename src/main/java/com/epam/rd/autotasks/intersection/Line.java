package com.epam.rd.autotasks.intersection;

public class Line {
    int k;
    int b;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other) {
        int x , y;

        try {
            x = (other.b - this.b)/(this.k - other.k);
            y = this.k * x + this.b;
        }catch (ArithmeticException e){
            return null;
        }

        return new Point(x,y);
    }

}
