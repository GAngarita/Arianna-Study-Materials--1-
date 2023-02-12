public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator; 
        this.denominator = denominator; 
    }
    
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    
    public void setDenominator(int denominator) {
        this.denominator = denominator; 
    }
    
    public int getNumerator() {
        return numerator;
    }
    
    public int getDenominator() {
        return denominator;
    }

    public Fraction addition(Fraction otherFraction) {
        int num = numerator * otherFraction.getDenominator() + denominator * otherFraction.getNumerator(); 
        int denom = denominator * otherFraction.getDenominator();  
        return new Fraction(num, denom); 
    }

    public Fraction subtraction(Fraction otherFraction) {
        int num = numerator * otherFraction.getDenominator() - denominator * otherFraction.getNumerator(); 
        int denom = denominator * otherFraction.getDenominator(); 
        return new Fraction(num, denom);
    }

    public Fraction multiplying(Fraction otherFraction) {
        int num = numerator*otherFraction.getNumerator();
        int denom = denominator*otherFraction.getDenominator();

        return new Fraction(num, denom);
    }

    public Fraction dividing(Fraction otherFraction) {
        int num = numerator*otherFraction.getDenominator();
        int denom = denominator*otherFraction.getNumerator();        
        return new Fraction(num, denom); 
    }
}