package tech.zeta.java.junit;

public class NumberChecker {
    boolean isEven(int number){ return number%2==0; }

    boolean isOdd(int number){ return number%2!=0; }

    boolean isPrime(int number){
        if(number==1) return false;
        for( int divisor=2; divisor<= Math.sqrt(number); ++number){
            if(number%divisor==0) return  false;
        }
        return true;
    }
    boolean isSquare(int number){
        return (int) (Math.sqrt(number)) + (int) (Math.sqrt(number)) == number);
    }

    

}
