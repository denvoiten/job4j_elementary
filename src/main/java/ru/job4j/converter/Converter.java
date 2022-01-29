package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70f;
    }

    public static float rubleToDollar(float value) {
        return value / 60f;
    }

    public static void main(String[] args) {
        float inEu = 140;
        float inDol = 120;
        float expected = 2;
        float outEu = Converter.rubleToEuro(inEu);
        float outDol = Converter.rubleToDollar(inDol);
        boolean passedEu = expected == outEu;
        boolean passedDol = expected == outDol;
        System.out.println(inEu + " rubles are 2. Test result : " + passedEu);
        System.out.println(inDol + " rubles are 2. Test result : " + passedDol);
    }
}
