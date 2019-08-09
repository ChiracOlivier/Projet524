package com.company;

import java.util.Scanner;

public class Joueur {
    public Joueur() {

        System.out.println("Veuillez choisir la classe de votre personnage (1: Guerrier,  2: Rodeur, 3: Mage) ");

    }


    public void classePersonnage() {
        int entree2;
        Scanner sc= new Scanner(System.in);
        entree2 = sc.nextInt();

        do {

            switch (entree2) {
                case 1:
                    Guerrier GuerrierUn = new Guerrier();
                    GuerrierUn.caractéristiquesPersonnage();
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
                    System.out.println("Vous avez choisi un personnage Inconnu!!! Veuillez choisir (1: Guerrier,  2: Rodeur, 3: Mage) \n");
                    break;

            }
        }
        while ((entree2 != 1) && (entree2 != 2) && (entree2 != 3));
    }

    public void caractéristiquesPersonnage() {

        System.out.println("Niveau du personnage ?");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
