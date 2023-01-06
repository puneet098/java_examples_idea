package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        boolean isAlien = false;
        if(!isAlien)
            System.out.println("It is not a alien");
            System.out.println("and I am scared of aliens");

        Integer topScore = 100;
        if(topScore >= 100)
            System.out.println("Wow! you got the top score");

        //And operator
        topScore = 80;
        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore < 100)
            System.out.println("Greater than second top score and less than 100");
        //OR Operator
        secondTopScore=81;
        if((topScore > 90) || (topScore < 90))
            System.out.println("Either or both conditions are true");
        //Assigment & Equals to operator
        boolean isCar = false;
        if(!isCar)
            System.out.println("This is suppose to happen");
    }

}