package com.company;

import org.jetbrains.annotations.Contract;

import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int entier = 0;
        System.out.println("Bienvenue dans ce jeu  épique!!!\n Création du personnage Joueur1\n");

        do {
            System.out.println("Veuillez choisir la classe de votre personnage (1: Guerrier,  2: Rodeur, 3: Mage) \n");
            entier = sc.nextInt();

            switch (entier) {
                case 1:
                    Guerrier GuerrierUn = new Guerrier();
                    GuerrierUn.toString();
                    break;
                case 2:
                    Rodeur RodeurUn = new Rodeur();
                    RodeurUn.toString();
                    break;
                case 3:
                    Mage MageUn = new Mage();
                    MageUn.toString();
                    break;
                default:
                    System.out.println("Vous avez choisi un personnage Inconnu!!!\n");
                    break;

            }
        }
        while ((entier != 1) && (entier != 2) && (entier != 3));
    }
}