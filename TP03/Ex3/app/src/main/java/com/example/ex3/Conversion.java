package com.example.ex3;

public class Conversion {

    public static final double degreeToFahrenheit(double degree) {
        return Math.round((degree * (9.0f / 5.0f)) + 32.0f);
    }

    public static final double fahrenheitToDegree(double fahrenheit) {
        return Math.round((fahrenheit - 32.f) * (5.0f / 9.0f));
    }
}
