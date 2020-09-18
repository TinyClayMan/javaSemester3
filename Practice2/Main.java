package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius");
        double r = scan.nextDouble();

        //1
        Circle roundThing = new Circle();
        roundThing.setR(r);
        System.out.println("D = " + roundThing.getD());
        System.out.println("S = " + roundThing.getS());
        System.out.println("P = " + roundThing.getP());
        System.out.println("-------------");

        //3
        Book newBook = new Book();
        newBook.setAuthor("Pierre Menard");
        newBook.setName("Quixote");
        newBook.setCountry("Argentina");
        newBook.setReleaseDate("05.1939");
        System.out.println(newBook.getOverview());

        //2
        Human mcUrist = new Human();
        Head mcUristHead = new Head();
        mcUristHead.setFeel("Drowsy");
        mcUristHead.setVision("lost");
        Body mcUristBody = new Body();
        mcUristBody.setHunger("Starving");
        mcUristBody.setThirst("Dehydrated");
        mcUristBody.setLungs("Cannot breathe");
        Hands mcUristHands = new Hands();
        mcUristHands.setAbilityGrasp("lost");
        Feet mcUristFeet = new Feet();
        mcUristFeet.setAbilityStand("lost");
        mcUrist.setHead(mcUristHead);
        mcUrist.setBody(mcUristBody);
        mcUrist.setHands(mcUristHands);
        mcUrist.setFeet(mcUristFeet);
        System.out.println(mcUrist.getStatus());
    }
}
