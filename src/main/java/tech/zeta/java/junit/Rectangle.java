package tech.zeta.java.junit;


public class Rectangle {

    double calculateArea(double length, double width) {
        if (length <= 0 || width <= 0) throw new IllegalArgumentException("Dimensions must be > 0");
        return length * width;
    }

}
