package org.fundamentals.java;

import java.util.Scanner;

public class BigliettoTreno {
    public static void main(String[] args) {
        int age;
        int distance;
        double price;
        double discount;

        Scanner in = new Scanner(System.in);

        System.out.print("Inserire l\'età: ");
        age = Integer.parseInt(in.nextLine());

        System.out.print("Inserire la distanza in km: ");
        distance = Integer.parseInt(in.nextLine());

        price= distance * 0.21;

        if(age<18){
            discount=price*20/100;
            price=price-discount;
        }
        else if (age>=65){
            discount=price*40/100;
            price=price-discount;
        }

        System.out.println((float)price);
    }
}
