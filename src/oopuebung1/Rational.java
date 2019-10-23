package oopuebung1;
import java.util.Scanner;

public final class Rational {

    // constants
    public static final String DELIMITER = "/";       // "Bruchstrich"
    private static final long PRECISION = 10000000L;  // definiert Anzahl Nachkommastellen bei "double"

    private long numerator;     // zaehler
    private long denominator;   // nenner

    private static long gcd(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a < b)
            return gcd(b, a);
        if (b == 0)
            return a; // Null wird von jeder Zahl geteilt
        long c = 1;
        while (c != 0) {
            c = a % b;
            a = b;
            b = c;
        }
        return a;
    }


    /**
     * Kürzt den Bruch und stellt sicher, dass Nenner positiv ist.
     * Attribut numerator und denominator darf modifiziert werden.
     */
     void norm() {
        long gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /=gcd;
        if (denominator <0){
            numerator = -numerator;
            denominator = -denominator;
        }
    }


    // Konstruktoren

    public Rational(){
        numerator = 0;
        denominator = 1;
    }

    public Rational(long num, long den) {
        numerator = num;
        denominator = den;
    }

    public Rational(long val) {
        this(val, 1);
    }

    public Rational(double val) {
        // Mit "this" lässt sich (anderer) Konstruktor aufrufen!!!
        this((long) (val * PRECISION), PRECISION);
    }

    public Rational(String val) {
        Scanner scanner = new Scanner(val).useDelimiter(DELIMITER);
        numerator = scanner.nextLong();
        denominator = scanner.nextLong();
        norm();
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public double doubleValue() {
        return numerator/denominator;
    }

    public String toString() {
        return numerator + DELIMITER + denominator;
    }

    public Rational negate() {
        return new Rational(-numerator,denominator);
    }

    public Rational invert() {
        return new Rational(denominator, numerator);
    }

    public Rational add(Rational val) {
        return new Rational(this.numerator*val.denominator+this.denominator*val.numerator, this.denominator*val.denominator);
    }

    public Rational subtract(Rational val) {
        return add(val.negate());
    }

    public Rational multiply(Rational val) {
        return new Rational(this.numerator * val.numerator, this.denominator* val.denominator);
    }

    public Rational divide(Rational val) {
        return multiply(val.invert());

    }

}

