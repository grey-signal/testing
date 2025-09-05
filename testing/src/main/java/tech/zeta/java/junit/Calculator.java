package tech.zeta.java.junit;

public class Calculator {
    public double sum(double first,double second){
        return first+second;
    }
    public double difference(double first,double second){
        return first-second;
    }
    public double product(double first,double second){
        return first*second;
    }

    public double division(int dividend,int divisor){
        if(divisor==0) throw  new IllegalArgumentException("Can't divide by 0");
        return dividend/divisor;
    }

    public boolean isPositive(double value){
        return value>0;
    }

    public boolean isNegative(double value){
        return value<0;
    }
}
