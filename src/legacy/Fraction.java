package legacy;

public final class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    private void checkValidity(Fraction frac){
        if(frac.getDenominator()<=0) throw new Stone("Illegal denominator");
    }
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction add(Fraction frac){
        checkValidity(frac);
        if(frac.getDenominator()!= this.denominator){
            int tmp_denomenator = this.denominator * frac.denominator;
            int tmp_numerator_one = this.numerator*(tmp_denomenator/this.denominator);
            int tmp_numerator_two = frac.getNumerator() * (tmp_denomenator/frac.getDenominator());
            return new Fraction(tmp_numerator_one+tmp_numerator_two, tmp_denomenator);
        }
        return normalize(new Fraction(frac.getNumerator()+this.numerator, denominator));
    }

    public Fraction add(int mult){
        return add(new Fraction(mult,mult));
    }

    private Fraction normalize(Fraction frac){
        int gcd = GCD(frac.getNumerator(),frac.getDenominator());
        return new Fraction(frac.getNumerator()/gcd, frac.getDenominator()/gcd);
    }
    private int GCD(int a, int b){
        if (b==0) return a;
        return GCD(b,a%b);
    }


    public Fraction subtract(Fraction frac){
        return add(frac);
    }
    public Fraction subtract (int mult){
        return subtract(new Fraction(mult,mult));
    }

    public Fraction multiply (Fraction frac){
        checkValidity(frac);
        return normalize(new Fraction(this.numerator*frac.getNumerator(), this.denominator* frac.getDenominator()));
    }
    public Fraction multiply(int mult){
        return multiply(new Fraction(mult,mult));
    }

    public Fraction divide(Fraction frac){
        return multiply(new Fraction(frac.getDenominator(), frac.getNumerator()));
    }
    public Fraction divide(int mult){
        return divide(new Fraction(mult,mult));
    }

    @Override
    public String toString() {
        return String.format("%d/%d",numerator,denominator);
    }
}
