package com.company;

import org.jetbrains.annotations.Contract;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int entree1 = 0,entree2= 0;
        System.out.println("Bienvenue dans ce jeu  épique!!!\n");
        System.out.println("Choississez votre mode :\n 1: 1 joueur\n 2: 2 joueurs\n");

        if (entree1==1){
            Joueur1 joueur1= new Joueur1();
        }else {
            Joueur1 joueur1= new Joueur1();
            Joueur2 joueur2 = new Joueur2();
        }

        do {
            System.out.println("Veuillez choisir la classe de votre personnage (1: Guerrier,  2: Rodeur, 3: Mage) \n");
            entree2 = sc.nextInt();

            switch (entree2) {
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
        while ((entree2 != 1) && (entree2 != 2) && (entree2 != 3));
    }
}