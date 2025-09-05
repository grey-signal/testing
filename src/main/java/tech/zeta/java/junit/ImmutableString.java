package tech.zeta.java.junit;

public class ImmutableString {
    private final String value;

    public ImmutableString(String value){
            this.value=value;
    }

    public ImmutableString toUpperCase(){
            return new ImmutableString(this.value.toUpperCase());
    }
    public String getValue(){
        return value;
    }

}
