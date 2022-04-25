package com.company;

public class Main {

    public static void main(String[] args) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition;

        //x(t) = 0.5 × a(t^2) + v(t) + x
        finalPosition = (0.5 * (gravity * fallingTime * fallingTime)) + initialVelocity + initialPosition;
        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");
    }
}
