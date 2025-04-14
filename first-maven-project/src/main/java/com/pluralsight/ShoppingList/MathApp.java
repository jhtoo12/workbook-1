package com.pluralsight.ShoppingList;

public class MathApp {
    public static void main(String[] args) {
 //     1.
        int garySalary = 30_000;
        int bobSalary = 40_000;
        int highestSalary = Math.max(garySalary, bobSalary);
        System.out.println("The highest salary " + bobSalary);
//      2.
        int carPrice = 15_000;
        int truckPrice = 30_000;
        int smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println ("the smallest price:" + smallestPrice);
//      3.
        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is " + area);
//      4.
        double myVariable = 5.0;
        double sqRoot = Math.sqrt(myVariable);
        System.out.println("The square root after being set to 5 is " + sqRoot);
//      5.
        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;

        double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.println("The distance between the two point is: " + distance);
 //     6.
        int variable = (int) - 3.8;
        int absoluteValue;
        if (variable < 0) {
            absoluteValue = -variable;
        }else {
            absoluteValue = variable;
            System.out.println("Absolute value: " + absoluteValue);
            //     7.
            double randomNum = Math.random();
            System.out.println("Random number between 0 and 1: " + randomNum);

        }



    }
}

