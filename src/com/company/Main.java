package com.company;

//import org.jetbrains.annotations.Contract;

import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int entree1;
        System.out.println("Création du personnage du Joueur1 ...");

        Joueur joueur1 = new Joueur();
        joueur1.classePersonnage();

        System.out.println("Création du personnage du Joueur2 ...");

        Joueur joueur2 = new Joueur();
        joueur2.classePersonnage();

    }
}