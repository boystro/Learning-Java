package ComplexNumberAdd;


public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(4, 6);
        Complex c2 = new Complex(7, 8);
        Complex c3 = Complex.add(c1, c2);

        System.out.printf("%d+%di + %d+%di = %d+%di", c1.getReal(), c1.getImaginary(), c2.getReal(), c2.getImaginary(), c3.getReal(), c3.getImaginary() );
    }
}

class Complex {
    private int real;
    private int imaginary;

    // Class Constructor
    Complex() { this.real = this.imaginary = 0; }

    // Class Constructor Overload
    Complex(int r, int i) {
        this.real = r;
        this.imaginary = i;
    }

    public static Complex add(Complex first, Complex second) {
        return new Complex( first.real + second.real, first.imaginary + second.imaginary );
    }

    public int getReal() { return this.real; }
    public int getImaginary() { return this.imaginary; }
    
}