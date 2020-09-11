package com.company;
import java.util.Random;

public class Main {
    public static int fact (int number) {
        Random random = new Random();
        int factorial=1;
        for (int k = 1; k < number; k++) {
            factorial *= k;
        }
        return factorial;
    }

    public static void main(String[] args) {
        /*
        int sum1=0, sum3=0;
        double sum2=0;
        Random random = new Random();
        int size = random.nextInt(10);
        int[] array1 = new int[size];
        double[] array2 = new double[size];
        int[] array3 = new int[size];

        for (int x=0; x<size; x++) {
            array1[x] = random.nextInt();
            sum1+=array1[x];
        }
        int x=0;
        while (x<size) {
            array2[x] = Math.random();
            sum2+=array2[x];
            x++;
        }

        x=0;
        do {
            array3[x] = random.nextInt();
            sum3+=array3[x];
            x++;
        } while (x<size);

        System.out.println("Size = " + size);
        //String message = String.format("");
        System.out.println("Sum1 = " + sum1);
        System.out.println("Sum2 = " + sum2);
        System.out.println("Sum3 = " + sum3 + "\n");

        //4
        int counter=0;
        for (String str : args) {
            System.out.println("Arg = " + counter++ + str);
        }
        System.out.println("\n");

        //5
        //String harmonicSeries="";
        for (double i=1; i<=10; i++) {
            //harmonicSeries = harmonicSeries.concat("1/" + Integer.toString(i) + " ");
            System.out.printf("%.2f ", 1/i);
        }
        //System.out.println(harmonicSeries + "\n");
        System.out.println("\n");

        //6
        for (int j=0; j<size; j++) {
            System.out.println(array2[j] + " ");
        } //Math.random
        for(int i=0; i < size; i++){
            for(int j=1; j < (size-i); j++){
                if(array2[j-1] > array2[j]){
                    double temp = array2[j-1];
                    array2[j-1] = array2[j];
                    array2[j] = temp;
                }
            }
        }
        System.out.println("\nSorted:");
        for (int j=0; j<size; j++) {
            System.out.println(array2[j] + " ");
        }
        System.out.println("\n");

        for (int j=0; j<size; j++) {
            System.out.println(array1[j] + " ");
        } //Random
        for(int i=0; i < size; i++){
            for(int j=1; j < (size-i); j++){
                if(array1[j-1] > array1[j]){
                    int temp = array1[j-1];
                    array1[j-1] = array1[j];
                    array1[j] = temp;
                }
            }
        }
        System.out.println("\nSorted:");
        for (int j=0; j<size; j++) {
            System.out.println(array1[j] + " ");
        }
        System.out.println("\n");

        //7
        System.out.println("Factorial Sum = " + fact(random.nextInt(10)) + "\n");
        */

        Dog funnyYellowDog = new Dog();
        funnyYellowDog.setAge(12);
        funnyYellowDog.setName("Bark");
        Dog shibaInu = new Dog();
        shibaInu.setAge(2);
        shibaInu.setName("Shiben");
        Kennel smallKennel = new Kennel(2);
        smallKennel.addDogs(funnyYellowDog);
        smallKennel.addDogs(shibaInu);
        smallKennel.getDog(1);
    }
}

