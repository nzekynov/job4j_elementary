package ru.job4j.calculator;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollars = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollars + " dollars.");

        float in = 140;
        float expected1 = 2;
        float out1 = Converter.rubleToEuro(in);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2. Test result : " + passed1);

        float expected2 = 2.3333333f;
        float out2 = Converter.rubleToDollar(in);
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles are 2.3333333. Test result : " + passed2);
    }
}
