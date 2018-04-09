package ToolKit;

import Chapter_13.Complex;
import Chapter_19.GenericMatrix;

public class ComplexMatrix extends GenericMatrix<Complex> {
    @Override
    protected Complex add(Complex o1, Complex o2) {
        return o1.add(o2);
    }

    @Override
    protected Complex multiply(Complex o1, Complex o2) {
        return o1.multiply(o2);
    }

    @Override
    protected Complex zero() {
        return new Complex(0,0);
    }
}
