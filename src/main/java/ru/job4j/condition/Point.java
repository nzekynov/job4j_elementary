package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double stepOne = x2 - x1;
        double stepTwo = y2 - y1;
        double stepThree = Math.pow(stepOne, 2);
        double stepFour = Math.pow(stepTwo, 2);
        double stepFive = stepThree + stepFour;
        double rsl = Math.sqrt(stepFive);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = Point.distance(1, 2, 3, 4);
        System.out.println("result (1, 2) to (3, 4) " + result2);
    }
}
