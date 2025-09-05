package tech.zeta.java.junit;

public class MyClass {
    void riskyMethod(){
        throw new IllegalArgumentException("Expected Message");
    }
}
