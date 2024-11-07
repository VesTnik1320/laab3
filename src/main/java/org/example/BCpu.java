package org.example;
import static java.lang.Math.sqrt;
public class BCpu implements ICpu {
    public static BCpu build() {
        return new BCpu();
    }
    @Override
    public void exec(Command c) {
    }
}