package com.internshala.assignment2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("Tax Calculator App");
        System.out.println("-----WELCOME-----");

        Scanner scanner = new Scanner(System.in);

        int numberOfPerson;
        System.out.println("Enter total person count: ");
        numberOfPerson = scanner.nextInt();
        System.out.println();

        String[] name = new String[numberOfPerson];
        long[] incomes = new long[numberOfPerson];

        for (int i = 0; i < numberOfPerson; i++) {

            System.out.println("Enter name " + (i + 1) + " : ");
            name[i] =scanner.next();

            System.out.println("Enter " + name[i] + "'s  Annual Income:");
            incomes[i] = scanner.nextLong();

            System.out.println();
        }
        scanner.close();

        System.out.println("Names with liable taxes");
        System.out.println("------------------------");
        for (int i = 0; i <= numberOfPerson; i++){
            try {
                calculateTax(name[i], incomes[i]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println();
            }
        }
    }


    public static void calculateTax( String name,long income){
        long taxAmount=0;
        if(income>=300000){
            taxAmount = (int) (income * 0.2);
        }else if(income>=100000){
            taxAmount = (int)(income*0.1);
        }else if(income<100000){
            taxAmount = (int)(income*0);
        }else{
            System.out.println("invalid");
        }

        System.out.println(" " + name +" : "+ '\u20B9' + " " + taxAmount);

    }

}
