import java.util.concurrent.Callable;

public class Complex {
    private double real;
    private double imaginary;

    //constructor
    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    //Setter-Mutator(mevcut olan instance değişkenlerimize değer atamak icin )
    public void setReal(){
        this.real = real;
    }
    public void setImaginary(){
        this.imaginary = imaginary;
    }

    //Getter-Accessor
    public double getReal(){
        return  this.real;
    }
    public double getImaginary(){
        return this.imaginary;
    }
    //Instance Methods
    public Complex plus(Complex other){
        double sumReal = this.real + other.real;
        double sumImaginary = this.imaginary + other.imaginary;
        return new Complex(sumReal, sumImaginary);
    }

    public static void main(String[] args) {
        Complex a = new Complex(1.0, 2.0);
        Complex b = new Complex(2.0, -1.0);
        Complex c = a.plus(b);

            }
        }

