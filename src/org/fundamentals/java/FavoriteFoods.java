package org.fundamentals.java;



public class FavoriteFoods {
    public static void main(String[] args) {
        String[] arrayfods ={"pizza","pasta al sugo","arancini","carbonara","bistecca"};

        System.out.println("La classifica è lunga: "+ arrayfods.length);
        System.out.println("al top in classifica abbiamo: "+ arrayfods[0]);
        System.out.println("al ultimo posto in classifica  abbiamo: "+ arrayfods[arrayfods.length-1]);
        System.out.println("al centro della classifica  abbiamo: "+ arrayfods[(arrayfods.length-1)/2]);
    }
}
