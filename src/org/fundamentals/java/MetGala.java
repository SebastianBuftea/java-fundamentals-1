package org.fundamentals.java;

import java.util.Scanner;

public class MetGala {
    public static void main(String[] args) {
        String name;
        boolean confirmation=false;
        String[] arrayInvitates ={"Jennifer Lopez","Zendaya","Chris Hemsworth","Bad Bunny","Cara Delevingne","Kendall Jenner","Uma Thurman","Damiano David","Luca Guadagnino"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserire il nome");
        name = scanner.nextLine();

       for(int i=0; i<arrayInvitates.length; i++){
            if (arrayInvitates[i].equals(name)) {
                confirmation = true;
            }
        }
        if (confirmation==true){
            System.out.println("puoi entrare");
        }
        else{
            System.out.println("non spuoi entrare");
        }

    }
}
