public class Fraction {
    // instance variables
    private int numerator;
    private int denominator;

    // constructor
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator; 
        this.denominator = denominator; 
    }
    
    // set methods
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    
    public void setDenominator(int denominator) {
        this.denominator = denominator; 
    }
    
    
    // get methods
    public int getNumerator() {
        return numerator;
    }
    
    public int getDenominator() {
        return denominator;
    }

    // adding, multiplying, subtraction, dividing methods for both uncommon and mixed numbers

    public Fraction addition(Fraction otherFraction) {
        // a/b + c/d == (ad + bc)/bd

        numerator = numerator * otherFraction.getDenominator() + denominator * otherFraction.getNumerator(); 
        denominator = denominator * otherFraction.getNumerator();  
        return this;
    }

    public Fraction subtraction(Fraction otherFraction) {
        // a/b - c/d == (AD - BC) / BD
        numerator = numerator * otherFraction.getDenominator() - denominator * otherFraction.getNumerator(); 
        return this;
    }

    public Fraction multiplying(Fraction otherFraction) {
        numerator *= otherFraction.getNumerator();
        denominator *= otherFraction.getDenominator();
        return this;
    }

    public Fraction dividing(Fraction otherFraction) {
        numerator *= otherFraction.getDenominator();
        denominator *= otherFraction.getNumerator();        
        return this;
    }
}









// public class Test
// {
//     // Recursive method to return gcd of a and b
//     static int gcd(int a, int b)
//     {
//         if (a == 0) {
//             return b;
//         }
//         return gcd(b % a, a);
//     }
     
//     // method to return LCM of two numbers
//     static int lcm(int a, int b)
//     {
//         return (a / gcd(a, b)) * b;
//     }
     
//     // Driver method
//     public static void main(String[] args)
//     {
//         int a = 15, b = 20;
//         System.out.println("LCM of " + a + " and " + b + " is " + lcm(a, b));
//     }
// }