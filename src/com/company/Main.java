package com.company;

import org.jetbrains.annotations.Contract;

import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int entree1;
        System.out.println("Bienvenue dans ce jeu  épique!!!\n");
        System.out.println("Choississez votre mode :\n 1: 1 joueur\n 2: 2 joueurs\n");
        entree1= sc.nextInt();

        if (entree1==1){
            Joueur1 joueur1= new Joueur1();
            joueur1.choisirClassePersonnage();
        }else {
            Joueur1 joueur1= new Joueur1();
            joueur1.choisirClassePersonnage();
            Joueur2 joueur2 = new Joueur2();
            joueur2.choisirClassePersonnage();
        }

        System.out.println("Bonjour ");

    }
}